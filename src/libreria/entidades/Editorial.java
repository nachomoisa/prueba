/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Editorial implements Serializable {

    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id; 
   private String nombre; 
   private boolean alta;

    public Editorial() {
    }

    public Editorial(String nombre, boolean alta) {
        this.nombre = nombre;
        this.alta = alta;
    }

    public long getId() {
        return id;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Editorial{" + "id=" + id + ", nombre=" + nombre + ", alta=" + alta + '}';
    }
   
   
   
   
   
   
   
   
    
}
