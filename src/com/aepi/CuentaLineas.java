package com.aepi;
import java.io.*;


public class CuentaLineas {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		String fichero = "cuentaLineas.txt";
		int num = 0, numTotal = 0;
		
		try (BufferedReader contar = new BufferedReader(new FileReader(fichero))){
			String linea;
			while((linea = contar.readLine()) != null){
				num++;
				}
			if(num > numTotal) {
				numTotal = num;
				System.out.println(numTotal);	
			}	
		}
	}

}
