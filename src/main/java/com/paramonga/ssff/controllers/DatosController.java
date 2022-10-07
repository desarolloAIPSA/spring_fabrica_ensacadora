package com.paramonga.ssff.controllers;

import com.paramonga.ssff.entities.Datos;
import com.paramonga.ssff.functions.DatosFunction;
import com.paramonga.ssff.mapper.DatosMapper;
import com.paramonga.ssff.services.impl.DatosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/metereologia")
public class DatosController {

    @Autowired
    private DatosServiceImpl service;
    @Autowired
    private DatosFunction functionDatos;

    @GetMapping(value="/byDateRange",produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<List<DatosMapper>> getListaDatos(@RequestParam("fecini")String fecini, @RequestParam("fecfin")String fecfin, @RequestParam("estacion")String estacion) throws URISyntaxException {
        try {
            List<Datos> lista= service.filtroByDateRange(fecini,fecfin,estacion);

            List<DatosMapper> respuesta= functionDatos.convertirPlano(lista);

            return Optional.ofNullable(respuesta)
                    .map(l -> new ResponseEntity<>(l, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }
}
