package com.paramonga.ssff.services.impl;


import com.paramonga.ssff.entities.EnsacadoraMaestro;
import com.paramonga.ssff.repositories.EnsacadoraMaestroRepository;
import com.paramonga.ssff.services.EnsacadoraMaestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EnsacadoraMaestroServiceImpl implements EnsacadoraMaestroService {

    @Autowired
    private EnsacadoraMaestroRepository repository;

    @Override
    public List<EnsacadoraMaestro> obtenerTodos() {
        return repository.findAll();
    }
}
