import Abstraccion.Shape;
import Implementaciones.Green;
import Implementaciones.Red;
import Implementaciones.Yellow;
import RefinamientoAbstraccion.Circle;
import RefinamientoAbstraccion.Rhombus;
import RefinamientoAbstraccion.Triangle;

public class Main {
    public static void main(String[] args) {

        Shape redCircle = new Circle(new Red());
        Shape greenTriangle = new Triangle(new Green());
        Shape yellowRhombus = new Rhombus(new Yellow());

        redCircle.draw();
        greenTriangle.draw();
        yellowRhombus.draw();
    }
}