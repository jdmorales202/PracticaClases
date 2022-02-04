package modelos;

public class Paciente extends Persona {

	private String fechaprimerconsulta;
	private String medicotratande;
	
	
	
	public Paciente() {
		super();
	}
	public String getFechaprimerconsulta() {
		return fechaprimerconsulta;
	}
	public void setFechaprimerconsulta(String fechaprimerconsulta) {
		this.fechaprimerconsulta = fechaprimerconsulta;
	}
	public String getMedicotratande() {
		return medicotratande;
	}
	public void setMedicotratande(String medicotratande) {
		this.medicotratande = medicotratande;
	}
	
	public int calcularIMC(int peso,double altura) {
		double pesoIdeal=(peso/Math.pow(altura,2));
		int retorno;
		
		if(pesoIdeal<18.5) {
			
			retorno=-1;
		}else if(peso>=18.5 && pesoIdeal<=24.9) {
			
			retorno=0;
		}else {
			retorno=1;
		}
	
		return retorno;
		
		
		
	}
	
	public boolean esMayorDeEdad(int edad) {
		if(edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	public boolean comprobarsexo() {
		if(sexo.equalsIgnoreCase("h")|| sexo.equalsIgnoreCase("m")) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean comprobarsexo2(String sexo){
		if(sexo.equalsIgnoreCase("h")|| sexo.equalsIgnoreCase("m")) {
			return true;
		} else {
			 return false;
		 }
   }
}
