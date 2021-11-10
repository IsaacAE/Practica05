import java.util.Scanner;
/**
 *Clase MainRectangulo
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 */
public class MainRectangulo{
/**
 *Método que permite al usuario calcular el área y perímetro de un rectángulo después de mostrarle un ejemplo
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
@param args 
 */
    public static void main(String[] args){
	//Se declaran dos variables de tipo double
        double base, altura;

	//Se crea un objeto de la clase Scanner para recibir los datos dados por el usuario
	Scanner num = new Scanner(System.in);
	//Se crea un objeto de la clase Rectangulo usando el constructor sin parámetros
	Rectangulo rectanguloEjemplo = new Rectangulo();
	//Se crea un objeto de la clase Rectangulo usando el constructor con parámetros
	Rectangulo rectanguloUsuario = new Rectangulo(0,0);
	//Se presenta un ejemplo de la utilidad del programa al usuario
	System.out.println("Hola, bienvenido al programa para calcular área y perímetro de un rectángulo, permítenos mostrarte un ejemplo c:");
	System.out.println(rectanguloEjemplo.toString());
	System.out.println("El perímetro del rectángulo es de " + rectanguloEjemplo.Perimetro() + "cm");
	System.out.println("El área del rectángulo es de " + rectanguloEjemplo.Area()+ "cm² \n");
	//Se finaliza el ejemplo mostrado al usuario
       	System.out.println("Ahora escribe los datos del rectángulo que quieres calcular");
	//Se solicita al usuario que escriba el valor de la base de su rectángulo
	 System.out.print("Dame la base del rectángulo: ");
	 //Se escanea el valor dado por el usuario y se asigna a la variable "base"
	 base= num.nextDouble();
	 //Se modifica el valor del atributo "base", asignando ahora el valor contenido en la variable "base"
	 rectanguloUsuario.setBase(base);
	 //Se muestra en pantalla el valor de la base del rectángulo con el que trabajará el usuario
	 System.out.println("Ahora la base de tu rectángulo es de: "+ rectanguloUsuario.getBase()+"cm");
	 	//Se solicita al usuario que escriba el valor de la altura de su rectángulo
	  System.out.print("Dame la altura del rectángulo: ");
	   //Se escanea el valor dado por el usuario y se asigna a la variable "altura"
	 altura= num.nextDouble();
	  //Se modifica el valor del atributo "altura", asignando ahora el valor contenido en la variable "altura"
	 rectanguloUsuario.setAltura(altura);
	  //Se muestra en pantalla el valor de la altura del rectángulo con el que trabajará el usuario
	 System.out.println("Ahora la altura de tu rectángulo es de: "+ rectanguloUsuario.getAltura()+"cm");
	  //Se muestran en pantalla los datos del rectángulo que deseó el usuario
	 System.out.println("Los datos con los que se calculará el área y perímetro de tu rectángulo son los siguientes: ");
       	 System.out.println(rectanguloUsuario.toString());
	 //Se muestra el perímetro del rectángulo del usuario
		System.out.println("El perímetro de tu rectángulo es de " + rectanguloUsuario.Perimetro() + "cm");
		 //Se muestra el área del rectángulo del usuario
	System.out.println("El área de tu rectángulo es de " + rectanguloUsuario.Area()+ "cm² \n");
	//Despedida al usuario
	System.out.println("Esperamos haber sido de ayuda, hasta luego");
	
	
    }


}
