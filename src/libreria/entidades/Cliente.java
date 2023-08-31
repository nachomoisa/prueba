
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Clientes")
public class Cliente implements Serializable {

 @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;    
  @Column(name="correo_electronico")
  private String correoElectronico;
    @Column(name="nombre")
  private String nombre;
    @Column(name="activa")
  private boolean activa;  

    public Cliente() {
    }

    public Cliente(long id, String correoElectronico, String nombre, boolean activa) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        this.activa = activa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", correoElectronico=" + correoElectronico + ", nombre=" + nombre + ", activa=" + activa + '}';
    }
    
    
}
