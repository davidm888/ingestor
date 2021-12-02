package com.dma.ingestor.repository.impl;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.dma.ingestor.dto.ReportResponseDTO;
import com.dma.ingestor.repository.IngestorRepository;

@Repository
public class IngestorRepositoryImpl implements IngestorRepository{

	@Override
	public ReportResponseDTO getReport() {
		ReportResponseDTO response = new ReportResponseDTO.Builder(10).withFileWithError(1).alLastingestion(new Date()).withProcessDomains(Long.valueOf("1000000")).build();
		return response;
	}

}
