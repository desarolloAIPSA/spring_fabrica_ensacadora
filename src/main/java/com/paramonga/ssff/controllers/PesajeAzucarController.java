package com.paramonga.ssff.controllers;


import com.paramonga.ssff.entities.PesajeAzucar;
import com.paramonga.ssff.functions.PesajeAzucarFunction;
import com.paramonga.ssff.mapper.PesajeAzucarMapper;
import com.paramonga.ssff.model.PesajeAzucarModel;
import com.paramonga.ssff.services.impl.PesajeAzucarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pesaje")
public class PesajeAzucarController {

    @Autowired
    private PesajeAzucarServiceImpl service;

    @Autowired
    private PesajeAzucarFunction function;

    @PostMapping("/crear")
    public ResponseEntity<PesajeAzucar> createPesajeAzucar(@RequestBody PesajeAzucarMapper input){
        PesajeAzucar respuesta = function.retornarValor(input);
        PesajeAzucar consultar = service.createPesajeAzucar(respuesta);
        return new ResponseEntity<PesajeAzucar>(consultar, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<PesajeAzucar> getByDateRangeRegistro(@RequestBody PesajeAzucar variableMapper){
        return new ResponseEntity<PesajeAzucar>(service.obtenerId(variableMapper), HttpStatus.OK);
    }


    @GetMapping("/rango")
    public ResponseEntity<PesajeAzucarModel> getRangoFechaCodBal(@RequestParam("page") int page, @RequestParam("size") int size, @RequestParam("fecIni") String fechaInicio, @RequestParam("fecFin") String fechaFin) {
        PesajeAzucarModel balanzaModel = new PesajeAzucarModel();
        Page<PesajeAzucar> consulta = service.filtroByRange(fechaInicio,fechaFin,page,size);
        balanzaModel.setNumberOfElements(consulta.getNumberOfElements());
        balanzaModel.setTotalElements(consulta.getTotalElements());
        balanzaModel.setTotalPages(consulta.getTotalPages());
        balanzaModel.setPageNumber(consulta.getPageable().getPageNumber());
        List<PesajeAzucar> pesosList = consulta.getContent();
        List<PesajeAzucarMapper> respuesta= function.convertirPlano(pesosList);
        balanzaModel.setContent(respuesta);
        return new ResponseEntity<PesajeAzucarModel>(balanzaModel, HttpStatus.OK);
    }

    @GetMapping("/ultimos")
    public ResponseEntity<PesajeAzucarModel> getTodos(@RequestParam("page") int page, @RequestParam("size") int size) {
        PesajeAzucarModel balanzaModel = new PesajeAzucarModel();
        Page<PesajeAzucar> consulta = service.obtenerTodos(page,size);
        balanzaModel.setNumberOfElements(consulta.getNumberOfElements());
        balanzaModel.setTotalElements(consulta.getTotalElements());
        balanzaModel.setTotalPages(consulta.getTotalPages());
        balanzaModel.setPageNumber(consulta.getPageable().getPageNumber());
        List<PesajeAzucar> pesosList = consulta.getContent();
        List<PesajeAzucarMapper> respuesta= function.convertirPlano(pesosList);
        balanzaModel.setContent(respuesta);
        return new ResponseEntity<PesajeAzucarModel>(balanzaModel, HttpStatus.OK);
    }



}
