package pe.unjfsc.daw.spring5.logical;

import java.util.ArrayList;
import java.util.HashMap;

import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;


public abstract class CAPropietarioInseminacion {

	public abstract void savePropiInseminacion(int codigo, CEPropietarioInseminacion poCEPropiInseminacion);
	public abstract void updatePropiInseminacion(int codigo, CEPropietarioInseminacion poCEPropiInseminacion);
	public abstract void deletePropiInseminacion(int codigo);
	public abstract HashMap<Integer, CEPropietarioInseminacion> showAll();
	public abstract CEPropietarioInseminacion showBycodigo(int codigo);
}
