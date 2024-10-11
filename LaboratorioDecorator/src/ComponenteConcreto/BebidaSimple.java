package ComponenteConcreto;

import Componente.Bebida;

public class BebidaSimple implements Bebida {

    // Obtenemos la descripcion de la bebida base
    @Override
    public String obtenerDescripcion() {
        return "Bedida simple";
    }

    // le ponemos un costo base a la bebida
    @Override
    public double costo() {
        return 1.0;
    }
}
