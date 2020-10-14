package pe.unjfsc.daw.spring5.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEGanadoVacuno;
import pe.unjfsc.daw.spring5.logical.impl.CMAGanadoVacuno;

public class CVAGanadoVacuno {
private static final Logger log = LoggerFactory.getLogger("CVIGanadoVacuno");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-ganadoVacuno.xml");
		
		log.info("Context: {}",oCntx);
		
		CMAGanadoVacuno oCMAGanadoVacuno = (CMAGanadoVacuno) oCntx.getBean("idCMAGanadoVacuno");
		//Mostrar registros actuales
		log.info("Todos los registros: {}", oCMAGanadoVacuno.showAll());
		
		
		//Actualizar un registro según su CUIA
		CEGanadoVacuno oCEGanadoVacuno = 
				new CEGanadoVacuno(2001,			//cuia
						"EDITADO Alicia",			//alias
						LocalDate.of(2018, 5, 24),	//Fecha de nacimiento
						"Hembra", 390, 1.4,			//sexo, peso(kg), talla(m)
						"Inactivo", "Normal",		//Estado activo, estado animal
						"Brahman", "Leche",			//Genotipo, tipo
						"Comprado", 0,				//origen, cuiaMadre
						0);							//cuiaPadre
		//oCMAGanadoVacuno.updateGanadoVacuno(oCEGanadoVacuno.getCuia(),oCEGanadoVacuno);
		
		//Buscamos solo un registro por el CUIA
		int cuia = 2001;
		oCMAGanadoVacuno.showByCUIA(cuia);
		
		//Agregamos un nuevo registro
		CEGanadoVacuno oCEGanadoVacuno2 = new CEGanadoVacuno(
				2005,						//cuia
				"NUEVO ROBERTA",			//alias
				LocalDate.of(2020, 5, 24),	//Fecha de nacimiento
				"Hembra", 400, 1.5,			//sexo, peso(kg), talla(m)
				"Producción", "Normal",		//Estado activo, estado animal
				"Brahman", "Leche",			//Genotipo, tipo
				"Autoctono", 2003,			//origen, cuiaMadre
				2001);						//cuiaPadre
		oCMAGanadoVacuno.saveGanadoVacuno(oCEGanadoVacuno2.getCuia(),oCEGanadoVacuno2);
		 
		//Verificamos el último registro
		log.info("Verificar último registro: {}",oCMAGanadoVacuno.showAll());

		//Eliminamos un registro por su cuia
		oCMAGanadoVacuno.deleteGanadoVacuno(2001);
		
		//Verificamos si se eliminó
		log.info("Verificar la eliminación: {}",oCMAGanadoVacuno.showAll());
		((ConfigurableApplicationContext) oCntx).close();
		
	}
}
