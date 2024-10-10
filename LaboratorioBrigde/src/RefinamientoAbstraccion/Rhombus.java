package RefinamientoAbstraccion;

import Abstraccion.Shape;
import Interfaces.Color;

public class Rhombus extends Shape {

    // Constructor que recibe un objeto de tipo color, que pasa a la clase padre
    public Rhombus(Color color){
        super(color);
    }


    // Metodo que implementa lo logica para dibujar un rombo
    @Override
    public void draw(){
        System.out.print("Dibujaste un rombo ");  //Implentacion del metodo
        color.darColor();
        // aplica el color de la figura, por medio del llamado del metodo darColor, del objeto color que se recibio
        // por parametro en el constructor y se paso a la clase padre
    }
}
