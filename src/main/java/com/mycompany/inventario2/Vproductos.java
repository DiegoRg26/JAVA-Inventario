package com.mycompany.inventario2;

public class Vproductos {
    private int cantidadv,id;
    private double precio;
    private String producto;
    
    
    public Vproductos() {
    }

    public Vproductos(int id,String producto, int cantidadv,double precio) {
        this.cantidadv = cantidadv;
        this.id = id;
        this.precio = precio;
        this.producto = producto;
    }

    public int getCantidadv() {
        return cantidadv;
    }

    public void setCantidadv(int cantidadv) {
        this.cantidadv = cantidadv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    
    
}
