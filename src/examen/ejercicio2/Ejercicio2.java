package examen.ejercicio2;

import java.util.ArrayList;

import examen.ejercicio1.Asalariados;
import examen.ejercicio1.Contratistas;
import examen.ejercicio1.Empleados;
import examen.ejercicio1.Servicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		Empleados e1 = new Contratistas("Cristiano", "Perez", "09-08-2015", 453, 2);
		Empleados e2 = new Asalariados("Adriana", "Rodriguez", "17-06-2016", 654);
		Servicios s1 = new Servicios("Limpieza de baños", "limpieza", 432);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(s1.toString());
		ArrayList<Empleados> lista = new ArrayList<Empleados>();
		lista.add(e1);
		lista.add(e2);
		System.out.println(lista);
	}

}
