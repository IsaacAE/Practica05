import java.util.Scanner;
import java.lang.String;

/**
 *Clase MainCuenta
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 */

public class MainCuenta{
/**
 *Método que presenta un ejemplo y simula la creación de una cuenta bancaria
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 *@param args
 */
    public static void main(String[] args){
        //Variable para guardar el nombre del titular
	String nombre;
	 //Variable para guardar el dinero que deposita el titular a su cuenta
	double deposito;

	 //Se crea el objeto sc de la clase escaner para recoger los datos del tipo String dados por el usuario
	Scanner sc = new Scanner(System.in);
	 //Se crea el objeto sc de la clase escaner para recoger los datos del tipo double  dados por el usuario
	Scanner num= new Scanner(System.in);
	//Se crea un nuevo objeto de la clase cuenta usando el constructor sin parámetros
	Cuenta usuario = new Cuenta();
		//Se crea un nuevo objeto de la clase cuenta usando el constructor con parámetros
	 Cuenta usuarioExtra = new Cuenta("nuevo usuario");

	

	//Se muestra en pantalla el ejemplo al usuario
	System.out.println("Este es nuestro sistema de creación de cuentas bancarias BancoMeme");
	System.out.println("Permítanos mostrarle un ejemplo de cuenta en nuestro Banco");
	 System.out.println("Bienvenido "+ usuario.getTitular()+" los datos actuales de su cuenta son los siguientes: " + usuario.toString()+"\n");
	 System.out.println("Espereamos este ejemplo haya sido de ayuda, ahora podrá crear su cuenta bancaria aquí en BancoMeme c: \n");
	//Finaliza la presentación del ejemplo y se da bienvenida al usuario
	 //Se solicita al usuario que ingrese su nombre
	  System.out.println("Bienvenido, " + usuarioExtra.getTitular()+", ¿cuál es su nombre?");
	  //Se recopila el valor dado por el usuario y se le asigna a la variable "nombre"
	    nombre=sc.nextLine();
	    //Se modifica el atributo "titular" del segundo objeto de la clase cuenta, donde el parámetro será el valor guardado en la variable "nombre"
	    usuarioExtra.setTitular(nombre);
	    //Se muestra al usuario el nuevo nombre de la cuenta
	    System.out.println("Bienvenido, "+ usuarioExtra.getTitular()+", actualmente su cuenta tiene "+usuarioExtra.getDineroDisponible()+" pesos");
	    //Se solicita al usuario que escriba el valor del dinero que desea depositar
       System.out.println("Indique la cantidad que desea depositar para iniciar su cuenta");
       //Se recoge el valor dado por el usuario y se asigna a la variable deposito
    deposito=num.nextDouble();
    //Se modifica el atributo "dineroDisponible" del segundo objeto de la clase cuenta, donde el valor nuevo será el de la variable "deposito"
    usuarioExtra.setDineroDisponible(deposito);
    //Se muestra al usuario el cambio realizado
    System.out.println("Ahora el dinero en su cuenta es de: " + usuarioExtra.getDineroDisponible() +" pesos");

    //Se muestran todos los datos de la cuenta al usuario con el método toString 
    System.out.println("Su cuenta ha sido registrada exitosamente y éstos son los datos:");
    System.out.println(usuarioExtra.toString());
    //Despedida al usuario
	System.out.println("\n Gracias por su preferencia, hasta luego");
   
    }

}
