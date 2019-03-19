package examen.ejercicio1;

import java.util.LinkedList;

public class SociedadAnonima {
	private String nombre;
	private LinkedList<String> lista_trabajos = new LinkedList<String>();
	
	public SociedadAnonima(String nombre, LinkedList<String> lista_trabajos) {
		this.nombre = nombre;
		this.lista_trabajos = lista_trabajos;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "SociedadAnonima [nombre=" + nombre + ", lista_trabajos=" + lista_trabajos + "]";
	}
}
