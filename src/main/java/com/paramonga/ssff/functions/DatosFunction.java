package com.paramonga.ssff.functions;

import com.paramonga.ssff.entities.Datos;
import com.paramonga.ssff.mapper.DatosMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatosFunction {
    public List<DatosMapper> convertirPlano(List<Datos> input){
        List<DatosMapper> output = new ArrayList<>();
        for (Datos abs : input){
            DatosMapper entity = new DatosMapper();

            entity.setFecha(abs.getId().getFecha());
            entity.setMeteorolEstacion(abs.getId().getMeteorolEstacion());
            entity.setTempOut(abs.getTempOut());
            entity.setHiTemp(abs.getHiTemp());
            entity.setLowTemp(abs.getLowTemp());
            entity.setOutHum(abs.getOutHum());
            entity.setDewPt(abs.getDewPt());
            entity.setWindSpeed(abs.getWindSpeed());
            entity.setWindDir(abs.getWindDir());
            entity.setWindRun(abs.getWindRun());
            entity.setHiSpeed(abs.getHiSpeed());
            entity.setHiDir(abs.getHiDir());
            entity.setWindChill(abs.getWindChill());
            entity.setHeatIndex(abs.getHeatIndex());
            entity.setThxIndex(abs.getThxIndex());
            entity.setThswIndex(abs.getThswIndex());
            entity.setBar(abs.getBar());
            entity.setRain(abs.getRain());
            entity.setRainRate(abs.getRainRate());
            entity.setSolarRad(abs.getSolarRad());
            entity.setSolarEnergy(abs.getSolarEnergy());
            entity.setHiRad(abs.getHiRad());
            entity.setSolarUvIndex(abs.getSolarUvIndex());
            entity.setUvDose(abs.getUvDose());
            entity.setHiUv(abs.getHiUv());
            entity.setHeatDd(abs.getHeatDd());
            entity.setCoolDd(abs.getCoolDd());
            entity.setInTemp(abs.getInTemp());
            entity.setInHum(abs.getInHum());
            entity.setInDew(abs.getInDew());
            entity.setInHeat(abs.getInHeat());
            entity.setInEmc(abs.getInEmc());
            entity.setInAirDensity(abs.getInAirDensity());
            entity.setEt(abs.getEt());
            entity.setWindSamp(abs.getWindSamp());
            entity.setWindTx(abs.getWindTx());
            entity.setIssRecept(abs.getIssRecept());
            entity.setArcInt(abs.getArcInt());
            entity.setDia(abs.getDia());
            entity.setHora(abs.getHora());
            entity.setCodUsr(abs.getCodUsr());
            entity.setFechaRegistro(abs.getFechaRegistro());
            entity.setEstacion(abs.getEstacion());


            output.add(entity);
        }
        return output;
    }
}
