package com.aepi;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MayoMenorFichero {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File fichero = new File("mayorMenor.txt");
		int numMayor, numMenor;
		
		
		try {
			
			BufferedReader lectura = new BufferedReader(new FileReader(fichero));
			String linea = lectura.readLine();
			
			// Creamos un arrayList y le añadimos cada linea dentro del bucle.
			ArrayList <Integer> numeros = new ArrayList<>();
			
			while(linea != null) {
				numeros.add(Integer.parseInt(linea));
				linea = lectura.readLine();
			}
			
			//Imprimimos ArrayList desordenado
			System.out.println("\nLa lista de numeros en un ArrayList: " + numeros);

			// Ordenamos la lista en orden ascendente con el metodo sort de la clase Collection.
			Collections.sort(numeros);
			
			//Imprimimos ArrayList ordenado	
			System.out.println("\nLa lista de numeros en el ArrayList ya ordenado: " + numeros);
			
			// Con el metodo get() de Array asignamos la primera posicion (num mas bajo) a numMenor.
			numMenor = numeros.get(0);
			
			// Sacamos la posicion del ultimo elemento de la lista ordenada ascendente. Usamos el metodo size de Array que no devuelve el total y le restamos 1 porque empieza en 0.
			int	ultimoElemento = numeros.size() - 1;
			
			// Con el metodo get() de Array asignamos la ultima posicion (num mas alto) a numMayor.
			numMayor = numeros.get(ultimoElemento);
			
			//Imprimimos
			System.out.println("\nEl numero mayor es: " + numMenor + ".\nEl más pequeño es: " + numMayor);
			
			
	
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
