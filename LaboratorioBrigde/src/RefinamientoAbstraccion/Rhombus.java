package RefinamientoAbstraccion;

import Abstraccion.Shape;
import Interfaces.Color;

public class Rhombus extends Shape {

    public Rhombus(Color color){
        super(color);
    }

    @Override
    public void draw(){
        System.out.print("Dibujaste un rombo ");
        color.darColor();
    }
}
