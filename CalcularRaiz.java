package Matematica;

import java.util.ArrayList;

public class CalcularRaiz {

		int raiz(int valor) {
		int impar;
		impar = 1;
		
		
		
		ArrayList<Integer> result = new ArrayList<>();
		int resultados;
	    
	   
	    	  do {
	    	  valor = valor - impar;
		      impar = impar + 2;
		      resultados = valor; 
		      
		      result.add(resultados);
		      
	    	  
	      }while(valor > impar); 
	    	  int r = result.size();
	    	  System.out.println("A raiz quadrada pedida foi:" + r);
	    	  
			
		return r; 

		}
		}
	
	
	