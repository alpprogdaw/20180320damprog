package examen.ejercicio1;

public class Servicios {
	private String nombre;
	private String tipo_servicio;
	private int num_cuenta;
	
	public Servicios(String nombre, String tipo_servicio, int num_cuenta) {
		this.nombre = nombre;
		this.tipo_servicio = tipo_servicio;
		this.num_cuenta = num_cuenta;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getTipo_servicio() {
		return tipo_servicio;
	}
	
	public int getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	@Override
	public String toString() {
		return "Servicios [nombre=" + nombre + ", tipo_servicio=" + tipo_servicio + ", num_cuenta=" + num_cuenta + "]";
	}
	
}
