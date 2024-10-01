package Java;

public interface VehiculoBuilder {

    // pasos para la construccion del vehiculo

    void setTipo(String tipo);
    void setColor(String color);
    void setnRuedas(Integer nRuedas);
    void setModelo(String modelo);
    void setDispoibilidad(boolean dispoibilidad);
    void setMotor(String motor);
    Vehiculo builder();

}
