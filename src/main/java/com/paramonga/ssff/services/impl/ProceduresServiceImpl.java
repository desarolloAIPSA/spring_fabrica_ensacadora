package com.paramonga.ssff.services.impl;

import com.paramonga.ssff.services.ProceduresService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

@Service
public class ProceduresServiceImpl implements ProceduresService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Boolean estadisticasEnsacadoraProc(String fechaIni, String fechaFin, Double valNominal, Integer nroEnsacadora) {
        log.info("dates I - F ::"+fechaIni+" "+fechaFin+" "+valNominal+" "+nroEnsacadora);

        StoredProcedureQuery storedProcedureQuery = entityManager.createStoredProcedureQuery("usp_fab_reporte_ensacadora_mt");
        storedProcedureQuery.registerStoredProcedureParameter("fec_ini"     , String.class  , ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("fec_fin"     , String.class  , ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("nro_ensac"   , Integer.class , ParameterMode.IN);
        storedProcedureQuery.registerStoredProcedureParameter("val_nominal" , Double.class  , ParameterMode.IN);
        //storedProcedureQuery.registerStoredProcedureParameter("sal", Integer.class, ParameterMode.OUT);
        storedProcedureQuery.setParameter("fec_ini", fechaIni);
        storedProcedureQuery.setParameter("fec_fin", fechaFin);
        storedProcedureQuery.setParameter("nro_ensac", nroEnsacadora);
        storedProcedureQuery.setParameter("val_nominal", valNominal);

        // Realizamos la llamada al procedimiento
        storedProcedureQuery.execute();

        return true;
    }
}
