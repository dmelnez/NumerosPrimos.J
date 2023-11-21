package edu.numerosPri.Servicios;

import java.util.Scanner;

public class PedirNumImplementacion implements PedirNumInterfaz{

	public int  solNum(Scanner numerIntro) {
		
		
		System.out.println("¿Cuantos Numeros Primos desea Calcular?");
		Scanner mi = new Scanner (System.in);
		int numeroPri = numerIntro.nextInt();
		return numeroPri;
	}
	
}
