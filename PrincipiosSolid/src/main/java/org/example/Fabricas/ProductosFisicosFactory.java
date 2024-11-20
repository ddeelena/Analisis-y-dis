package org.example.Fabricas;

import org.example.ClasesAbstractas.Productos;
import org.example.Interfaz.ProductosFactory;
import org.example.ClasesConcretas.ProductosFisicos;

public class ProductosFisicosFactory implements ProductosFactory {

    @Override
    public Productos crearProducto(String nombre, String descripcion){
        return new ProductosFisicos(nombre,descripcion);
    }


}
