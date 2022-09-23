package com.paramonga.ssff.services.impl;

import com.paramonga.ssff.entities.Estadistica;
import com.paramonga.ssff.repositories.EstadisticaRepository;
import com.paramonga.ssff.services.EstadisticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EstadisticaServiceImpl implements EstadisticaService {

    @Autowired
    private EstadisticaRepository repository;


    @Override
    public List<Estadistica> getEstadisticas() {
        return repository.findAll();
    }
}
