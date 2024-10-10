package RefinamientoAbstraccion;

import Abstraccion.Shape;
import Interfaces.Color;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujaste un triangulo ");
        color.darColor();
    }
}
