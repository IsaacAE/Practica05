import java.util.Scanner;
/**
 * Clase Condicionales 
 * @author Alcántara Estrada Kevin Isaac
 * @version 1.0
 */
public class Condicionales{
    /**
 * * Método que sirve para decidir cuál de dos números es mayor
 * @author Alcántara Estrada Kevin Isaac
 * @param args
 */
    public static void main(String[] args){

	// Se crean dos variables de tipo float, una para cada número a recibir
 
	float num1, num2;

	// Se crea un objeto de la clase Scanner para poder recoger los datos dados por el usuario
 
        Scanner num = new Scanner(System.in);

	// Se solicita en patalla, al usuario, que escriba el valor del primer número
 
	System.out.print("Dame el número 1: ");
			
// Se asigna el valor escaneado a la variable num1
 
	num1 = num.nextFloat();

	// Se solicita en patalla, al usuario, que escriba el valor del segundo número
 
	System.out.print("Dame el número 2: ");

	// Se asigna el valor escaneado a la variable num2
 
	num2 = num.nextFloat();

	// Se pregunta si el valor de la variable num1 es mayor al valor de la variable num2
 
	if(num1>num2){

	    // Si se cumple la condición, se imprime en pantalla que el número de mayor valor es el contenido en la variable num1
 
	    System.out.println("El número con mayor valor es " + num1);
	}else{

	    // Si no  se cumple la condición, se imprime en pantalla que el número de mayor valor es el contenido en la variable num2
 
	    System.out.println("El número con  mayor valor es " + num2);
	}
    }
}
