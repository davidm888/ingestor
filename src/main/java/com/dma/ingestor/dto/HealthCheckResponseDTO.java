package com.dma.ingestor.dto;

public class HealthCheckResponseDTO {
	
	private String version;
	
	private String status;

	public static  class Builder {
		private String status;
		
		private String version;
		
		public Builder(String status) {
            this.status = status;
        }
		
		public Builder withVersion(String version) {
            this.version = version;
            return this;
        }
		
		public HealthCheckResponseDTO build() {
			HealthCheckResponseDTO healthCheckResponseDTO = new HealthCheckResponseDTO();
            healthCheckResponseDTO.setVersion(version);
            healthCheckResponseDTO.setStatus(status);
            return healthCheckResponseDTO;
		}

	}
	
	private HealthCheckResponseDTO () {}
	
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
