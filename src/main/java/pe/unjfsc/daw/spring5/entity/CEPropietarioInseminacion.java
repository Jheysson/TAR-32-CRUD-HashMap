package pe.unjfsc.daw.spring5.entity;

public class CEPropietarioInseminacion {

	private int codigo;
	private double peso;
	private double talla;
	private String lugar;
	private double precio;
	private String fechcompra;
	private int estado;
	private String genotipo;
	private String obse;
	
public CEPropietarioInseminacion() {}
	
	public CEPropietarioInseminacion(int codigo, double peso, double talla, String lugar, double precio, 
	String fechcompra, int estado, String genotipo, String obse) {
		
		super();
		this.codigo = codigo;
		this.peso = peso;
		this.talla = talla;
		this.lugar= lugar;
		this.precio= precio;
		this.fechcompra = fechcompra;
		this.estado= estado;
		this.genotipo = genotipo;
		this.obse = obse;
	}

	public int getcodigo() {
		return codigo;
	}

	public void setcodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFechcompra() {
		return fechcompra;
	}

	public void setFechcompra(String fechcompra) {
		this.fechcompra = fechcompra;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getGenotipo() {
		return genotipo;
	}

	public void setGenotipo(String genotipo) {
		this.genotipo = genotipo;
	}

	public String getObse() {
		return obse;
	}

	public void setObse(String obse) {
		this.obse = obse;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CEPropietarioInseminacion [codigo=");
		builder.append(codigo);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", talla=");
		builder.append(talla);
		builder.append(", lugar=");
		builder.append(lugar);
		builder.append(", precio=");
		builder.append(precio);
		builder.append(", fechcompra=");
		builder.append(fechcompra);
		builder.append(", estado=");
		builder.append(estado);
		builder.append(", genotipo=");
		builder.append(genotipo);
		builder.append(", obse=");
		builder.append(obse);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
