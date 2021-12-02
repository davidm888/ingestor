package com.dma.ingestor.dto;

import java.util.Date;

public class ReportResponseDTO {
	
	private Integer fileProcess;
	
	private Integer fileWithError;
	
	private Date lastIngestion;
	
	private Long domainsProcess;
	
	public static  class Builder {
		private Integer fileProcess;
		
		private Integer fileWithError;
		
		private Date lastIngestion;
		
		private Long domainsProcess;
		
		public Builder(Integer fileProcess) {
            this.fileProcess = fileProcess;
        }
		
		public Builder withFileWithError(Integer fileWithError) {
            this.fileWithError = fileWithError;
            return this;
        }
		
		public Builder alLastingestion(Date lastIngestion) {
            this.lastIngestion = lastIngestion;
            return this;
        }
		
		public Builder withProcessDomains(Long domainsProcess) {
            this.domainsProcess = domainsProcess;
            return this;
        }
		
		public ReportResponseDTO build() {
			ReportResponseDTO reportResponseDTO = new ReportResponseDTO();
            reportResponseDTO.setFileProcess(fileProcess);
            reportResponseDTO.setFileWithError(fileWithError);
            reportResponseDTO.setLastIngestion(lastIngestion);
            reportResponseDTO.setDomainsProcess(domainsProcess);
            return reportResponseDTO;
		}

	}
	
	private ReportResponseDTO () {}

	public Integer getFileProcess() {
		return fileProcess;
	}

	public void setFileProcess(Integer fileProcess) {
		this.fileProcess = fileProcess;
	}

	public Integer getFileWithError() {
		return fileWithError;
	}

	public void setFileWithError(Integer fileWithError) {
		this.fileWithError = fileWithError;
	}

	public Date getLastIngestion() {
		return lastIngestion;
	}

	public void setLastIngestion(Date lastIngestion) {
		this.lastIngestion = lastIngestion;
	}

	public Long getDomainsProcess() {
		return domainsProcess;
	}

	public void setDomainsProcess(Long domainsProcess) {
		this.domainsProcess = domainsProcess;
	}

}
