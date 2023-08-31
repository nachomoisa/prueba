
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;


public class AutorServicios {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

       AutorDAO dao = new AutorDAO();

    
   public void crearAutor(){
      Autor autor = new Autor();
      System.out.println("Ingrese el nombre del autor");         
      String nombre = leer.next();
      autor.setNombre(nombre);
      autor.setAlta(true);
      dao.guardarEntidad(autor);
      
  }
    
    
    
    
    
}
