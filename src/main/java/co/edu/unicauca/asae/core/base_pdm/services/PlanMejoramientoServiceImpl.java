package co.edu.unicauca.asae.core.base_pdm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.edu.unicauca.asae.core.base_pdm.models.PlanMejoramiento;
import co.edu.unicauca.asae.core.base_pdm.repositories.PlanMejoramientoRepository;

/**
 * PlanMejoramientoServiceImpl
 */
@Service
public class PlanMejoramientoServiceImpl implements IPlanMejoramiento {

    @Autowired
    private PlanMejoramientoRepository servicioAccesoBDPLanM;

    @Override
    @Transactional(readOnly = true)
    public List<PlanMejoramiento> findAll() {
        return servicioAccesoBDPLanM.findAll();
    }

    @Override
    @Transactional
    public PlanMejoramiento save(PlanMejoramiento plan) {
        return servicioAccesoBDPLanM.save(plan);
    }
    
}