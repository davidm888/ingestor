package com.dma.ingestor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class IngestorController {

	@GetMapping("/healthCheck")
	public String healthCheck() {
		return "{version: 1.0.0, status: 'OK' }";
	}
	
	@GetMapping("/status")
	public String getStatus() {
		return "{status: active}";
	}
	
	@PutMapping("/status")
	public String setStatus() {
		return "{status: inactive}";
	}
	
	@GetMapping("/report")
	public String getReport() {
		return "{FileProcess: 10, FileWithError: 1, lastIngestion: '2021-11-26 10:11:00', DomaisProcess: 1000000}";
	}

}
