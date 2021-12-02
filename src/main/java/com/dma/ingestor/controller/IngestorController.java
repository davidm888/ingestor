package com.dma.ingestor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dma.ingestor.dto.StatusRequestDTO;
import com.dma.ingestor.service.IngestorService;


@RestController()
public class IngestorController {
	
	@Autowired
	IngestorService ingestorService;

	@GetMapping("/healthCheck")
	public String healthCheck() {
		return ingestorService.healthCheck();
	}
	
	@GetMapping("/status")
	public String getStatus() {
		return ingestorService.getStatus();
	}
	
	@PutMapping("/status")
	public String setStatus(@RequestBody StatusRequestDTO statusRequestDTO) {
		return ingestorService.setStatus(statusRequestDTO);
	}
	
	@GetMapping("/report")
	public String getReport() {
		return ingestorService.getReport();
	}

}
