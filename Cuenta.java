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
 *Método que sirve para obtener el valor del atributo "titular" de un objeto de la clase Cuenta
 *@author Alcántara Estrada Kevin Isaac
 *@return String titular
 */
    public String getTitular(){
	return this.titular;
    }
/**
 *Método que sirve para modificar el valor del atributo "titular" de un objeto de la clase Cuenta
 *@author Alcántara Estrada Kevin Isaac
 *@param titular nombre del titular
 */
    public void setTitular(String titular){
	this.titular=titular;
    }
/**
 *Método que sirve para obtener el valor del atributo "dineroDisponible" de un objeto de la clase Cuenta
 *@author Alcántara Estrada Kevin Isaac 
 *@return double dineroDisponible
 */
    public double getDineroDisponible(){
	return this.dineroDisponible;
    }
    /**
 *Método que sirve para modificar el valor del atributo "dineorDisponible" de un objeto de la clase Cuenta
 *@author Alcántara Estrada Kevin Isaac
 *@param dineroDisponible cantidad de dinero de la cuenta
 */
    public void setDineroDisponible(double dineroDisponible){
	this.dineroDisponible=dineroDisponible;
    }
 /**
*Crea un objeto de la clase cuenta sin recibir parámetro, cuyo valor de los atributos es preestablecido por el programador
*@author Alcántara Estrada Kevin Isaac 
 */
    public Cuenta(){
	this.titular= "Iván Cadena Alcántara";
	this.dineroDisponible=5375.89;
    }
 /**
 *Crea una objeto de la clase cuenta que recibe un parámetro: el  nombre del titular
 *@author Alcántara Estrada Kevin Isaac 
 *@param titular nombre del titular
 */
    public Cuenta(String titular){
	this.titular=titular;
	this.dineroDisponible=0;
    }
/**
 *Método que regresa el valor de los atributos del objeto de la clase cuenta junto con un mensaje de lo que se muestra en pantalla
 *@author Alcántara Estrada Kevin Isaac
 *@return String
 */
    public String toString(){
	return "El titular de la cuenta es "+this. titular + " y el dinero disponible es de " + this.dineroDisponible + " pesos";
    }
    
}
