package com.paramonga.ssff.controllers;


import com.paramonga.ssff.entities.Estadistica;
import com.paramonga.ssff.entities.PesajeAzucar;
import com.paramonga.ssff.mapper.PesajeAzucarMapper;
import com.paramonga.ssff.model.EstadisticaModel;
import com.paramonga.ssff.model.HistogramaModel;
import com.paramonga.ssff.services.impl.EstadisticaServiceImpl;
import com.paramonga.ssff.services.impl.ProceduresServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estadstica")
public class EstadisticaController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public EstadisticaServiceImpl service;

    @Autowired
    public ProceduresServiceImpl serviceProc;

    @GetMapping
    public ResponseEntity<EstadisticaModel> getByDateRangeRegistro(@RequestParam("nro_ens") int nroEnsacadora, @RequestParam("val_nom") Double valNominal, @RequestParam("fecIni") String fechaIni, @RequestParam("fecFin") String fecFin){
        log.info("parametros:: "+nroEnsacadora+" "+valNominal+" "+fechaIni+" "+fecFin);
        Boolean respuesta = serviceProc.estadisticasEnsacadoraProc(fechaIni, fecFin, valNominal, nroEnsacadora);
        List<Estadistica> consulta = service.getEstadisticas();

            List<HistogramaModel> output = new ArrayList<>();
            EstadisticaModel modeloOut = new EstadisticaModel();
            for (Estadistica abs : consulta){
                HistogramaModel entity = new HistogramaModel();
                entity.setRangoMax(abs.getRangoMax());
                entity.setRangoMin(abs.getRangoMin());
                entity.setValor(abs.getFrecAbsoluta());
                entity.setRango("[" + abs.getRangoMin()+"-"+abs.getRangoMax()+"]");
                output.add(entity);
            }

        modeloOut.setValores(output);
        modeloOut.setVnSuma(consulta.get(0).getVnSuma());
        modeloOut.setVnProm(consulta.get(0).getVnProm());
        modeloOut.setVrSuma(consulta.get(0).getVrSuma());
        modeloOut.setVrProm(consulta.get(0).getVrProm());
        modeloOut.setVrSd(consulta.get(0).getVrSd());
        modeloOut.setVrVari(consulta.get(0).getVrVari());
        modeloOut.setCheckSi(consulta.get(0).getCheckSi());
        modeloOut.setCheckNo(consulta.get(0).getCheckNo());
        modeloOut.setPesoBajo(consulta.get(0).getPesoBajo());
        modeloOut.setPesoMedio(consulta.get(0).getPesoMedio());
        modeloOut.setPesoAlto(consulta.get(0).getPesoAlto());
        modeloOut.setTotal(consulta.get(0).getTotal());


        return new ResponseEntity<EstadisticaModel>(modeloOut, HttpStatus.OK);
    }


}
