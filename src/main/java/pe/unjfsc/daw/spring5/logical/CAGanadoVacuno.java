package pe.unjfsc.daw.spring5.logical;

import java.util.HashMap;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;

public abstract class CAGanadoVacuno {
	public abstract void saveGanadoVacuno(int cuia, CEGanadoVacuno poCEGanadoVacuno);
	public abstract void updateGanadoVacuno(int cuia,CEGanadoVacuno poCEGanadoVacuno);
	public abstract void deleteGanadoVacuno(int CUIA);
	public abstract HashMap<Integer,CEGanadoVacuno> showAll();
	public abstract CEGanadoVacuno showByCUIA(int CUIA);
	
}
