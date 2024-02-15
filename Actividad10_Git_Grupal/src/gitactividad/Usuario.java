package gitactividad;

import java.util.Arrays;

public class Usuario {
		
		// Atributos
		String id;
		String nombre;
		double valoraciones[];
		
		// Constructores
		public Usuario() {
			super();
		}
		public Usuario(String id, String nombre, double[] valoraciones) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.valoraciones = valoraciones;
		}
}
