package Implementaciones;

import Interfaces.Color;

public class Green implements Color {

    // Implementación del metodo darColor definido en la interface
    @Override
    public void darColor(){
        System.out.println("color verde");
    }
}
