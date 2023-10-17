package gui;

import fotografos.fotografos;

public class datos_fotografos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fotografos colega1 = new fotografos("Silvana Salazar", 7654321, 1200, "Femenino","Nikon");
		fotografos colega2 = new fotografos("Julio Paucarcaja", 9876543, 1400, "Masculino","Canon");
		fotografos colega3 = new fotografos("Omar Romero", 8765432, 1600, "Masculino", "Canon");
		fotografos colega4 = new fotografos("Saul Urribari", 3219876, 2000, "Masculino", "Canon");

		String nombre1 = colega1.mostrarNombre();
		String nombre2 = colega2.mostrarNombre();
		String nombre3 = colega3.mostrarNombre();
		String nombre4 = colega4.mostrarNombre();
		
		System.out.println("El nombre del colega 1 es: "+nombre1);
		System.out.println("El nombre del colega 2 es: "+nombre2);
	    System.out.println("El nombre del colega 3 es: "+nombre3);
	    System.out.println("El nombre del colega 4 es: "+nombre4);
		
	}

	
	
}
