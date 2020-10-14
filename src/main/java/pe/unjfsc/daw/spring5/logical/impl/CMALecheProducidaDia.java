package pe.unjfsc.daw.spring5.logical.impl;


import java.util.HashMap;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pe.unjfsc.daw.spring5.entity.CELecheProducidaDia;
import pe.unjfsc.daw.spring5.logical.CALecheProducidaDia;

public class CMALecheProducidaDia extends CALecheProducidaDia {

	private static final Logger log = LoggerFactory.getLogger("CMALecheProducidaDia");

	private CELecheProducidaDia moCELecheProducidaDia;
	private HashMap<Integer, CELecheProducidaDia> hasMapecheProducidaDia;
	private CELecheProducidaDia oCELecheProducidaDiaRequest;
	private CELecheProducidaDia oCELecheProducidaDiaResponse;

	public CMALecheProducidaDia() {
		hasMapecheProducidaDia = new HashMap<Integer, CELecheProducidaDia>();
		hasMapecheProducidaDia.put(1, new CELecheProducidaDia(1, 20.5, "3/10/2020", 4012));
		hasMapecheProducidaDia.put(1, new CELecheProducidaDia(2, 20.5, "3/10/2020", 4012));

	}

	@Override
	public void saveLecheProducidaDia(int id, CELecheProducidaDia pCELecheProducidaDia) {
		log.info("GUARDANDO EL REGISTRO CON EL ID " + pCELecheProducidaDia.getIdLechProd() + "...");
		oCELecheProducidaDiaRequest.setIdLechProd(pCELecheProducidaDia.getIdLechProd());
		oCELecheProducidaDiaRequest.setCantLitrLechProd(pCELecheProducidaDia.getCantLitrLechProd());
		oCELecheProducidaDiaRequest.setFechLechProd(pCELecheProducidaDia.getFechLechProd());
		oCELecheProducidaDiaRequest.setVacaProducion(pCELecheProducidaDia.getVacaProducion());
		hasMapecheProducidaDia.put(id, oCELecheProducidaDiaRequest);

	}

	@Override
	public void updateLecheProducidaDia(int id, CELecheProducidaDia pCELecheProducidaDia) {
		moCELecheProducidaDia.setIdLechProd(pCELecheProducidaDia.getIdLechProd());
		moCELecheProducidaDia.setCantLitrLechProd(pCELecheProducidaDia.getCantLitrLechProd());
		moCELecheProducidaDia.setFechLechProd(pCELecheProducidaDia.getFechLechProd());
		moCELecheProducidaDia.setVacaProducion(pCELecheProducidaDia.getVacaProducion());

		hasMapecheProducidaDia.put(id, oCELecheProducidaDiaRequest);

	}

	@Override
	public void deleteLecheProducidaDia(int id) {
		hasMapecheProducidaDia.remove(id);
	}

	@Override
	public HashMap<Integer, CELecheProducidaDia> ShowAll() {
		log.info("MOSTRANDO REGISTROS EXISTENTES");
		return hasMapecheProducidaDia;
	}

	@Override
	public CELecheProducidaDia consultarById(int id) {
		oCELecheProducidaDiaResponse = hasMapecheProducidaDia.get(id);
		log.info("[DZS] => {}",oCELecheProducidaDiaResponse);

		return oCELecheProducidaDiaResponse;
	}

	public void setoCELecheProducidaDiaRequest(CELecheProducidaDia oCELecheProducidaDiaRequest) {
		this.oCELecheProducidaDiaRequest = oCELecheProducidaDiaRequest;
	}

	public void setoCELecheProducidaDiaResponse(CELecheProducidaDia oCELecheProducidaDiaResponse) {
		this.oCELecheProducidaDiaResponse = oCELecheProducidaDiaResponse;
	}

}
