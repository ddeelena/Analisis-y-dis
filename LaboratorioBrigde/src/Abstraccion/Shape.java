package Abstraccion;

import Interfaces.Color;

public abstract class  Shape {

    // De esta clase abstracta  herederan las figuras geometricas
    protected Color color;  // Objeto de tipo  color, que se le asignara a la figura

    protected Shape (Color color){
        this.color = color;
    }
    // Este constructor es llamado por las clases hijas para asignar un color
    // Se asigna el color que se establecio al objeto

    public abstract void draw();  //el metodo dibujar con el cual imprimiremos los "detalles" de como dibujar la figura
}
