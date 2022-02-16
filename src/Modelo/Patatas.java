/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alumno1
 */
@Entity
@Table(name = "patatas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patatas.findAll", query = "SELECT p FROM Patatas p"),
    @NamedQuery(name = "Patatas.findByIdProducto", query = "SELECT p FROM Patatas p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Patatas.findByForma", query = "SELECT p FROM Patatas p WHERE p.forma = :forma"),
    @NamedQuery(name = "Patatas.findByHechode", query = "SELECT p FROM Patatas p WHERE p.hechode = :hechode")})
public class Patatas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "forma")
    private String forma;
    @Column(name = "hechode")
    private String hechode;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Producto producto;

    public Patatas() {
    }

    public Patatas(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getHechode() {
        return hechode;
    }

    public void setHechode(String hechode) {
        this.hechode = hechode;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patatas)) {
            return false;
        }
        Patatas other = (Patatas) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Patatas[ idProducto=" + idProducto + " ]";
    }
    
}
