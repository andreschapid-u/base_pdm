package co.edu.unicauca.asae.core.base_pdm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unicauca.asae.core.base_pdm.models.PlanMejoramiento;

public interface PlanMejoramientoRepository extends JpaRepository<PlanMejoramiento, String> {
  
}