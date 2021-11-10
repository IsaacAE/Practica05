/**
 *Clase CicloWhile 
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 */
public class CicloWhile{
    /** 
 *@author Alcántara Estrada Kevin Isaac
 *@method main - sirve para imprimir en pantalla los números primos existentes entre 1 y 1000
 *@param args
 */
    public static void main(String[] args){
	
	 // Se declaran 4 variables de tipo entero y se inicializan
	 
	int i=1, j=1, cont=0, primo=0;

	//Se inicia el primer ciclo while, cuya condición es que se ejecutará sólo si el valor de "i" es menor o igual a 1000
	 
	while(i<=1000){

	    //Se inicia el segundo ciclo while, cuya condición es que se ejecutará sólo si el valor de "j" es menor o igual a "i"
	 
            while(j<=i){
			
		//Se inicia una condicional donde se analiza si el residuo de la división de "i" ente "j" es igual a 0
	 
		if(i%j==0){
		    	
		    // Si la condición se cumple se incrementa en 1 el valor de la variable cont
	 
		    cont++;
                  
		}
			    	
		//Se incrementa en 1 el valor de la variable j
	 
		j++;
		
	    }
	    
	    
            	
	    //Se inicia otro if, donde la condición es que el valor de la variable cont sea igual a 2
	 
	    if(cont==2){
			
		//Si la condición se cumple se imprime en pantalla el valor de i, junto con el mensaje de que el número es primo
	 
	         	System.out.println("El número " + i + " es primo");
				
			//En este punto se termina el segundo ciclo while y volvemos al inicio de este  
	 
			 }
	    	  	
	    //Se le asigna el valor de 0 a la variable "cont" para no tener resultados erróneos en procesos posteriores  
	 
	    cont=0;
	    	
	    //Se le asigna el valor de 1 a la variable "j" para no tener resultados erróneos en procesos posteriores  
	 
	    j=1;
	    	
	    //Se incrementa en 1 el valor de la variable "i"
	 
          i++;
		
	  //En este punto se termina el primer ciclo while y volvemos al inicio del mismo 
	   
	}
	 


    }

}



      
