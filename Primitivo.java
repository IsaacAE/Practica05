/**
 *Clase Primitivo
 *@author Alcántara Estrada Kevin Isaac
 * @version 1.0
 */
public class Primitivo{
    /**
*Método para imprimir la cantidad de bytes que ocupa cada tipo de dato primitivo en java
 *@author Alcántara Estrada Kevin Isaac
 *@param args
 */
    public static void main(String[] args){
	
	//Imprime en pantalla el título del programa, un previo de lo que se presentará
	 
	System.out.println("Datos Primitivos\n" );
	
	//Imprime en pantalla la cantidad de bytes que ocupa en la memoria el dato primitivo de tipo byte
	
	System.out.println("byte: " + Byte.BYTES + " bytes" );
	
	//Imprime en pantalla la cantidad de bytes que ocupa en la memoria el dato primitivo de tipo shor
	 
	System.out.println("short: " + Short.BYTES + " bytes");

	//Imprime en pantalla la cantidad de bytes que ocupa en la memoria el dato primitivo de tipo int
	 
	System.out.println("int: " + Integer.BYTES + " bytes");

	//Imprime en pantalla la cantidad de bytes que ocupa en la memoria el dato primitivo de tipo long
	 
	System.out.println("long: " + Long.BYTES + " bytes");

	//Imprime en pantalla la cantidad de bytes que ocupa en la memoria el dato primitivo de tipo float
	 
	System.out.println("float: " + Float.BYTES + " bytes");

	//Imprime en pantalla la cantidad de bytes que ocupa en la memoria el dato primitivo de tipo double
	 
	System.out.println("double: " + Double.BYTES + " bytes");

	//Imprime en pantalla la cantidad de bytes que ocupa en la memoria el dato primitivo de tipo boolean
	 
	System.out.println("boolean: 1 bytes " );

	//Imprime en pantalla la cantidad de bytes que ocupa en la memoria el dato primitivo de tipo char
	 
	System.out.println("char: " + Character.BYTES + " bytes");
    }
}
