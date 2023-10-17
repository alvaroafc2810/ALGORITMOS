package fotografos;

public class Fotografos {
	
	private String nombres;
	private int dni;
	private double sueldo;
	private String genero;
	private String marcaCamara;
	

	public Fotografos(String nombres, int dni, double sueldo, String genero,String marcaCamara) {
		// TODO Auto-generated constructor stub
	
		this.nombres = nombres;
		this.dni = dni;
		this.sueldo = sueldo;
		this.genero = genero;
		this.marcaCamara = marcaCamara;
		
	
	}

	public String mostrarNombre() {
		
		return nombres;
	}
	
	public int mostrardni(){
		
		return dni;
	}
	
	public double mostrarsueldo() {
		
	return sueldo;	
	
	}
	
	public String mostrargenero() {
		
	return genero;	
		
	}
	
	public String monstrargenero() {
		
		return genero;
		
	}
	
	
}
