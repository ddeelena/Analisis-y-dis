package Java;

public class Vehiculo {

    //atributos del vehiculo

    private final String tipo;
    private final Integer nRuedas;
    private final String color;
    private final String modelo;
    private final boolean dispoibilidad;
    private final String motor;

    public Vehiculo(String tipo, Integer nRuedas, String color, String modelo, boolean dispoibilidad, String motor) {
        this.tipo = tipo;
        this.nRuedas = nRuedas;
        this.color = color;
        this.modelo = modelo;
        this.dispoibilidad = dispoibilidad;
        this.motor = motor;
    }

    public String imprimirCaracteristicas(){

        String disponible;
        if(dispoibilidad){
            disponible= "Esta disponible";
        }else {
            disponible ="No esta disponible";
        }

        return "El vehiculo es de tipo " + tipo+
                ", modelo " + modelo +
                ", color "+ color+
                ", con un motor " +motor+
                " y " + disponible;
    }

}
