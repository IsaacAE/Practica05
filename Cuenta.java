/**
 *Clase Cuenta
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0
 */
public class Cuenta{
    /**
     *Atributo que contendrá el nombre del titular de la cuenta
     */
    private String titular;
     /**
     *Atributo que contendrá la cantidad eel dinero de la cuenta
     */
    private double dineroDisponible;
/**
 *@author Alcántara Estrada Kevin Isaac
 *@method getTitular
 *Sirve para obtener el valor del atributo "dineroDisponible" de un objeto de la clase Cuenta
 *@return String titular
 */
    public String getTitular(){
	return this.titular;
    }
/**
 *@author Alcántara Estrada Kevin Isaac
 *Sirve para modificar el valor del atributo "titular" de un objeto de la clase Cuenta
 *@method setTitular 
 *@param titular nombre del titular
 */
    public void setTitular(String titular){
	this.titular=titular;
    }
/**
 *@author Alcántara Estrada Kevin Isaac
 *Sirve para obtener el valor del atributo "dineroDisponible" de un objeto de la clase Cuenta
 *@method getDineroDisponible 
 *@return double dineroDisponible
 */
    public double getDineroDisponible(){
	return this.dineroDisponible;
    }
    /**
 *@author Alcántara Estrada Kevin Isaac
 * Sirve para modificar el valor del atributo "dineorDisponible" de un objeto de la clase Cuenta
 *@method setDineroDisponible
 *@param dineroDisponible cantidad de dinero de la cuenta
 */
    public void setDineroDisponible(double dineroDisponible){
	this.dineroDisponible=dineroDisponible;
    }
 /**
 *@author Alcántara Estrada Kevin Isaac
 *@method Constructor 
*Crea un objeto de la clase cuenta sin recibir parámetro, cuyo valor de sus atributos es preestablecido por el programador
 */
    public Cuenta(){
	this.titular= "Iván Cadena Alcántara";
	this.dineroDisponible=5375.89;
    }
 /**
 *@author Alcántara Estrada Kevin Isaac
 *
 *@method Constructor 
*Crea una objeto de la clase cuenta que recibe el parámetro dle nombre del titular
 *@param titular nombre del titular
 */
    public Cuenta(String titular){
	this.titular=titular;
	this.dineroDisponible=0;
    }
/**
 *@author Alcántara Estrada Kevin Isaac
 *Método queregresa el valor de los atributos del objeto de la clase cuenta junto con un mensaje de lo que se muestra en pantalla
 *@method toString 
 *@return String
 */
    public String toString(){
	return "El titular de la cuenta es "+this. titular + " y el dinero disponible es de " + this.dineroDisponible + " pesos";
    }
    
}
