package DecoradorConcreto;

import Componente.HeladoComponente;
import Decorador.ToppingDecorador;

public class Gomitas extends ToppingDecorador {

    public Gomitas(HeladoComponente helado) {
        super(helado);
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + "con Gomitas";
    }

    @Override
    public double getCosto() {
        return helado.getCosto() + 1.000;
    }
}
