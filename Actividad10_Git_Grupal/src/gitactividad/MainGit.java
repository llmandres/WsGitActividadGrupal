package gitactividad;

import java.util.Scanner;

public class MainGit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Usuario[] user1 = new Usuario[3];
		System.out.println("Cuantas valoraciones va a introducir en general?");
		int arrayTamanio = scan.nextInt();
		user1[0] = new Usuario("2321f", "Paco", new double[arrayTamanio]);
		user1[1] = new Usuario("1WDSF", "JUAN", new double[] { 1.0, 3.4, 5.2, 6.2, 10.0 });
		user1[2] = new Usuario("1112D", "Antonio", new double[arrayTamanio]);

		System.out.println("Valoraciones Primer usuario");
		for (int j = 0; j < arrayTamanio; j++) {
			double valoracion = 0;
			do {
				System.out.println("Introduce la valoracion numero " + (j + 1));
				valoracion = scan.nextDouble();
			} while ((valoracion > 10) || (valoracion < 0));
			user1[0].valoraciones[j] = valoracion;
		}

		System.out.println("Valoraciones Segundo usuario");
		for (int j = 0; j < arrayTamanio; j++) {
			double valoracion = 0;
			do {
				System.out.println("Introduce la valoracion del Usuario 3 | numero " + (j + 1));
				valoracion = scan.nextDouble();
			} while ((valoracion > 10) || (valoracion < 0));
			user1[2].valoraciones[j] = valoracion;
		}

		for (int i = 0; i < user1.length; i++) {
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------");
			System.out.println("Usuario " + (i + 1));
			// TOSTRING
			System.out.println(user1[i]);
			// Devolver Valoracion Media
			System.out.println("La media de las valoraciones es: " + user1[i].calcularValoracionMedia());
			// Mostrar valoraciones
			user1[i].mostrarValoraciones();
			// Devolver puntuaciones más altas
			System.out.println("La cantidad de notas más altas es: " + user1[i].contarValoracionesSuperiores(5));
			// Devolver mayor y menor media
			System.out.println("La valoracion supera la media de valoraciones ? = "
					+ user1[i].valoracionSuperaMedia(7));
			System.out.println(
					"---------------------------------------------------------------------------------------------------------------");
		}
		scan.close();
	}
}
