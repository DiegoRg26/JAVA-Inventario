/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventario2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseDatosVentas {

    private HashMap<Integer, Vproductos> listaProductos = new HashMap<>();

    public BaseDatosVentas() {
    }

    public List<Vproductos> getListaProductos() {
        return new ArrayList<>(this.listaProductos.values());
    }

    public void setListaProductos(HashMap<Integer, Vproductos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void agregar(Vproductos p) {
        this.listaProductos.put(p.getId(), p);
    }
}
