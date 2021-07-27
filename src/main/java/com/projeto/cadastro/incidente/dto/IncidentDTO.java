package com.projeto.cadastro.incidente.dto;

import java.io.Serializable;
import java.time.Instant;

import com.projeto.cadastro.incidente.entities.Incident;

public class IncidentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long idIncident;
	private String name;
	private String description;
	private Instant createdAt;
	private Instant updatedAt;
	private Instant closedAt;
	
	public IncidentDTO() {
		
	}

	//construtor recebendo entidade incident
	public IncidentDTO(Incident entity) {
		idIncident = entity.getIdIncident();
		name = entity.getName();
		description = entity.getDescription();
		createdAt = entity.getCreatedAt();
		updatedAt = entity.getUpdatedAt();
		closedAt = entity.getClosedAt();
	}

	public Long getIdIncident() {
		return idIncident;
	}

	public void setIdIncident(Long idIncident) {
		this.idIncident = idIncident;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Instant getClosedAt() {
		return closedAt;
	}

	public void setClosedAt(Instant closedAt) {
		this.closedAt = closedAt;
	}
	
	
	
	

}
