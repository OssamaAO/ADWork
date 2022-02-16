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
@Table(name = "caramelo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caramelo.findAll", query = "SELECT c FROM Caramelo c"),
    @NamedQuery(name = "Caramelo.findByIdProducto", query = "SELECT c FROM Caramelo c WHERE c.idProducto = :idProducto"),
    @NamedQuery(name = "Caramelo.findByTipoCaramelo", query = "SELECT c FROM Caramelo c WHERE c.tipoCaramelo = :tipoCaramelo"),
    @NamedQuery(name = "Caramelo.findBySabor", query = "SELECT c FROM Caramelo c WHERE c.sabor = :sabor"),
    @NamedQuery(name = "Caramelo.findByTienegluten", query = "SELECT c FROM Caramelo c WHERE c.tienegluten = :tienegluten")})
public class Caramelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "tipo_caramelo")
    private String tipoCaramelo;
    @Column(name = "sabor")
    private String sabor;
    @Column(name = "tienegluten")
    private Boolean tienegluten;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Producto producto;

    public Caramelo() {
    }

    public Caramelo(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getTipoCaramelo() {
        return tipoCaramelo;
    }

    public void setTipoCaramelo(String tipoCaramelo) {
        this.tipoCaramelo = tipoCaramelo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Boolean getTienegluten() {
        return tienegluten;
    }

    public void setTienegluten(Boolean tienegluten) {
        this.tienegluten = tienegluten;
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
        if (!(object instanceof Caramelo)) {
            return false;
        }
        Caramelo other = (Caramelo) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Caramelo[ idProducto=" + idProducto + " ]";
    }
    
}
