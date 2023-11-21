package edu.numerosPri.Servicios;

public class CalPrimoImplementacion implements CalPrimoInterfaz {

	public boolean esPrimo(int validar) {
		
		int avalidar = validar;
		int j = 0;
		
		for ( j = avalidar-1 ; j>1; j--) {
			
			
			avalidar%j;
			
		}
		
	}
	
}
