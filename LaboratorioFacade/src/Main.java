import Facade.CasaFacade;

public class Main {
    public static void main(String[] args) {

        CasaFacade casa = new CasaFacade();

        casa.modoNoche();

        System.out.println();

        casa.modoDia();

        System.out.println();

        casa.salirDeCasa();
    }
}