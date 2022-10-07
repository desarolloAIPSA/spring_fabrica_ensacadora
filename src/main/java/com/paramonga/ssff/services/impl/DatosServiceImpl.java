package com.paramonga.ssff.services.impl;

import com.paramonga.ssff.entities.Datos;
import com.paramonga.ssff.repositories.DatosRepository;
import com.paramonga.ssff.services.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class DatosServiceImpl implements DatosService {
    @Autowired
    private DatosRepository repository;
    @Override
    public List<Datos> filtroByDateRange(String fecini, String fecfin, String estacion) {
        return repository.getByDateRange(estacion,fecini,fecfin);
    }
}
