package RefinamientoAbstraccion;

import Abstraccion.Shape;
import Interfaces.Color;

public class Triangle extends Shape {

    // Constructor que recibe un objeto de tipo color, que pasa a la clase padre
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujaste un triangulo ");
        color.darColor();
    }
}
