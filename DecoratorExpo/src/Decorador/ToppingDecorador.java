package Decorador;

import Componente.HeladoComponente;
import ComponenteConcreto.HeladoComponenteConcreto;

public abstract class ToppingDecorador implements HeladoComponente {
    protected HeladoComponente helado;

    protected ToppingDecorador(HeladoComponente helado){
        this.helado =helado;
    }

}
