package co.edu.unicauca.asae.core.base_pdm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asae.core.base_pdm.models.PlanMejoramiento;
import co.edu.unicauca.asae.core.base_pdm.repositories.PlanMejoramientoRepository;
import co.edu.unicauca.asae.core.base_pdm.services.IPlanMejoramiento;

@RestController
@RequestMapping("/api/plan")
public class PlanMejoramientoController {
    

    @Autowired
    private IPlanMejoramiento planService;

    @PostMapping("/store")
    @ResponseStatus(HttpStatus.CREATED)
    public PlanMejoramiento store(@RequestBody PlanMejoramiento planMejoramiento) {
       return this.planService.save(planMejoramiento);
    }
}