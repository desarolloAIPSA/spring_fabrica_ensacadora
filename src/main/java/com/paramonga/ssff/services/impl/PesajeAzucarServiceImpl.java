package com.paramonga.ssff.services.impl;

import com.paramonga.ssff.entities.PesajeAzucar;
import com.paramonga.ssff.repositories.PesajeAzucarRepository;
import com.paramonga.ssff.services.PesajeAzucarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class PesajeAzucarServiceImpl implements PesajeAzucarService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PesajeAzucarRepository repository;

    public PesajeAzucar createPesajeAzucar(PesajeAzucar input){
        PesajeAzucar temporal = repository.obtenerSegunId(input.getId());
        boolean result = temporal!=null?true:false;
        if(result)throw new ResponseStatusException(HttpStatus.CONFLICT,String.format("Userid: %s already exist", input.getId().toString()));;
        return repository.save(input);
    }

    public PesajeAzucar obtenerId(PesajeAzucar input){
        return repository.obtenerSegunId(input.getId());
    }

    public Page<PesajeAzucar> filtroByRange(String fechaIni, String fechaFin, int page, int size) {
        return repository.obtenerTodosOrdenados(fechaIni,fechaFin, PageRequest.of(page, size));
    }

    public Page<PesajeAzucar> obtenerTodos(int page, int size) {
        return repository.obtenerTodo(PageRequest.of(page, size));
    }
}
