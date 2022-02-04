package modelos;

public class Medico extends Persona{
	
	
	private int precioCosulta;
	private String especialidad;
	
	
	
	public Medico() {
		super();
	}
	public int getPrecioCosulta() {
		return precioCosulta;
	}
	public void setPrecioCosulta(int precioCosulta) {
		this.precioCosulta = precioCosulta;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	

}
