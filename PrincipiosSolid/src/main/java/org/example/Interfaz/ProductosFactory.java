package org.example.Interfaz;

import org.example.ClasesAbstractas.Productos;

public interface ProductosFactory {
    Productos crearProducto(String nombre, String descripcion);
}
