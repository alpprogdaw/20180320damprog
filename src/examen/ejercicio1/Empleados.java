package examen.ejercicio1;

public class Empleados {
	private String nombre;
	private String apellidos;
	private String fecha_contratacion;
	private int num_cuenta;
	
	public Empleados(String nombre, String apellidos, String fecha_contratacion, int num_cuenta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha_contratacion = fecha_contratacion;
		this.num_cuenta = num_cuenta;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String getFecha_contratacion() {
		return fecha_contratacion;
	}
	
	public int getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	@Override
	public String toString() {
		return "Empleados: nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_contratacion=" + fecha_contratacion
				+ ", num_cuenta=" + num_cuenta;
	}
}
