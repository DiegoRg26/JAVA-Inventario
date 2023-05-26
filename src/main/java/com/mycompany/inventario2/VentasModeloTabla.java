package com.mycompany.inventario2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VentasModeloTabla extends AbstractTableModel {

    private String[] nomColumnas = {"ID", "Producto", "Cantidad vendida","Precio venta", "Precio total", "Fecha de venta"};
    private List<Vproductos> nproductos = new ArrayList<>();

    public VentasModeloTabla(List<Vproductos> pro) {
        this.nproductos = pro;
    }

    @Override
    public int getRowCount() {
        return this.nproductos.size();
    }

    @Override
    public int getColumnCount() {
        return this.nomColumnas.length;
    }

    @Override
    public Object getValueAt(int fila, int colum) {
        Object resp;

        switch (colum) {
            case 0:
                resp = this.nproductos.get(fila).getId();
                break;
            case 1:
                resp = this.nproductos.get(fila).getProducto();
                break;
            case 2:
                resp = this.nproductos.get(fila).getCantidadv();
                break;
            default:
                resp = this.nproductos.get(fila).getPrecio();
                break;
        }
        return resp;
    }

    @Override
    public String getColumnName(int colum) {
        return this.nomColumnas[colum];
    }

    public void updateTable() {
        fireTableDataChanged();
    }

    public Vproductos detalles(int fila) {
        return this.nproductos.get(fila);
    }

}
