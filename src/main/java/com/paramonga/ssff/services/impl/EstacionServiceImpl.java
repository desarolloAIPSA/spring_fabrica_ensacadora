package com.paramonga.ssff.services.impl;

import com.paramonga.ssff.entities.Estacion;
import com.paramonga.ssff.repositories.DatosRepository;
import com.paramonga.ssff.repositories.EstacionRepository;
import com.paramonga.ssff.services.EstacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionServiceImpl implements EstacionService {
    @Autowired
    private EstacionRepository repository;


    @Override
    public List<Estacion> getAll() {
        return repository.getAll();
    }
}
