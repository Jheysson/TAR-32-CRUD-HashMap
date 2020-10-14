package pe.unjfsc.daw.spring5.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pe.unjfsc.daw.spring5.entity.CELecheProducidaDia;
import pe.unjfsc.daw.spring5.logical.impl.CMALecheProducidaDia;


public class CVALecheProducidaDia {
	private static final Logger log = LoggerFactory.getLogger("CVALecheProducidaDia");
	
	public static void main(String[] args) {
		ApplicationContext oCntx = new ClassPathXmlApplicationContext("context-LecheProducidaDia.xml");
		log.info("[ELV] Context:{}",oCntx);
		CMALecheProducidaDia oCMALecheProducidaDia = (CMALecheProducidaDia) oCntx.getBean("idCMALecheProducidaDia");
		CELecheProducidaDia oCELecheProducidaDia = new CELecheProducidaDia(1, 80.00, "1/10/2020", 2020);
		
		oCMALecheProducidaDia.saveLecheProducidaDia(oCELecheProducidaDia.getIdLechProd(), oCELecheProducidaDia);
		log.info("[EVL] Todos los registros : {}" , oCMALecheProducidaDia.ShowAll());
	
		CELecheProducidaDia oCELecheProducidaDia2=new CELecheProducidaDia(55, 80.00, "1/10/2020", 2020) ;
		oCMALecheProducidaDia.deleteLecheProducidaDia(1);
		log.info("[EVL]  registro eliminado : {}" , oCMALecheProducidaDia.ShowAll());
		
		
		
		
		((ConfigurableApplicationContext) oCntx).close();
	}
}


