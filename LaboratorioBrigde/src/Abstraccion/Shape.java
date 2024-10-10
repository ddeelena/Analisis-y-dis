package Abstraccion;

import Interfaces.Color;

public abstract class  Shape {
    protected Color color;

    protected Shape (Color color){
        this.color = color;
    }

    public abstract void draw();
}
