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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    @Transactional
    public PlanMejoramiento save(PlanMejoramiento plan) {
        // TODO Auto-generated method stub
        System.out.println("llego");
        PlanMejoramiento pResult = null;
        try {
            pResult =  this.servicioAccesoBDPLanM.save(plan);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return pResult;
    }

    
}