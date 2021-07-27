package com.projeto.cadastro.incidente.services;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.cadastro.incidente.dto.IncidentDTO;
import com.projeto.cadastro.incidente.entities.Incident;
import com.projeto.cadastro.incidente.repositories.IncidentRepository;

@Service
public class IncidentService {

	@Autowired
	private IncidentRepository repository;
	
	//metodo que retorna os incidentes
	@Transactional(readOnly = true)
	public List<IncidentDTO> findAll(){
		List<Incident> list = repository.findAll();
		return list.stream().map(x -> new IncidentDTO(x)).collect(Collectors.toList());
	}
	
	//metodo que retorna os incidentes por id
	public IncidentDTO findById(Long id) {
		Optional<Incident> obj = repository.findById(id);
		Incident entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		//Incident entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new IncidentDTO(entity);
	}

	//insere um incidente
	public IncidentDTO insert(IncidentDTO dto) {
		Incident entity = new Incident();
		
		//entity.setMoment(Instant.now());
		
		entity.setName(dto.getName());
		entity.setDescription(dto.getDescription());
		entity.setCreatedAt(dto.getCreatedAt());
		entity.setUpdatedAt(dto.getUpdatedAt());
		entity.setClosedAt(dto.getClosedAt());
		
		//salva no bd
		entity = repository.save(entity);
		return new IncidentDTO(entity);
	}



	
}
