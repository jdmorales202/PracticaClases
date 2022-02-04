package modelos;

public class congeladoNitro extends ProductoCongelado {
	
	private String metodoUso;
	private int tiempoSegundos;
	public String getMetodoUso() {
		return metodoUso;
	}
	public void setMetodoUso(String metodoUso) {
		this.metodoUso = metodoUso;
	}
	public int getTiempoSegundos() {
		return tiempoSegundos;
	}
	public void setTiempoSegundos(int tiempoSegundos) {
		this.tiempoSegundos = tiempoSegundos;
	}
	public congeladoNitro() {
		super();
	}
	@Override
	public String toString() {
		return "congeladoNitro [metodoUso=" + metodoUso + ", tiempoSegundos=" + tiempoSegundos + ", fechaCaducidad="
				+ fechaCaducidad + ", lote=" + lote + ", paisOrigen=" + paisOrigen + ", fechaEnvasado=" + fechaEnvasado
				+ ", getMetodoUso()=" + getMetodoUso() + ", getTiempoSegundos()=" + getTiempoSegundos()
				+ ", getTemperaturaMante()=" + getTemperaturaMante() + ", getFechaCaducidad()=" + getFechaCaducidad()
				+ ", getLote()=" + getLote() + ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaEnvasado()="
				+ getFechaEnvasado() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
