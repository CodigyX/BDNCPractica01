package org.uv.bdncpractica01;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Codigy
 */
@Entity
@Table(name = "producto")
public class Producto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "producto_idproducto_seq")
    @SequenceGenerator(name = "producto_idproducto_seq",
            sequenceName = "producto_idproducto_seq",
            allocationSize = 1,
            initialValue = 1)
    @Column(name = "idproducto")
    private long id;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name="precioventa")
    private double precioVenta;
    @Column(name="preciocompra")
    private double precioCompra;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    
}