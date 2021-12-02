package com.dma.ingestor.dto;

public class StatusResponseDTO {
	
	private String status;

	public static  class Builder {
		private String status;
		
		public Builder(String status) {
            this.status = status;
        }
		
		public StatusResponseDTO build() {
			StatusResponseDTO statusResponseDTO = new StatusResponseDTO();
            statusResponseDTO.setStatus(status);
            return statusResponseDTO;
		}

	}
	
	private StatusResponseDTO () {}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
