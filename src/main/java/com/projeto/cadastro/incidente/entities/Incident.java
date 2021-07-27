package com.projeto.cadastro.incidente.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_incident")
public class Incident implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idIncident;
	private String name;
	private String description;
	private Instant createdAt;
	private Instant updatedAt;
	private Instant closedAt;
	
	public Incident() {
		
	}

	public Incident(Long idIncident, String name, String description, Instant createdAt, Instant updatedAt,
			Instant closedAt) {
		this.idIncident = idIncident;
		this.name = name;
		this.description = description;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.closedAt = closedAt;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idIncident == null) ? 0 : idIncident.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incident other = (Incident) obj;
		if (idIncident == null) {
			if (other.idIncident != null)
				return false;
		} else if (!idIncident.equals(other.idIncident))
			return false;
		return true;
	}
	
	
	

}
