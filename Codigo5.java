package com.CodigoOtros;

import java.util.Scanner; //Importamos el Scanner

//Funcionamiento del programa: El programa le pide al usuario que introduzca un número, el número se evalúa y sí el número es 3,7, 8 o 9 imprime un mensaje diciendo: "El número # es un número afortunado", en caso de no ser alguno de estos números se imprime "El número # no es un número afortunado".

public class Codigo5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Corregimos el scanner y renombramos

		System.out.print("Introduce un número: ");
		String ni = scanner.nextLine(); // ni se convirtió de String a Int.
		int c = Integer.parseInt(ni);
		int original = c; // Añadimos una nueva variable para guardar le valor original de "c" y evitar
							// que nos devuela 0.

		int afo = 0;
		int noAfo = 0; // COlocamos el ";"

		while (c > 0) {
			int digito = (c % 10); // Eliminamos el int, pues "ni" ya es un entero
			if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
				afo++;
			} else {
				noAfo++;
			}

			c /= 10; // Trasladamos c afuera del else.

		}

		if (afo > noAfo) {
			System.out.println("El " + original + " es un número afortunado.");
		} else {
			System.out.println("El " + original + " no es un número afortunado.");
		}
		scanner.close();
	}

}