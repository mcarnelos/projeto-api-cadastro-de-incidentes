package com.projeto.cadastro.incidente.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.cadastro.incidente.dto.IncidentDTO;
import com.projeto.cadastro.incidente.services.IncidentService;

@RestController
@RequestMapping(value = "/incidents")
public class IncidentResource {
	
	@Autowired
	private IncidentService service;

	//busca os incidentes
	@GetMapping
	public ResponseEntity<List<IncidentDTO>> findAll(){
		List<IncidentDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//metodo que retorna os incidentes por id
		@GetMapping(value = "/{id}")
		public ResponseEntity<IncidentDTO> findById(@PathVariable Long id){
			IncidentDTO dto = service.findById(id);
			return ResponseEntity.ok().body(dto);
		}
	
	//inserindo incidente no bd
		@PostMapping
		public ResponseEntity<IncidentDTO> insert(@RequestBody IncidentDTO dto){
			IncidentDTO newDTO = service.insert(dto);
			return ResponseEntity.ok().body(newDTO);
		}
		
		
}
