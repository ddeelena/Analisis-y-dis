package Decorador;

import Componente.HeladoComponente;

public abstract class ToppingDecorador implements HeladoComponente {
    protected HeladoComponente helado;

    protected ToppingDecorador(HeladoComponente helado){
        this.helado =helado;
    }

}
