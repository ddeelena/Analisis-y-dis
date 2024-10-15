package Facade;

import Subsistema.SistemaDeClimatizacion;
import Subsistema.SistemaDeEntretenimiento;
import Subsistema.SistemaDeIluminacion;
import Subsistema.SistemaDeSeguridad;

public class CasaFacade {

    private SistemaDeClimatizacion climatizacion;
    private SistemaDeEntretenimiento entretenimiento;
    private SistemaDeIluminacion iluminacion;
    private SistemaDeSeguridad seguridad;

    public CasaFacade(){
        this.iluminacion = new SistemaDeIluminacion();
        this.climatizacion = new SistemaDeClimatizacion();
        this.entretenimiento = new SistemaDeEntretenimiento();
        this.seguridad = new SistemaDeSeguridad();
    }

    public void modoNoche(){
        iluminacion.atenuarLuces();
        climatizacion.encenderAireAcondicionado();
        seguridad.activarSistema();
        entretenimiento.encenderEntretenimiento();
        System.out.println("Modo noche activado");
    }

    public void modoDia(){
        iluminacion.encenderLuces();
        climatizacion.apagarAireAcondicionado();
        seguridad.desactivarSistema();
        entretenimiento.apagarEntretenimiento();
        System.out.println("Modo día activado");
    }

    public void salirDeCasa(){
        iluminacion.apagarLuces();
        climatizacion.apagarAireAcondicionado();
        seguridad.activarSistema();
        entretenimiento.apagarEntretenimiento();
    }
}
