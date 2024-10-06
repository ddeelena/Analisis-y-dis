package DecoradorConcreto;

import Componente.HeladoComponente;
import ComponenteConcreto.HeladoComponenteConcreto;
import Decorador.ToppingDecorador;

public class Fresas extends ToppingDecorador {

    public Fresas(HeladoComponente helado) {
        super(helado);
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " con fresas ";
    }

    @Override
    public double getCosto() {
        return helado.getCosto() + 2.000;
    }
}
