import Componente.HeladoComponente;
import ComponenteConcreto.HeladoComponenteConcreto;
import DecoradorConcreto.Fresas;
import DecoradorConcreto.Gomitas;
import DecoradorConcreto.SalsaMora;

public class Main {
    public static void main(String[] args) {

        HeladoComponente helado = new HeladoComponenteConcreto();
        System.out.println(helado.getDescription());
        System.out.println(helado.getCosto());

        helado = new Fresas(helado);
        System.out.println(helado.getDescription());
        System.out.println(helado.getCosto());

        helado = new Gomitas(helado);
        System.out.println(helado.getDescription());
        System.out.println(helado.getCosto());

        helado = new SalsaMora(helado);
        System.out.println(helado.getDescription());
        System.out.println(helado.getCosto());
    }
}


