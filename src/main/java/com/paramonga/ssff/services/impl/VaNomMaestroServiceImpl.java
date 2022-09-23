package com.paramonga.ssff.services.impl;


import com.paramonga.ssff.entities.VaNomMaestro;
import com.paramonga.ssff.repositories.VaNomMaestroSErviceRepository;
import com.paramonga.ssff.services.VaNomMaestroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class VaNomMaestroServiceImpl implements VaNomMaestroService {

    @Autowired
    private VaNomMaestroSErviceRepository repository;

    @Override
    public List<VaNomMaestro> obtenerTodos() {
        return repository.obtenerTodos();
    }
}
