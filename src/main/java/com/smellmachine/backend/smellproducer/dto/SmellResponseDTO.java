package com.smellmachine.backend.smellproducer.dto;

public class SmellResponseDTO {

	private final long id;
	private final String smellColor;

	public SmellResponseDTO(long id, String smellColor) {
		this.id = id;
		this.smellColor = smellColor;
	}

	public long getId() {
		return id;
	}

	public String getSmellColor() {
		return smellColor;
	}
}