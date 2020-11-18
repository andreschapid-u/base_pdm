package co.edu.unicauca.asae.core.base_pdm.services;

import java.util.List;

import co.edu.unicauca.asae.core.base_pdm.models.PlanMejoramiento;

public interface IPlanMejoramiento {
    

    public List<PlanMejoramiento> findAll() ;
    public PlanMejoramiento save(PlanMejoramiento plan) ;
}