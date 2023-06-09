package com.mycompany.inventario2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class DataBaseProductos {
    private HashMap<Integer, Producto> listaProductos = new HashMap<>();

    public DataBaseProductos() {
        this.listaProductos.put(1, new Producto(1,"Neumaticos","Marca Michelin",240000,4));
        this.listaProductos.put(2, new Producto(2,"Carburador","Marca Boxer",650000,5));
    }
    
    public List<Producto> getListaProductos() {
        return new ArrayList<>(this.listaProductos.values());
    }
    
    public void setListaProductos (HashMap<Integer, Producto> listaProductos){
        this.listaProductos = listaProductos;
    }
    
    public boolean verificarExistencias(Producto producto){
        return this.listaProductos.containsKey(producto.getId());
    }
    
    public boolean verificarExistencias(String nombre){
        for (Producto p : this.listaProductos.values()) {
            if(nombre.toLowerCase().equals(p.getProducto().toLowerCase())){
                return true;
            }
        }
        return false;
    }
    
    public int ultimoCodigo(){
        int codigo = 0;
        for (Producto p : this.listaProductos.values()) {
            codigo = p.getId();
        }
        return codigo;
    }
    public void agregar(Producto p){
        this.listaProductos.put(p.getId(), p);
    }
    
    public void actualizar(Producto p){
        this.listaProductos.replace(p.getId(), p); 
    }
    
    public void borrar(Producto p){
        this.listaProductos.remove(p.getId());
    }  
}