import java.util.Scanner;
/** 
 *Clase Bisiesto
 *@author Alcántara Estrada Kevin Isaac 
 *@version 1.0
 */
public class Bisiesto{
    	    	/** 
 *Método que sirve para decidir si un año es bisiesto o no
 *@author Alcántara Estrada Kevin Isaac
 *@param args
 */	
    public static void main(String[] args){
 
         // Variable de tipo entero para el año que se desea analizar
	 
	int anio;

	//Objeto de la clase Scanner para caputar el valor del año dado por el usuario
	 
	Scanner sc = new Scanner(System.in);

	//Se solicita al usuario que escriba el año que desee analizar
	 
	System.out.print("Ingresa el año que deseas saber si es bisiesto o no: ");
	//Se asigna el valor escaneado a la varibale anio
	 
	anio = sc.nextInt();

	//Se pregunta si el valor de anio es menor que 100 y divisible entre 4
	 
	if(anio<100 && anio%4==0){

	    //Se imprime en pantalla que el año es bisiesto
	 
	   System.out.println("El año " + anio +  " es bisiesto");
           	/*
         Si la condición anterior no se cumple, se pregunta si el valor de anio es divisible entre 4 y no es divisible entre 100 o es divisible entre 400
	 */
	}else if(anio%4==0 &&(anio%100!=0 || anio%400==0)){
	    
	    //Se imprime en pantalla que el año es bisiesto
	 
             System.out.println("El año " + anio + " es bisiesto");
	    }else{
	      /*
         Si las condiciones anteriores no se cumplen, se  imprime en pantalla que el año no es bisiesto
	 */
		System.out.println("El año " + anio + " no es bisiesto");

	    }

    }

}
