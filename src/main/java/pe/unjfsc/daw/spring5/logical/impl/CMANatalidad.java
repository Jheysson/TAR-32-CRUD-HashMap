package pe.unjfsc.daw.spring5.logical.impl;

import java.time.LocalDate;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CENatalidad;
import pe.unjfsc.daw.spring5.logical.CANatalidad;

public class CMANatalidad extends CANatalidad{
private static final Logger Log = LoggerFactory.getLogger("CMANatalidad");
	
	private CENatalidad moCENatalidad;
	
	private HashMap<Integer, CENatalidad> hashMapCENatalidad;
	private CENatalidad oCENatalidadRequest;
	private CENatalidad oCENatalidadResponse;
	
	public CMANatalidad() {
		hashMapCENatalidad = new HashMap<Integer,CENatalidad>();
		hashMapCENatalidad.put(1, new CENatalidad(2001, LocalDate.of(2020, 9, 25), 200.00, "Criollo", "Macho", 2002, 2003, 1));
	}
	
	@Override
	public void saveNatalidad(int cuia, CENatalidad pCENatalidad) {
		Log.info("GUARDANDO EL REGISTRO CON EL CUIA"+ pCENatalidad.getCUIA()+"...");
		
		oCENatalidadRequest.setCUIA(pCENatalidad.getCUIA());
		oCENatalidadRequest.setFechNacimiento(pCENatalidad.getFechNacimiento());
		oCENatalidadRequest.setPeso(pCENatalidad.getPeso());
		oCENatalidadRequest.setGenotipo(pCENatalidad.getGenotipo());
		oCENatalidadRequest.setSexo(pCENatalidad.getSexo());
		oCENatalidadRequest.setCUIAmadre(pCENatalidad.getCUIAmadre());
		oCENatalidadRequest.setCUIApadre(pCENatalidad.getCUIApadre());
		oCENatalidadRequest.setEstado(pCENatalidad.getEstado());
		
		hashMapCENatalidad.put(cuia, oCENatalidadRequest);
	}

	@Override
	public void updateNatalidad(int cuia, CENatalidad pCENatalidad) {
		
		moCENatalidad.setCUIA(pCENatalidad.getCUIA());
		moCENatalidad.setFechNacimiento(pCENatalidad.getFechNacimiento());
		moCENatalidad.setPeso(pCENatalidad.getPeso());
		moCENatalidad.setGenotipo(pCENatalidad.getGenotipo());
		moCENatalidad.setSexo(pCENatalidad.getSexo());
		moCENatalidad.setCUIAmadre(pCENatalidad.getCUIAmadre());
		moCENatalidad.setCUIApadre(pCENatalidad.getCUIApadre());
		moCENatalidad.setEstado(pCENatalidad.getEstado());
		
		hashMapCENatalidad.put(cuia, moCENatalidad);
		
	}

	@Override
	public void deleteNatalidad(int CUIA) {
		hashMapCENatalidad.remove(CUIA);
		
	}

	@Override
	public HashMap<Integer, CENatalidad> showAll() {
		Log.info("MOSTRANDO REGISTROS EXISTENTES");
		return hashMapCENatalidad;
	}

	@Override
	public CENatalidad consultarByCuia(int CUIA) {
		oCENatalidadResponse = hashMapCENatalidad.get(CUIA);
		
		Log.info("{}", oCENatalidadResponse);
		return oCENatalidadResponse;
	}

	public void setoCENatalidadRequest(CENatalidad oCENatalidadRequest) {
		this.oCENatalidadRequest = oCENatalidadRequest;
	}

	public void setoCENatalidadResponse(CENatalidad oCENatalidadResponse) {
		this.oCENatalidadResponse = oCENatalidadResponse;
	}

}
