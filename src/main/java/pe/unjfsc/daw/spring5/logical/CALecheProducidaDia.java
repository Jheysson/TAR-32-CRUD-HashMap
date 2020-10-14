package pe.unjfsc.daw.spring5.logical;


import java.util.HashMap;

import pe.unjfsc.daw.spring5.entity.CELecheProducidaDia;

public abstract class CALecheProducidaDia {

	public abstract void saveLecheProducidaDia(int id,CELecheProducidaDia pCELecheProducidaDia);
	public abstract void updateLecheProducidaDia(int id, CELecheProducidaDia pCELecheProducidaDia);
	public abstract void deleteLecheProducidaDia(int id);
	
	public abstract  HashMap<Integer, CELecheProducidaDia> ShowAll();
	
	public abstract  CELecheProducidaDia consultarById(int id);
}
