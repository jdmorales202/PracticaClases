package modelos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ProductoFresco pf1=crearFresco("2022-11-02", "2022-01-02", "12122121", "Colombia");
         ProductoFresco pf2=crearFresco("2022-11-02", "2022-01-02", "12122121", "Colombia");
		
		
	}
	
	public static ProductoFresco crearFresco(String fechaC,String fechaE,String lote,String pais) {
		ProductoFresco f1=new ProductoFresco();
		f1.setFechaCaducidad(fechaC);
		f1.setFechaEnvasado(fechaE);
		f1.setLote(lote);
		f1.setPaisOrigen(pais);
		return f1;
	}
	
}
