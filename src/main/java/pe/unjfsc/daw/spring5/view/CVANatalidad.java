package pe.unjfsc.daw.spring5.view;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CENatalidad;
import pe.unjfsc.daw.spring5.logical.impl.CMANatalidad;


public class CVANatalidad {
	private static final Logger Log = LoggerFactory.getLogger("CVANatalidad");
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-natalidad.xml");
		
		Log.info("[EVL] Context: {}",oCntx);
		CMANatalidad oCMANatalidad= (CMANatalidad) oCntx.getBean("idCMANatalidad");
		
		CENatalidad oCENatalidad = new CENatalidad(2007, LocalDate.of(2020, 9, 25), 200.00, "Criollo", "Macho", 2002, 2003, 1);
		
		oCMANatalidad.saveNatalidad(oCENatalidad.getCUIA(), oCENatalidad);
		Log.info("Todos los registros: {}", oCMANatalidad.showAll());
		
		CENatalidad oCMNatalidad2 = new CENatalidad(2001, LocalDate.of(2020, 9, 25), 200.00, "Actualizado", "Macho", 2002, 2003, 1);
		
		oCMANatalidad.deleteNatalidad(2001);
		Log.info("Verificar registro Eliminado: {}",oCMANatalidad.showAll());
		
		int CUIA = 2007;
		oCMANatalidad.consultarByCuia(CUIA);
		
		((ConfigurableApplicationContext) oCntx).close();

	}

}
