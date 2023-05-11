
package com.mycompany.inventario2;

public class Producto {
    private int id,inventario;
    private float precio;
    private String producto,descripcion;

    public Producto() {
    }

    public Producto(int id, String producto, String descripcion, float precio ,int inventario) {
        this.id = id;
        this.inventario = inventario;
        this.precio = precio;
        this.producto = producto;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

}
