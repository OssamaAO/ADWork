/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alumno1
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Producto.findByMarca", query = "SELECT p FROM Producto p WHERE p.marca = :marca"),
    @NamedQuery(name = "Producto.findByDescripcion", query = "SELECT p FROM Producto p WHERE p.descripcion = :descripcion"),
    @NamedQuery(name = "Producto.findByPrecioUnidad", query = "SELECT p FROM Producto p WHERE p.precioUnidad = :precioUnidad"),
    @NamedQuery(name = "Producto.findByStock", query = "SELECT p FROM Producto p WHERE p.stock = :stock")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "marca")
    private String marca;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio_unidad")
    private Double precioUnidad;
    @Column(name = "stock")
    private Integer stock;
    @ManyToMany(mappedBy = "productoCollection")
    private Collection<Compra> compraCollection;
    @ManyToMany(mappedBy = "productoCollection")
    private Collection<Empleado> empleadoCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "producto")
    private Patatas patatas;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "producto")
    private Revista revista;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "producto")
    private Caramelo caramelo;
    @JoinColumn(name = "cif", referencedColumnName = "cif")
    @ManyToOne
    private Proveedor cif;

    public Producto() {
    }

    public Producto(Integer idProducto, String nombre, Double precioUnidad, Integer stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioUnidad = precioUnidad;
        this.stock = stock;
    }
    
    

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @XmlTransient
    public Collection<Compra> getCompraCollection() {
        return compraCollection;
    }

    public void setCompraCollection(Collection<Compra> compraCollection) {
        this.compraCollection = compraCollection;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    public Patatas getPatatas() {
        return patatas;
    }

    public void setPatatas(Patatas patatas) {
        this.patatas = patatas;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public Caramelo getCaramelo() {
        return caramelo;
    }

    public void setCaramelo(Caramelo caramelo) {
        this.caramelo = caramelo;
    }

    public Proveedor getCif() {
        return cif;
    }

    public void setCif(Proveedor cif) {
        this.cif = cif;
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Producto[ idProducto=" + idProducto + " ]";
    }
    
    public String[] toArrayString(){
       String[] s= new String[3];
       s[0]= nombre.toString();
       s[1]= precioUnidad.toString();
       s[2]= stock.toString();
       return s;
   }
    
}
