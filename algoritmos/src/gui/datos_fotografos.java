package gui;

import fotografos.Fotografos;

public class datos_fotografos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fotografos colega1 = new Fotografos("Silvana Salazar", 7654321, 1200, "Femenino","Nikon");
		Fotografos colega2 = new Fotografos("Julio Paucarcaja", 9876543, 1400, "Masculino","Canon");
		Fotografos colega3 = new Fotografos("Omar Romero", 8765432, 1600, "Masculino", "Canon");
		Fotografos colega4 = new Fotografos("Saul Urribari", 3219876, 2000, "Masculino", "Canon");

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
