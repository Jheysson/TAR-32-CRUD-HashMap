package pe.unjfsc.daw.spring5.logical.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;
import pe.unjfsc.daw.spring5.logical.CAPropietarioInseminacion;

public class CMAPropietarioInseminacion extends CAPropietarioInseminacion{
	
private static final Logger log = LoggerFactory.getLogger("CMAPropietarioInseminacion");
	
	private CEPropietarioInseminacion moCEPropietarioInse;

	private HashMap<Integer,CEPropietarioInseminacion> hashMapInseminacion;
	private CEPropietarioInseminacion oCEPropietarioInseResponse;
	private CEPropietarioInseminacion oCEPropietarioInseRequest;

	public CMAPropietarioInseminacion() {
		hashMapInseminacion = new HashMap<Integer, CEPropietarioInseminacion>();
		hashMapInseminacion.put(1,new CEPropietarioInseminacion(120, 620.00, 1.61, "Establo 1", 20.00, "30/09/2020", 1, "Hereford","N/O"));
		hashMapInseminacion.put(2,new CEPropietarioInseminacion(220, 600.00, 1.63, "Establo 2", 24.00, "02/10/2020", 1, "Charolais","N/O"));
		hashMapInseminacion.put(3,new CEPropietarioInseminacion(320, 618.00, 1.54, "Establo 3", 18.00, "03/10/2020", 1, "Brahman","N/O"));
		hashMapInseminacion.put(4,new CEPropietarioInseminacion(420, 578.00, 1.72, "Establo 4", 22.00, "04/10/2020", 1, "Lomousin","N/O"));
		hashMapInseminacion.put(5,new CEPropietarioInseminacion(520, 588.00, 1.68, "Establo 5", 25.00, "04/10/2020", 1, "Gyrolando","N/O"));
		}
	
	@Override
	public void savePropiInseminacion(int codigo, CEPropietarioInseminacion poCEPropietarioInse) {

		log.info("GUARDANDO REGISTRO CON EL CODIGO "+poCEPropietarioInse.getcodigo()+"...");
		
		oCEPropietarioInseRequest.setcodigo(poCEPropietarioInse.getcodigo());
		oCEPropietarioInseRequest.setPeso(poCEPropietarioInse.getPeso());
		oCEPropietarioInseRequest.setTalla(poCEPropietarioInse.getTalla());
		oCEPropietarioInseRequest.setLugar(poCEPropietarioInse.getLugar());
		oCEPropietarioInseRequest.setPrecio(poCEPropietarioInse.getPrecio());
		oCEPropietarioInseRequest.setFechcompra(poCEPropietarioInse.getFechcompra());
		oCEPropietarioInseRequest.setEstado(poCEPropietarioInse.getEstado());
		oCEPropietarioInseRequest.setGenotipo(poCEPropietarioInse.getGenotipo());
		oCEPropietarioInseRequest.setObse(poCEPropietarioInse.getObse());
	
		hashMapInseminacion.put(codigo, oCEPropietarioInseRequest);
	}

	@Override
	public void updatePropiInseminacion(int codigo, CEPropietarioInseminacion poCEPropiInseminacion) {
		
	
				moCEPropietarioInse.setcodigo(poCEPropiInseminacion.getcodigo());
				moCEPropietarioInse.setPeso(poCEPropiInseminacion.getPeso());
				moCEPropietarioInse.setTalla(poCEPropiInseminacion.getTalla());
				moCEPropietarioInse.setLugar(poCEPropiInseminacion.getLugar());
				moCEPropietarioInse.setPrecio(poCEPropiInseminacion.getPrecio());
				moCEPropietarioInse.setFechcompra(poCEPropiInseminacion.getFechcompra());
				moCEPropietarioInse.setEstado(poCEPropiInseminacion.getEstado());
				moCEPropietarioInse.setGenotipo(poCEPropiInseminacion.getGenotipo());
	
				hashMapInseminacion.put(codigo, moCEPropietarioInse);
				log.info("Verificar actualización: {}",showAll());
	}
	

	@Override
	public void deletePropiInseminacion(int codigo) {
		hashMapInseminacion.remove(codigo);
		
			}
	@Override
	public HashMap<Integer, CEPropietarioInseminacion> showAll() {
		return hashMapInseminacion;
	}
		

	@Override
	public CEPropietarioInseminacion showBycodigo(int codigo) {
		oCEPropietarioInseResponse = hashMapInseminacion.get(codigo);
		
		log.info("{}",oCEPropietarioInseResponse);
		return oCEPropietarioInseResponse;
	}
	

	public void setoCEPropietarioInseResponse(CEPropietarioInseminacion oCEPropietarioInseResponse) {
		this.oCEPropietarioInseResponse = oCEPropietarioInseResponse;
	}


	public void setoCEPropietarioInseRequest(CEPropietarioInseminacion oCEPropietarioInseRequest) {
		this.oCEPropietarioInseRequest = oCEPropietarioInseRequest;
	}	
	


	

}
