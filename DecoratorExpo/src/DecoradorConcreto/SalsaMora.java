package DecoradorConcreto;

import Componente.HeladoComponente;
import Decorador.ToppingDecorador;

public class SalsaMora extends ToppingDecorador {

    public SalsaMora(HeladoComponente helado) {
        super(helado);
    }

    @Override
    public String getDescription() {
        return helado.getDescription() + " con salsa de mora";
    }

    @Override
    public double getCosto() {
        return helado.getCosto() + 1.000;
    }
}
