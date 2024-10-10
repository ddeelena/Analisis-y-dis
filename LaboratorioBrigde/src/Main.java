import Abstraccion.Shape;
import Implementaciones.Green;
import Implementaciones.Red;
import Implementaciones.Yellow;
import RefinamientoAbstraccion.Circle;
import RefinamientoAbstraccion.Rhombus;
import RefinamientoAbstraccion.Triangle;

public class Main {
    public static void main(String[] args) {

        //Creamos una objeto de tipo Shape(Interface), y le enviamos una instancia del color que queremos

        Shape redCircle = new Circle(new Red());  //Creamos un circulo de color rojo
        Shape greenTriangle = new Triangle(new Green()); //Creamos un triangulode color verde
        Shape yellowRhombus = new Rhombus(new Yellow()); //Creamos un rombo amarillo

        redCircle.draw(); // Da como resultado que hemos creado un ciruclo color rojo
        greenTriangle.draw(); // Da como resultado que hemos creado un triangulo color verde
        yellowRhombus.draw();  // Da como resultado que hemos creado un rombo color amarillo
    }
}