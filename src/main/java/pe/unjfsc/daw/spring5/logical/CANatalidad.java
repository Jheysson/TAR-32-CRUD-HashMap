package pe.unjfsc.daw.spring5.logical;

import java.util.HashMap;

import pe.unjfsc.daw.spring5.entity.CENatalidad;

public abstract class CANatalidad {
	public abstract void saveNatalidad(int cuia,CENatalidad pCENatalidad);
	public abstract void updateNatalidad(int cuia, CENatalidad pCENatalidad);
	public abstract void deleteNatalidad(int CUIA);
	
	public abstract HashMap<Integer,CENatalidad> showAll();
	public abstract CENatalidad consultarByCuia(int CUIA);
}
