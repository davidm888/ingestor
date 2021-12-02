package com.dma.ingestor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dma.ingestor.dto.HealthCheckResponseDTO;
import com.dma.ingestor.dto.StatusRequestDTO;
import com.dma.ingestor.dto.StatusResponseDTO;
import com.dma.ingestor.repository.IngestorRepository;
import com.google.gson.Gson;

@Service
public class IngestorService {
	
	@Autowired
	Gson gson;
	
	@Autowired
	IngestorRepository ingestorRepository;
	
	public String healthCheck() {
		HealthCheckResponseDTO response = new HealthCheckResponseDTO.Builder("OK").withVersion("1.0.0").build();
		return gson.toJson(response);
	}
	
	public String getStatus() {
		StatusResponseDTO response = new StatusResponseDTO.Builder("active").build();
		return gson.toJson(response);
	}
	
	public String setStatus(StatusRequestDTO statusRequestDTO) {
		StatusResponseDTO response = new StatusResponseDTO.Builder(statusRequestDTO.getStatus()).build();
		return gson.toJson(response);
	}
	
	public String getReport() {
		return gson.toJson(ingestorRepository.getReport());
	}
	
	public void processFile() {
		
	}
	
}
