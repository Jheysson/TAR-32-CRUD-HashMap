package pe.unjfsc.daw.spring5.logical;

import java.util.HashMap;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;

public abstract class CAGanadoEnfermo {
	public abstract void saveGanadoEnfermo (int CUIA, CEGanadoEnfermo pCEGanadoEnfermo);
	public abstract void updateGanadoEnfermo (int CUIA, CEGanadoEnfermo pCEGanadoEnfermo);
	public abstract void deleteGanadoEnfermo (int CUIA);
	
	public abstract HashMap<Integer, CEGanadoEnfermo> consultaAll();
	public abstract CEGanadoEnfermo consultarByCuia (int CUIA);
}
