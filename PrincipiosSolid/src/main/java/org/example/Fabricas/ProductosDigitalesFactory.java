package org.example.Fabricas;

import org.example.ClasesAbstractas.Productos;
import org.example.Interfaz.ProductosFactory;
import org.example.ClasesConcretas.ProductosDigitales;

public class ProductosDigitalesFactory implements ProductosFactory {

    @Override
    public Productos crearProducto(String nombre, String descripcion){
        return new ProductosDigitales(nombre,descripcion);
    }
}
