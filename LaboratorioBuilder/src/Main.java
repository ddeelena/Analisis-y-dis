import Java.Vehiculo;
import Java.VehiculoBuilder;
import Java.VehiculoBuilderImpl;
import Java.VehiculoDirector;

public class Main {
    public static void main(String[] args) {

        VehiculoBuilder builder = new VehiculoBuilderImpl();

        VehiculoDirector director = new VehiculoDirector(builder);

        Vehiculo  deportivo = director.VehiculoDeportivo();
        System.out.println(deportivo.imprimirCaracteristicas());

    }
}