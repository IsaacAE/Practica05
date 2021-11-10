/**
 *Clase Rectangulo 
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 */
public class Rectangulo{
    //Atributo que representa la base del rectángulo
    private double base;
    //Atributo que representa la altura del rectángulo
    private double altura;
/** 
 *Método que obtiene el valor del atributo "base
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 *@return double base
 */
    public double getBase(){
	return this.base;
    }
/** 
 *Método que modifica el valor del atributo "base"
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 *@param base base del rectángulo
 */
    public void setBase(double base){
	this.base=base;
    }
    /** 
     *Método para obtener el valor del atributo "base"
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 *@return double altura
 */

    public double getAltura(){
	return this.altura;
    }
/** 
 *Método para modificar el valor del atributo "altura"
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 *@param altura altura del rectángulo
 */
    public void setAltura(double altura){
	this.altura=altura;
    }

/** 
 *Método que muestra los valores de los atributos de la clase
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 *@return String
 */
    public String toString(){

	return "La base del rectángulo es " + base + "cm y la altura es " + altura+"cm";
    }
/** 
 *Crea un objeto de la clase Rectangulo con el valor de los atributos preestablecidos por el creador del programa
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 */
    public Rectangulo(){
	this.base=5.12;
	this.altura=4.2;
    }
/** 
 *Crea un objeto de la clase Rectangulo donde recibe parámetros
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 *@param base base del rectángulo
 *@param altura altura del rectángulo
 */
    public Rectangulo(double base, double altura){
	this.base=base;
	this.altura=altura;
    }

/** 
 *Método para calcular el área del rectángulo
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 *@return double area
 */
    public double Area(){
        //Se calcula el área y se le asigna el valor a la variable "area"
	double area=this.base*this.altura;
	return area;	

    }
/** 
 *Metodo que calcula el perímetro del rectángulo
 *@author Alcántara Estrada Kevin Isaac
 *@version 1.0 
 *@return double perimetro
 */
    public double Perimetro(){
	//Se calcula el perimetro y se asigna ese valor a la variable "perimetro"
	double perimetro=(2*base)+(2*altura);
	return perimetro;
    }
}
