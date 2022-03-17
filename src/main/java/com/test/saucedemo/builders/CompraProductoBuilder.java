package com.test.saucedemo.builders;

import com.test.saucedemo.interfaces.CompraProductoInterface;
import com.test.saucedemo.models.CompraProductoModel;

public class CompraProductoBuilder implements CompraProductoInterface {

    private String producto;
    private String nombre;
    private String apellido;
    private String codigoPostal;
    private CompraProductoModel compraProducto = new CompraProductoModel();

    public CompraProductoBuilder(String producto) {
        this.producto = producto;
    }

    public static CompraProductoBuilder producto(String producto) {
        return new CompraProductoBuilder(producto);
    }

    public CompraProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public CompraProductoBuilder apellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public CompraProductoModel codigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
        return this.build();
    }

    @Override
    public CompraProductoModel build() {
        compraProducto.setProducto(this.producto);
        compraProducto.setApellido(this.apellido);
        compraProducto.setNombre(this.nombre);
        compraProducto.setCodigoPostal(this.codigoPostal);
        return compraProducto;
    }
}
