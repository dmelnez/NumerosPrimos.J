package edu.numerosPri.Controloradores;

import java.util.Scanner;

import edu.numerosPri.Servicios.CalPrimoImplementacion;
import edu.numerosPri.Servicios.CalPrimoInterfaz;
import edu.numerosPri.Servicios.PedirNumImplementacion;
import edu.numerosPri.Servicios.PedirNumInterfaz;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numerIntroUsu = new Scanner (System.in);
		PedirNumInterfaz mi = new PedirNumImplementacion();
		CalPrimoInterfaz mi02 = new< CalPrimoImplementacion();
		int numeroPri = mi.solNum(numerIntroUsu);
		System.out.println(numeroPri);
		



		int aux = 0;
		int i =1;
		
		while (aux<=10) {
			
			if (esPrimo(i)) {
				System.out.println("");
				aux++;
			}
			
		}
	


		    
	}

}
