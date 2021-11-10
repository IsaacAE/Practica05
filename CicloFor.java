/**
 * Clase CicloFor
 * @author Alcántara Estrada Kevin Isaac
 * @version 1.0
 */

public class CicloFor{
    
     /**
 * Método que sirve para imprimir los números primos existentes del 1 al 1000
 * @author Alcantara Estrada Kevin Isaac
 * @param args 
 */
    public static void main(String[] args){
	
	/* Ciclo for donde se declara la variable entera i inicializada en 0, que se repetirá el ciclo siempre y cuando i se mayor o igual a mil y, tras cada iteración, la variable i incrementa su valor en 1*/
	
	for(int i=0; i<=1000; i++){
	    
	     //Condicional if donde se pregunta si el valor de i es igual a 2,3,5,7,11,13,17,19,23,29 o 31
	    
	    if(i==2 || i==3 || i==29 || i==31 ||  i==5 ||  i==7 || i==11 ||i==13 || i==17 || i==19 || i==23){
		
		 //Si la condición se cumple se imprime en pantalla que el valor de i y la afirmación de que es primo
	    System.out.println("EL número " +i + " es primo");
	    
	     //Si la condición no se cumple, se abre una nueva condicional donde se pregunta si el número es divisible entre 1 y el resto de dividir el número entre 2,3,5,7,11,13,17,19,23,29 y 31 es distinto de cero
	    
	    }else if(i!=1 && i%19!=0 && i%23!=0 && i%17!=0 && i%13!=0 && i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0 && i%29!=0 && i%31!=0){
		
			//Si la condición se cumple se imprime en pantalla que el valor de i y la afirmación de que es primo
		
		System.out.println("El número " +i + " es primo");
		}
	}
	}
    }
