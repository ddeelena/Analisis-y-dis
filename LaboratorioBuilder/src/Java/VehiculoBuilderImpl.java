package Java;

public class VehiculoBuilderImpl implements VehiculoBuilder{

    private String tipo;
    private Integer nRuedas;
    private String color;
    private String modelo;
    private boolean dispoibilidad;
    private String motor;

    @Override
    public void setTipo(String tipo) {
        this.tipo=tipo;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void setnRuedas(Integer nRuedas) {
        this.nRuedas=nRuedas;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo =modelo;
    }

    @Override
    public void setDispoibilidad(boolean dispoibilidad) {
        this.dispoibilidad=dispoibilidad;
    }

    @Override
    public void setMotor(String motor) {
        this.motor=motor;
    }

    @Override
    public Vehiculo builder() {
       return new Vehiculo(tipo,nRuedas,modelo,color,dispoibilidad,motor);
    }
}
