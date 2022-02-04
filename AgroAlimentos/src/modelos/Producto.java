package modelos;

public class Producto {
           
	protected String fechaCaducidad;
	protected String lote;
	protected String paisOrigen;
	protected String fechaEnvasado;
	
	public Producto() {
		super();
	
	}
	
	public Producto(String fechaCaducidad, String lote, String paisOrigen, String fechaEnvasado) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.lote = lote;
		this.paisOrigen = paisOrigen;
		this.fechaEnvasado = fechaEnvasado;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	
}
