package com.paramonga.ssff.functions;


import com.paramonga.ssff.entities.PesajeAzucar;
import com.paramonga.ssff.entities.PesajeAzucarId;
import com.paramonga.ssff.mapper.PesajeAzucarMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PesajeAzucarFunction {

    public PesajeAzucar retornarValor(PesajeAzucarMapper entrada) {
        PesajeAzucar salida =  new PesajeAzucar();

        salida.setId(new PesajeAzucarId(entrada.getFechaPesaje(),entrada.getCodTempla(), entrada.getNumBalanza(),entrada.getNroConteo()));
        salida.setDescripcion(entrada.getDescripcion());
        salida.setPesoNominal(entrada.getPesoNominal());
        salida.setPesoReal(entrada.getPesoReal());
        salida.setPesoTolSup(entrada.getPesoTolSup());
        salida.setPesoTolInf(entrada.getPesoTolInf());
        salida.setCodUsr(entrada.getCodUsr());
        salida.setEstacion(entrada.getEstacion());
        salida.setFecRegistro(entrada.getFecRegistro());
        salida.setRuta(entrada.getRuta());
        salida.setNivel(entrada.getNivel());
        salida.setFecSistema(entrada.getFecSistema());
        salida.setFlagCheck(entrada.getFlagCheck());

        return salida;
    }

    public List<PesajeAzucarMapper> convertirPlano(List<PesajeAzucar> input) {
        List<PesajeAzucarMapper> output = new ArrayList<>();
        for (PesajeAzucar abs : input){
            PesajeAzucarMapper entity = new PesajeAzucarMapper();

            entity.setFechaPesaje(abs.getId().getFechaPesaje());
            entity.setCodTempla(abs.getId().getCodTempla());
            entity.setNumBalanza(abs.getId().getNumBalanza());
            entity.setNroConteo(abs.getId().getNroConteo());
            entity.setDescripcion(abs.getDescripcion());
            entity.setPesoNominal(abs.getPesoNominal());
            entity.setPesoReal(abs.getPesoReal());
            entity.setPesoTolSup(abs.getPesoTolSup());
            entity.setPesoTolInf(abs.getPesoTolInf());
            entity.setCodUsr(abs.getCodUsr());
            entity.setEstacion(abs.getEstacion());
            entity.setFecRegistro(abs.getFecRegistro());
            entity.setRuta(abs.getRuta());
            entity.setNivel(abs.getNivel());
            entity.setFecSistema(abs.getFecSistema());
            entity.setFlagCheck(abs.getFlagCheck());
            output.add(entity);
        }
        return output;
    }

}
