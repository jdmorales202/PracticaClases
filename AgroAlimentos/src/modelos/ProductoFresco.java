package modelos;

public class ProductoFresco extends Producto {
	
	public ProductoFresco() {
	     super();
	}

	@Override
	public String toString() {
		return "ProductoFresco [fechaCaducidad=" + fechaCaducidad + ", lote=" + lote + ", paisOrigen=" + paisOrigen
				+ ", fechaEnvasado=" + fechaEnvasado + ", getFechaCaducidad()=" + getFechaCaducidad() + ", getLote()="
				+ getLote() + ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaEnvasado()=" + getFechaEnvasado()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
