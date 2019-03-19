package examen.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class StringUtil {
	
	public static int contarLetrasUnicas(String cadena) {
		int letras = 0;
		for (int i=0; i<cadena.length() - 1; i++) {
			if (cadena.charAt(i) != cadena.charAt(i + 1)) {
				letras++;
			}
		}
		return letras;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cadena = "cadena";
		System.out.println(contarLetrasUnicas(cadena));
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(contarLetrasUnicas(cadena));
		System.out.println(lista1);
		ArrayList<String> lista = new ArrayList<String>();
		lista.add(cadena);
		System.out.println(lista);
	}
}
