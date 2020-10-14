package pe.unjfsc.daw.spring5.entity;

import java.time.LocalDate;

public class CEGanadoEnfermo {

		private int CUIA;
		private String enfermedad;
		private LocalDate fechIngreso;
		private String observacion;
		private int Estado;
		public CEGanadoEnfermo() {
			
		}
		public CEGanadoEnfermo (int CUIA, String enfermedad, LocalDate fechIngreso, String observacion, int Estado) {
			super();
			this.CUIA = CUIA;
			this.enfermedad = enfermedad;
			this.fechIngreso = fechIngreso;
			this.observacion = observacion;
			this.Estado = Estado;
			
		}
		public int getCUIA() {
			return CUIA;
		}
		public void setCUIA(int cUIA) {
			CUIA = cUIA;
		}
		public String getEnfermedad() {
			return enfermedad;
		}
		public void setEnfermedad(String enfermedad) {
			this.enfermedad = enfermedad;
		}
		public LocalDate getFechIngreso() {
			return fechIngreso;
		}
		public void setFechIngreso(LocalDate fechIngreso) {
			this.fechIngreso = fechIngreso;
		}
		public String getObservacion() {
			return observacion;
		}
		public void setObservacion(String observacion) {
			this.observacion = observacion;
		}
		public int getEstado() {
			return Estado;
		}
		public void setEstado(int estado) {
			Estado = estado;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("CEGanadoEnfermo [CUIA=");
			builder.append(CUIA);
			builder.append(", enfermedad=");
			builder.append(enfermedad);
			builder.append(", fechIngreso=");
			builder.append(fechIngreso);
			builder.append(", observacion=");
			builder.append(observacion);
			builder.append(", Estado=");
			builder.append(Estado);
			builder.append("]");
			return builder.toString();
		}
}
