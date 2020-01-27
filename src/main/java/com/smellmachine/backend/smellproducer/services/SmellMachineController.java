package com.smellmachine.backend.smellproducer.services;


import java.util.concurrent.atomic.AtomicLong;
import com.smellmachine.backend.smellproducer.dto.SmellResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class SmellMachineController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/getSmell")
	public SmellResponseDTO getSmell() {
		return new SmellResponseDTO(counter.incrementAndGet(), "Smells:  " + getRandomColor());
	}

	private String getRandomColor()
	{
		Random r = new Random();
		return getColorFromInt(r.nextInt((3 - 1) + 1) + 1);
	}


	private String getColorFromInt(int colorNum)
	{
		switch(Integer.valueOf(colorNum))
		{
			case 1: return "Red";
			case 2: return "Green";
			case 3: return "Blue";
		}
		return "Unexpected Color!!!!!";
	}
}