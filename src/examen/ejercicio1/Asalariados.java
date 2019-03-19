package examen.ejercicio1;

public class Asalariados extends Empleados {

	public Asalariados(String nombre, String apellidos, String fecha_contratacion, int num_cuenta) {
		super(nombre, apellidos, fecha_contratacion, num_cuenta);
	}

	@Override
	public String toString() {
		return super.toString() + "Asalariados";
	}
	
	

}
