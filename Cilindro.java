/** 
 *Clase Cilindro
 *@author Alcantara Estrada Kevin Isaac
 *@version 1.0
 */
public class Cilindro{
    /** 
 *@author Alcantara Estrada Kevin Isaac
 *@method main para calcular el area y volumen de un cilindro con valores pre-establecidos
 *@param args
 */
    public static void main(String[] args){
	// Se declaran dos variables de tipo entero, una llamada radio (de valor 10) y otra llamada altura (de valor 20) que corresponden a las medidas de esos elementos del cilindro
	 
	int radio=10, altura=20;
		
	 //Se declaran dos variables de tipo double
	double pi=3.1416, area, volumen;
		
	 //Se imprime en pantalla los datos que se presentaran al usuario
	 
        System.out.println("\nÁrea y volumen de un cilindro\n");
        
	//Se calcula el volumen y se le asigna el valor a la variable volumen
	 
	volumen=pi*altura*radio*radio;
		
	//Se calcula el area y se le asigna el valor a la variable área
	 
	area=(2*3.1416*radio*altura)+(2*3.1416*radio*radio);
		
	//Se imprime en pantalla el valor del área del cilindro
	 
	System.out.println("El área del cilindro es " + area + " cm²");
		
	//Se imprime en pantalla el valor del volumen  del cilindro
	 
	System.out.println("El volumen del cilindro es " + volumen + " cm³");
	
    }
}
