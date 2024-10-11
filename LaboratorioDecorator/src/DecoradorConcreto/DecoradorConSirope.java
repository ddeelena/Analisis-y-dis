package DecoradorConcreto;

import Componente.Bebida;
import Decorador.DecoradorBebida;

public class DecoradorConSirope extends DecoradorBebida {

    // constructor que le manda la bebida a la clase padre
    public DecoradorConSirope(Bebida bebida) {
        super(bebida);
    }

    //implementacion del metodo para obtener la descricpion de la bebida que se va a decorar y sumar le el nuevo decorador
    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", con sirope";
    }

    // implementacion del metodo costo que obtiene el costo de la bebida base y le suma el costo del decorador
    @Override
    public double costo() {
        return bebida.costo() + 0.5;
    }
}
