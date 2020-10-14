package pe.unjfsc.daw.spring5.logical.impl;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.CAGanadoVacuno;

public class CMAGanadoVacuno extends CAGanadoVacuno {

	private static final Logger log = LoggerFactory.getLogger("CMGanadoVacuno");
	
	private CEGanadoVacuno moCEGanadoVacuno;
	private HashMap<Integer,CEGanadoVacuno> hashMapGanadoVacuno;
	private CEGanadoVacuno oCEGanadoVacunoResponse;
	private CEGanadoVacuno oCEGanadoVacunoRequest;
	
	private String etapa = "";
	private LocalDate fechActual = LocalDate.now();
	
	 
	public CMAGanadoVacuno() {
		hashMapGanadoVacuno = new HashMap<Integer,CEGanadoVacuno>();
		hashMapGanadoVacuno.put(1,new CEGanadoVacuno(2001,"Maria", LocalDate.of(2017, 3, 7), 
				"Hembra", 2, "Adulto", 430.0, 1.4, "Producción", "Normal", "Heredord", 
				"Leche", "Autoctono", 0, 0));
		hashMapGanadoVacuno.put(2,new CEGanadoVacuno(2002, "Juana", LocalDate.of(2019, 3, 5),
				"Hembra", 2, "Adulto", 450.0, 1.5, "Producción", "Normal", "Hereford",
				"Leche", "Comprado", 0, 0));
		hashMapGanadoVacuno.put(3,new CEGanadoVacuno(2003, "Martin", LocalDate.of(2017, 3, 5), 
				"Hembra", 2, "Adulto", 450.0, 1.5, "Producción", "Normal", "Hereford", 
				"Leche", "Comprado", 0, 0));
	}
	
	@Override
	public void saveGanadoVacuno(int cuia,CEGanadoVacuno poCEGanadoVacuno) {
		
		boolean madreApta = buscarMadre(poCEGanadoVacuno);
		
		log.info("Madre apta: "+madreApta);
		
		boolean verifExistente = verificarExiste(poCEGanadoVacuno);
		if (madreApta && verifExistente) {
			oCEGanadoVacunoRequest.setCuia(poCEGanadoVacuno.getCuia());
			oCEGanadoVacunoRequest.setAliasGanadoVacuno(poCEGanadoVacuno.getAliasGanadoVacuno());
			oCEGanadoVacunoRequest.setCuiaMadre(poCEGanadoVacuno.getCuiaMadre());
			oCEGanadoVacunoRequest.setCuiaPadre(poCEGanadoVacuno.getCuiaPadre());
			oCEGanadoVacunoRequest.setEdad(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento()));
			oCEGanadoVacunoRequest.setEstaActivo(poCEGanadoVacuno.getEstaActivo());
			oCEGanadoVacunoRequest.setEstaAnim(poCEGanadoVacuno.getEstaAnim());
			oCEGanadoVacunoRequest.setFecha_nacimiento(poCEGanadoVacuno.getFecha_nacimiento());
			oCEGanadoVacunoRequest.setEtapa(asignarEtapa(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento())));
			oCEGanadoVacunoRequest.setGenotipo(poCEGanadoVacuno.getGenotipo());
			oCEGanadoVacunoRequest.setOrigen(poCEGanadoVacuno.getOrigen());
			oCEGanadoVacunoRequest.setPeso(poCEGanadoVacuno.getPeso());
			oCEGanadoVacunoRequest.setSexo(poCEGanadoVacuno.getSexo());
			oCEGanadoVacunoRequest.setTalla(poCEGanadoVacuno.getTalla());
			oCEGanadoVacunoRequest.setTipoGana(poCEGanadoVacuno.getTipoGana());
			hashMapGanadoVacuno.put(cuia,oCEGanadoVacunoRequest);
			log.info("GUARDANDO REGISTRO CON EL CUIA "+poCEGanadoVacuno.getCuia());
		}else {
			log.info("NO SE PUDO REGISTRAR");
		}
		
	}

	@Override
	public void updateGanadoVacuno(int cuia,CEGanadoVacuno poCEGanadoVacuno) {
		
				moCEGanadoVacuno.setAliasGanadoVacuno(poCEGanadoVacuno.getAliasGanadoVacuno());
				moCEGanadoVacuno.setCuiaMadre(poCEGanadoVacuno.getCuiaMadre());
				moCEGanadoVacuno.setCuiaPadre(poCEGanadoVacuno.getCuiaPadre());
				moCEGanadoVacuno.setEdad(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento()));
				moCEGanadoVacuno.setEstaActivo(poCEGanadoVacuno.getEstaActivo());
				moCEGanadoVacuno.setEstaAnim(poCEGanadoVacuno.getEstaAnim());
				moCEGanadoVacuno.setFecha_nacimiento(poCEGanadoVacuno.getFecha_nacimiento());
				moCEGanadoVacuno.setEtapa(asignarEtapa(calcularEdad(poCEGanadoVacuno.getFecha_nacimiento())));
				moCEGanadoVacuno.setGenotipo(poCEGanadoVacuno.getGenotipo());
				moCEGanadoVacuno.setOrigen(poCEGanadoVacuno.getOrigen());
				moCEGanadoVacuno.setPeso(poCEGanadoVacuno.getPeso());
				moCEGanadoVacuno.setSexo(poCEGanadoVacuno.getSexo());
				moCEGanadoVacuno.setTalla(poCEGanadoVacuno.getTalla());
				moCEGanadoVacuno.setTipoGana(poCEGanadoVacuno.getTipoGana());
				
				hashMapGanadoVacuno.put(cuia, moCEGanadoVacuno);
		log.info("Verificar actualización: {}",showAll());
	}

	@Override
	public void deleteGanadoVacuno(int CUIA) {
		
		hashMapGanadoVacuno.remove(CUIA);
	
	}

	@Override
	public HashMap<Integer, CEGanadoVacuno> showAll() {
		return hashMapGanadoVacuno;
	}

	@Override
	public CEGanadoVacuno showByCUIA(int CUIA) {
		
				oCEGanadoVacunoResponse = hashMapGanadoVacuno.get(CUIA);
		log.info("{}",oCEGanadoVacunoResponse);
		return oCEGanadoVacunoResponse;
	}
	
	
	protected int calcularEdad(LocalDate fechaNaci) {		
		int edad = (int) ChronoUnit.MONTHS.between(fechaNaci, fechActual);
		return edad;
	}
	protected String asignarEtapa(int edad) {
					
		if(edad <= 4) {
			etapa = "Ternero(a)";
		}else if(edad > 4 && edad <=12) {
			etapa = "Destete";
		}else if(edad > 12 && edad <=18) {
			etapa = "Becerro(a)";
		}else if(edad > 18 && edad <=36) {
			etapa = "Novillo(a)";
		}else if(edad >= 36) {
			etapa = "Adulto";
		}
		return etapa;
	}
	protected boolean buscarMadre(CEGanadoVacuno oCEGanadoVacuno) {
		boolean rpta = false;
		if (oCEGanadoVacuno.getCuiaMadre() !=0) {
			for(Integer i: hashMapGanadoVacuno.keySet()) {
				if (hashMapGanadoVacuno.get(i).getCuia() == oCEGanadoVacuno.getCuiaMadre()) {
					log.info("SE ENCONTRÓ EL CUIA INGRESADO DE LA MADRE EN LOS REGISTROS ACTUALES");
					if (hashMapGanadoVacuno.get(i).getSexo().equals("Hembra") && hashMapGanadoVacuno.get(i).getEdad()>18) {
						log.info("SE VALIDÓ COMO HEMBRA APTA");
						rpta = true;
						break;
					}else {
						log.info("EL CUIA DE LA MADRE INGRESADO ES DE UNA BOVINA NO APTA PARA SER MADRE");
						rpta = false;
						break;
					}
				}else {
					//No se encuentra el registro de la madre
					rpta = false;
				}
			}
		}else {
			rpta = true;
		}
		
		return rpta;
		
		
		
	
		
	}protected boolean verificarExiste(CEGanadoVacuno oCEGanadoVacuno) {
		boolean rpta = false;
		
		for(Integer i: hashMapGanadoVacuno.keySet()) {
			if (i == oCEGanadoVacuno.getCuia()) {
				rpta = true;
				break;
			}else {
				rpta =false;
			}
		}
		return rpta;
	}

	public void setoCEGanadoVacunoResponse(CEGanadoVacuno oCEGanadoVacunoResponse) {
		this.oCEGanadoVacunoResponse = oCEGanadoVacunoResponse;
	}

	public void setoCEGanadoVacunoRequest(CEGanadoVacuno oCEGanadoVacunoRequest) {
		this.oCEGanadoVacunoRequest = oCEGanadoVacunoRequest;
	}	
	


}
