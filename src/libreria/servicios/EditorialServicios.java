
package libreria.servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import libreria.entidades.Editorial;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.EditorialDAO;


public class EditorialServicios {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");

   EditorialDAO dao= new EditorialDAO(); 
    
  public Editorial crearEditorial(){
      Editorial editorial = new Editorial();
      System.out.println("Ingrese el nombre de la editorial");         
      String nombre = leer.next();
      editorial.setNombre(nombre);
      editorial.setAlta(true);
      dao.guardarEntidad(editorial);
      return editorial;
  }
    
}
