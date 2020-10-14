package pe.unjfsc.daw.spring5.view;

import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CEGanadoEnfermo;
import pe.unjfsc.daw.spring5.logical.impl.CMAGanadoEnfermo;

public class CVAGanadoEnfermo {
	private static final Logger Log = LoggerFactory.getLogger("CVAGanadoEnfermo");

	public static void main (String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-ganadoEnfermo.xml");
		
				Log.info("[EVL] Context: {}",oCntx);
				CMAGanadoEnfermo oCMAGanadoEnfermo= (CMAGanadoEnfermo) oCntx.getBean("idCMAGanadoEnfermo");
		
				Log.info("Todos los registros: {}", oCMAGanadoEnfermo.consultaAll());
			
				CEGanadoEnfermo oCEGanadoEnfermo = new CEGanadoEnfermo(2002,"Mastitis", LocalDate.of(2020, 9, 1),"Mejora considerable", 1);
				
				int CUIA = 2002;
				oCMAGanadoEnfermo.consultarByCuia(CUIA);
				
				CEGanadoEnfermo oCMGanadoEnfermo2 = new CEGanadoEnfermo(
						2000,"Mastitis severa", LocalDate.of(2020, 9, 1),"Atención preferente", 1);
				
				oCMAGanadoEnfermo.saveGanadoEnfermo(oCMGanadoEnfermo2.getCUIA(), oCMGanadoEnfermo2);
				
				Log.info("Verificar último registro: {}",oCMAGanadoEnfermo.consultaAll());
				
				((ConfigurableApplicationContext) oCntx).close();

			}

		}
