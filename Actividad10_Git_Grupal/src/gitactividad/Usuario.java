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
		
		  public double calcularValoracionMedia() {
		        if (valoraciones.length == 0)
		            return 0;
		        int suma = 0;
		        for (double valoracion : valoraciones) {
		            suma += valoracion;
		        }
		        return suma / valoraciones.length;
		    }


		    public void mostrarValoraciones() {
		        System.out.println("Valoraciones del usuario " + nombre + " : " + Arrays.toString(valoraciones));
		    }

		    public int contarValoracionesSuperiores(double valoracion) {
		        int contador = 0;
		        for (double v : valoraciones) {
		            if (v > valoracion) {
		                contador++;
		            }
		        }
		        return contador;
		    }

		    public boolean valoracionSuperaMedia(int valoracion) {
		        return valoracion > calcularValoracionMedia();
		    }

		    @Override
		    public String toString() {
		        return "Usuario{" +
		                "id=" + id +
		                ", nombre='" + nombre + '\'' +
		                ", valoraciones=" + Arrays.toString(valoraciones) +
		                '}';
		    }

		   
		    }


