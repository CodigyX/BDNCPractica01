package org.uv.bdncpractica01;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 *
 * @author Codigy
 */
public abstract class ProductoTableModel<T> extends AbstractTableModel {

    protected List<T> lstValores;
    protected String[] columnNames = {"Clave", "Descripcion", "Precio Venta", "Precio Compra"};

    public ProductoTableModel(String [] columnNames, List<T> lstValores) {
        this.lstValores = lstValores;
    }

    @Override
    public int getRowCount() {
        return lstValores.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

//    @Override
//    public Object getValueAt(int rowIndex, int columnIndex) {
//        Producto producto = productos.get(rowIndex);
//        switch (columnIndex) {
//            case 0:
//                return producto.getId();
//            case 1:
//                return producto.getDescripcion();
//            case 2:
//                return producto.getPrecioVenta();
//            case 3:
//                return producto.getPrecioCompra();
//            default:
//                return null;
//        }
//    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

}
