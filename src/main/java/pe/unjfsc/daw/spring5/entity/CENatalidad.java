package pe.unjfsc.daw.spring5.entity;

import java.time.LocalDate;

public class CENatalidad {
	private int CUIA;
	private LocalDate fechNacimiento;
	private double peso;
	private String genotipo;
	private String sexo;
	private int CUIAmadre;
	private int CUIApadre;
	private int Estado;
	
	public CENatalidad() {
		
	}
	public CENatalidad(int CUIA, LocalDate fechNacimiento,double peso,String genotipo,String sexo,int CUIAmadre,int CUIApadre,int Estado) {
		super();
		this.CUIA = CUIA;
		this.fechNacimiento = fechNacimiento;
		this.peso = peso;
		this.genotipo = genotipo;
		this.sexo = sexo;
		this.CUIAmadre = CUIAmadre;
		this.CUIApadre = CUIApadre;
		this.Estado = Estado;
	}
	public int getCUIA() {
		return CUIA;
	}
	public void setCUIA(int cUIA) {
		CUIA = cUIA;
	}
	public LocalDate getFechNacimiento() {
		return fechNacimiento;
	}
	public void setFechNacimiento(LocalDate fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getGenotipo() {
		return genotipo;
	}
	public void setGenotipo(String genotipo) {
		this.genotipo = genotipo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getCUIAmadre() {
		return CUIAmadre;
	}
	public void setCUIAmadre(int cUIAmadre) {
		CUIAmadre = cUIAmadre;
	}
	public int getCUIApadre() {
		return CUIApadre;
	}
	public void setCUIApadre(int cUIApadre) {
		CUIApadre = cUIApadre;
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
		builder.append("CENatalidad [CUIA=");
		builder.append(CUIA);
		builder.append(", fechNacimiento=");
		builder.append(fechNacimiento);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", genotipo=");
		builder.append(genotipo);
		builder.append(", sexo=");
		builder.append(sexo);
		builder.append(", CUIAmadre=");
		builder.append(CUIAmadre);
		builder.append(", CUIApadre=");
		builder.append(CUIApadre);
		builder.append(", Estado=");
		builder.append(Estado);
		builder.append("]");
		return builder.toString();
	}
	
	
}
