package modelos;

public class congeladoAire extends ProductoCongelado{
	
	private double cantOxigeno;
	private double cantDioxido;
	private double cantNitrogeno;
	private double cantVapor;
	
	public congeladoAire() {
		super();
	}
	
	public double getCantOxigeno() {
		return cantOxigeno;
	}
	public void setCantOxigeno(double cantOxigeno) {
		this.cantOxigeno = cantOxigeno;
	}
	public double getCantDioxido() {
		return cantDioxido;
	}
	public void setCantDioxido(double cantDioxido) {
		this.cantDioxido = cantDioxido;
	}
	public double getCantNitrogeno() {
		return cantNitrogeno;
	}
	public void setCantNitrogeno(double cantNitrogeno) {
		this.cantNitrogeno = cantNitrogeno;
	}
	public double getCantVapor() {
		return cantVapor;
	}
	public void setCantVapor(double cantVapor) {
		this.cantVapor = cantVapor;
	}

	@Override
	public String toString() {
		return "congeladoAire [cantOxigeno=" + cantOxigeno + ", cantDioxido=" + cantDioxido + ", cantNitrogeno="
				+ cantNitrogeno + ", cantVapor=" + cantVapor + ", fechaCaducidad=" + fechaCaducidad + ", lote=" + lote
				+ ", paisOrigen=" + paisOrigen + ", fechaEnvasado=" + fechaEnvasado + ", getCantOxigeno()="
				+ getCantOxigeno() + ", getCantDioxido()=" + getCantDioxido() + ", getCantNitrogeno()="
				+ getCantNitrogeno() + ", getCantVapor()=" + getCantVapor() + ", getTemperaturaMante()="
				+ getTemperaturaMante() + ", getFechaCaducidad()=" + getFechaCaducidad() + ", getLote()=" + getLote()
				+ ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaEnvasado()=" + getFechaEnvasado()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	

}
