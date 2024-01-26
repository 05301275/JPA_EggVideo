
package Principal;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Fabricante implements Serializable {
    
    @Id
    private String Id;
    private int codigo;
    private String nombre;
    private String nacionalidad;

    public Fabricante() {
    }

    public Fabricante(String Id, int codigo, String nombre, String nacionalidad) {
        this.Id = Id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "Id=" + Id + ", codigo=" + codigo + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
}
