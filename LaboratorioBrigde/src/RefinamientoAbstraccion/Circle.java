package RefinamientoAbstraccion;

import Abstraccion.Shape;
import Interfaces.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujaste un circulo ");
        color.darColor();
    }
}
