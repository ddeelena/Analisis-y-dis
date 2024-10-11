package Decorador;

import Componente.Bebida;

public abstract class DecoradorBebida implements Bebida {

    // obtenemos una instancia de la bebida, la cual sera la que se decore
    protected Bebida bebida;


    // Constructor que utilizaran las clases hijas
    public DecoradorBebida(Bebida bebida){
        this.bebida= bebida;
    }

}
