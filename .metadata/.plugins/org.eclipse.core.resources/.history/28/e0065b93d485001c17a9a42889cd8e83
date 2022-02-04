package modelos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medico mediPredeter=  new Medico();
		Paciente paciente0= new Paciente();
		ReglasNegocio misReglas= new ReglasNegocio();
		
		mediPredeter.setNombre("Victor");
		mediPredeter.setAltura(1.8);
		mediPredeter.setEdad(35);
		mediPredeter.setEspecialidad("Nutricion");
		mediPredeter.setPrecioCosulta(150000);
		mediPredeter.setPeso(90);
		
		paciente0.setNombre(JOptionPane.showInputDialog("Por favor ingrese el nombre del paciente"));
		paciente0.setAltura(misReglas.solicitarReal("Por favor ingrese su altura"));
		paciente0.setEdad(misReglas.SolicitarEntero("Por favor ingrese la edad del paciente")); 
		paciente0.setPeso(misReglas.SolicitarEntero("por favor ingrese el peso del paciente"));
		paciente0.setMedicotratande(mediPredeter);
		paciente0.setSexo(misReglas.SolicitarSexo());
		paciente0.setRut(JOptionPane.showInputDialog("por favor ingrese el rut del paciente"));
		
		String mensaje="Paciente:" +paciente0.getNombre()+"\n"+
		               "peso: " +paciente0.getAltura()+"\n"+
				       "IMC: "+paciente0.calcularIMC(paciente0.getPeso(), paciente0.getAltura());
		
		JOptionPane.showConfirmDialog(null, mensaje);
		
		System.out.println(paciente0.toString());
		
	}

}
 