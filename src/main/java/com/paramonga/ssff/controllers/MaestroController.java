package com.paramonga.ssff.controllers;


import com.paramonga.ssff.entities.EnsacadoraMaestro;
import com.paramonga.ssff.entities.Estadistica;
import com.paramonga.ssff.entities.PesajeAzucar;
import com.paramonga.ssff.entities.VaNomMaestro;
import com.paramonga.ssff.model.EstadisticaModel;
import com.paramonga.ssff.model.HistogramaModel;
import com.paramonga.ssff.model.VaNomMaestroModel;
import com.paramonga.ssff.services.impl.EnsacadoraMaestroServiceImpl;
import com.paramonga.ssff.services.impl.VaNomMaestroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/maestro")
public class MaestroController {

    @Autowired
    private EnsacadoraMaestroServiceImpl service01;


    @Autowired
    private VaNomMaestroServiceImpl service02;

    @GetMapping("/ensacadoras")
    public ResponseEntity<List<EnsacadoraMaestro>> getEnsacadoras(){
        List<EnsacadoraMaestro> lista = service01.obtenerTodos();
        return new ResponseEntity<List<EnsacadoraMaestro>>(service01.obtenerTodos(), HttpStatus.OK);
    }

    @GetMapping("/valorNominal")
    public ResponseEntity<List<VaNomMaestroModel>> getValoresNominales(){
        List<VaNomMaestro> lista = service02.obtenerTodos();
        List<VaNomMaestroModel> output = new ArrayList<>();

        for (VaNomMaestro abs : lista){
            VaNomMaestroModel entity = new VaNomMaestroModel();
            entity.setPresentacion(abs.getPresentacion());
            entity.setDescripcion(abs.getPresentacion()+" KG");
            output.add(entity);
        }

        return new ResponseEntity<List<VaNomMaestroModel>>(output, HttpStatus.OK);
    }


}
