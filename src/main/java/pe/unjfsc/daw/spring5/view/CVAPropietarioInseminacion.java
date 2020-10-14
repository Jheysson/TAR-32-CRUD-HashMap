package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEPropietarioInseminacion;
import pe.unjfsc.daw.spring5.logical.impl.CMAPropietarioInseminacion;

public class CVAPropietarioInseminacion {

private static final Logger log = LoggerFactory.getLogger("CVAPropietarioInseminacion");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-propietarioInseminacion.xml");
		
		log.info("Context: {}",oCntx);
		CMAPropietarioInseminacion oCMAPropiInse= (CMAPropietarioInseminacion) oCntx.getBean("idCMAInseminacion");
		
		//Mostrar registros actuales
		log.info("Todos los registros: {}", oCMAPropiInse.showAll());
		
		//Actualizar un registro 
		CEPropietarioInseminacion oCEPropiInse= new CEPropietarioInseminacion(520, 588.00, 1.68, "Establo actualizado", 25.00, "05/10/2020", 1, "Gyrolando","N/O");
		//oCMAPropiInse.updatePropiInseminacion(oCEPropiInse);
		
		//Buscar solo un registro con el codigo
		int codigo = 320;
		oCMAPropiInse.showBycodigo(codigo);
		
		//Agregar un nuevo registro
		CEPropietarioInseminacion oCMPropiInse2 = new CEPropietarioInseminacion(
				620, 594.00, 1.66, "Establo nuevo", 18.00, "06/10/2020", 
				1, "Brahman","N/O");
		oCMAPropiInse.savePropiInseminacion(oCMPropiInse2.getcodigo(), oCMPropiInse2);
		
		//Verificamos el último registro
		log.info("Verificar último registro: {}",oCMAPropiInse.showAll());
		
		//Eliminamos un registro 
		oCMAPropiInse.deletePropiInseminacion(120);
		
		//Verificamos si se eliminó
		log.info("Verificar la eliminación: {}",oCMAPropiInse.showAll());
		
		((ConfigurableApplicationContext) oCntx).close();
	}

}
