package Java;


public class VehiculoDirector {

    private final VehiculoBuilder builder;

    // Contructor del vehiculo

    public VehiculoDirector(VehiculoBuilder biulder){
        this.builder =biulder;
    }

    public Vehiculo VehiculoDeportivo(){
        builder.setColor("rojo");
        builder.setModelo("2022");
        builder.setDispoibilidad(true);
        builder.setMotor("R6");
        builder.setnRuedas(4);
        builder.setTipo("Deportivo");
        return builder.builder();
    }

    public Vehiculo VehiculoCamioneta(){
        builder.setColor("blanco");
        builder.setModelo("2019");
        builder.setDispoibilidad(true);
        builder.setMotor("R2");
        builder.setnRuedas(4);
        builder.setTipo("Camioneta");
        return builder.builder();
    }

}
