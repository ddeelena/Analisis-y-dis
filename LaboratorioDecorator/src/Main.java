import Componente.Bebida;
import ComponenteConcreto.BebidaSimple;
import DecoradorConcreto.DecoradorConChocolate;
import DecoradorConcreto.DecoradorConCrema;
import DecoradorConcreto.DecoradorConSirope;

import javax.swing.plaf.basic.BasicEditorPaneUI;

public class Main {
    public static void main(String[] args) {

        // Creamos una bebida simple
        Bebida bebida = new BebidaSimple();
        System.out.println(bebida.obtenerDescripcion() + " . Costo de $"+ bebida.costo());

        // le sumamos crema a la bebida simple
        bebida = new DecoradorConCrema(bebida);
        System.out.println(bebida.obtenerDescripcion() + " . Costo de $"+ bebida.costo());

        // le sumamos chocolate a la bebida simple con crema
        bebida = new DecoradorConChocolate(bebida);
        System.out.println(bebida.obtenerDescripcion() + " . Costo de $"+ bebida.costo());

        // le sumamos sirope a la bebida simple con crema y chocolate
        bebida = new DecoradorConSirope(bebida);
        System.out.println(bebida.obtenerDescripcion() + " . Costo de $"+ bebida.costo());

    }
}