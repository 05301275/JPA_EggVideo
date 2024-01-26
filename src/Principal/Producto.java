
package Principal;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Producto implements Serializable {
    
    @Id
    private String Id;
    private int codigo;
    private String nombre_producto;
    private double precio;
    
    @ManyToOne
    private Fabricante fabricante;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Producto() {
    }

    public Producto(String Id, int codigo, String nombre_producto, double precio, Fabricante fabricante) {
        this.Id = Id;
        this.codigo = codigo;
        this.nombre_producto = nombre_producto;
        this.precio = precio;
        this.fabricante = fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "Id=" + Id + ", codigo_producto=" + codigo + ", nombre_producto=" + nombre_producto + ", precio=" + precio + ", fabricante=" + fabricante + '}';
    }
    
}
