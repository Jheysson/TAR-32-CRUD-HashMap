package pe.unjfsc.daw.spring5.logical.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;
import pe.unjfsc.daw.spring5.logical.CAGanadoEnfermo;

public class CMAGanadoEnfermo extends CAGanadoEnfermo {
	private static final Logger Log = LoggerFactory.getLogger("CMAGanadoEnfermo");
	
	private CEGanadoEnfermo moCEGanadoEnfermo;
	
	private HashMap<Integer, CEGanadoEnfermo> hashMapCEGanadoEnfermo;
	private CEGanadoEnfermo oCEGanadoEnfermoRequest;
	private CEGanadoEnfermo oCEGanadoEnfermoResponse;
	public CMAGanadoEnfermo() {
		hashMapCEGanadoEnfermo = new HashMap<Integer, CEGanadoEnfermo> ();
		
		hashMapCEGanadoEnfermo.put (1,new CEGanadoEnfermo(2001,"Mastitis",LocalDate.of(2020, 9, 25), "Mejora en proceso lento", 1));
		hashMapCEGanadoEnfermo.put (2,new CEGanadoEnfermo(2002,"Hemolactea",LocalDate.of(2020, 9, 20), "Cuidad intensivo", 1));
		
	}
	
	
	@Override
	public void saveGanadoEnfermo(int CUIA, CEGanadoEnfermo pCEGanadoEnfermo) {
		Log.info("GUARDANDO EL REGISTRO CON EL CUIA"+ pCEGanadoEnfermo.getCUIA()+"...");
			
		oCEGanadoEnfermoRequest.setCUIA(pCEGanadoEnfermo.getCUIA());
		oCEGanadoEnfermoRequest.setEnfermedad(pCEGanadoEnfermo.getEnfermedad());
		oCEGanadoEnfermoRequest.setFechIngreso(pCEGanadoEnfermo.getFechIngreso());
		oCEGanadoEnfermoRequest.setObservacion(pCEGanadoEnfermo.getObservacion());
		oCEGanadoEnfermoRequest.setEstado(pCEGanadoEnfermo.getEstado());
		
		hashMapCEGanadoEnfermo.put(CUIA, oCEGanadoEnfermoRequest);
		
		
	}

	@Override
	public void updateGanadoEnfermo(int CUIA,CEGanadoEnfermo pCEGanadoEnfermo) {
		
		
				moCEGanadoEnfermo.setCUIA(pCEGanadoEnfermo.getCUIA());
				moCEGanadoEnfermo.setEnfermedad(pCEGanadoEnfermo.getEnfermedad());
				moCEGanadoEnfermo.setFechIngreso(pCEGanadoEnfermo.getFechIngreso());
				moCEGanadoEnfermo.setObservacion(pCEGanadoEnfermo.getObservacion());
				moCEGanadoEnfermo.setEstado(pCEGanadoEnfermo.getEstado());
				
				hashMapCEGanadoEnfermo.put(CUIA, moCEGanadoEnfermo);
				Log.info("Verificar actualización: {}", consultaAll());
				
			}
			
		
	

	@Override
	public void deleteGanadoEnfermo(int CUIA) {
		hashMapCEGanadoEnfermo.remove(CUIA);
	}

	@Override
	public HashMap<Integer ,CEGanadoEnfermo> consultaAll() {
		Log.info("MOSTRANDO REGISTROS EXISTENTES");
		return hashMapCEGanadoEnfermo;
	}
	@Override
	public CEGanadoEnfermo consultarByCuia(int CUIA) {
		oCEGanadoEnfermoResponse = hashMapCEGanadoEnfermo.get(CUIA);
		
		Log.info("{}", oCEGanadoEnfermoResponse);
		return oCEGanadoEnfermoResponse;
	}
	public void setoCEGanadoEnfermoRequest (CEGanadoEnfermo oCECeGanadoEnfermoRequest) {
		this.oCEGanadoEnfermoRequest = oCECeGanadoEnfermoRequest;
	}
	public void setoCEGanadoEnfermoResponse (CEGanadoEnfermo oCEGanadoEnfermoResponse) {
		this.oCEGanadoEnfermoResponse = oCEGanadoEnfermoResponse;
	}
	}
