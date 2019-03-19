package examen.ejercicio1;

public class Contratistas extends Empleados {
	private int num_sociedades;
	
	public Contratistas(String nombre, String apellidos, String fecha_contratacion, int num_cuenta,  int num_sociedades) {
		super(nombre, apellidos, fecha_contratacion, num_cuenta);
		this.num_sociedades = num_sociedades;
	}

	@Override
	public String toString() {
		return super.toString() + ", num_sociedades=" + num_sociedades;
	}

	
	
}
