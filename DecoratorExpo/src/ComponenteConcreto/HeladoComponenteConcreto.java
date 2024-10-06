package ComponenteConcreto;

import Componente.HeladoComponente;

public class HeladoComponenteConcreto implements HeladoComponente {

    @Override
    public String getDescription() {
        return "Vaso de helado";
    }

    @Override
    public double getCosto() {
        return 5.000;
    }
}
