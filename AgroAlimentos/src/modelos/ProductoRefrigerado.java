package modelos;

public class ProductoRefrigerado extends Producto{
	
	private String codigoSupervicionAlim;
	private double temperaturaMante;
	public String getCodigoSupervicionAlim() {
		return codigoSupervicionAlim;
	}
	
	public ProductoRefrigerado() {
		 super();
	}
	
	
	
	public void setCodigoSupervicionAlim(String codigoSupervicionAlim) {
		this.codigoSupervicionAlim = codigoSupervicionAlim;
	}
	public double getTemperaturaMante() {
		return temperaturaMante;
	}
	public void setTemperaturaMante(double temperaturaMante) {
		this.temperaturaMante = temperaturaMante;
	}

	@Override
	public String toString() {
		return "ProductoRefrigerado [codigoSupervicionAlim=" + codigoSupervicionAlim + ", temperaturaMante="
				+ temperaturaMante + ", fechaCaducidad=" + fechaCaducidad + ", lote=" + lote + ", paisOrigen="
				+ paisOrigen + ", fechaEnvasado=" + fechaEnvasado + ", getCodigoSupervicionAlim()="
				+ getCodigoSupervicionAlim() + ", getTemperaturaMante()=" + getTemperaturaMante()
				+ ", getFechaCaducidad()=" + getFechaCaducidad() + ", getLote()=" + getLote() + ", getPaisOrigen()="
				+ getPaisOrigen() + ", getFechaEnvasado()=" + getFechaEnvasado() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
