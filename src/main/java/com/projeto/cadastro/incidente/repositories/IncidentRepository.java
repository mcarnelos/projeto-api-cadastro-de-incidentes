package com.projeto.cadastro.incidente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.cadastro.incidente.entities.Incident;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Long>{

}
