/**
 *Clase CicloDoWhile
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 */
public class CicloDoWhile{
    /**
 *Clase CicloDoWhile
 *@author Alcántara Estrada Kevin Isaac
 *@method main -para imprimir en pantalla los números primos del 1 al 1000
 *@param args
 */
    public static void main(String[] args){

	// Se declaran 4 variables de tipo entero y se inicializan
	 
	int i=1, j=1, cont=0, primo=0;

	// Se inicia el primer ciclo do-while
	 
	do{

	    // Se inicia el segundo ciclo do-while
	 
	    do{

		// Se abre una conidiconal y se pregunta si el residuo de la división de i entre j es igual a 0
	 
		if(i%j==0){

		    // Si se cumple la conidiconal se incrementa en 1 el valor de la variable "cont"
	 
		    cont++;
		}

		// Se incrementa en uno el valor de la varibale "j"
	 
		j++;

		//Se pregunta si j es mayor o igual a i para continuar el ciclo do-while
	 
	    }while(j<=i);

	    //Se abre otra condicional y se pregunta si el valor de la variable cont es igual a 2
	     
	    if(cont==2){

		//Si la condicional se cumple se imprime en pantalla el valor de i y el mensaje de que es un número primo
	     
                 	System.out.println("El número " + i + " es primo");
	      
		   

		    
	
	    }

	    //Se le asigna el valor de 0 a la variable "cont" (para que no se afecte el resultado en procesos posteriores)
	     
            cont=0;

	    //Se le asigna el valor de 1 a la variable "j" (para que no se afecte el resultado en procesos posteriores)
	     
	    j=1;
	    
	     //Se le incrementa en 1 el valor a la variable "i"
	     
	    i++;
	     
	     //Se pregunta si el valor de "i" es menor o igual a 1000 para continuar o no con el ciclo do-while 
	     
	}while(i<=1000);


    }

}
