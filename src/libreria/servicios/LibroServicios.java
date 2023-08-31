
package libreria.servicios;

import java.util.Scanner;
import javax.persistence.EntityManager;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import static libreria.entidades.Libro_.editorial;
import libreria.persistencia.AutorDAO;
import libreria.persistencia.LibroDAO;


public class LibroServicios {
        Scanner leer= new Scanner(System.in).useDelimiter("\n");

   LibroDAO dao = new LibroDAO();
AutorServicios as = new AutorServicios();
    EditorialServicios es = new EditorialServicios();

    

     public void crearLibro(){
      Libro libro = new Libro();
      
      System.out.println("Ingrese el titulo del libro");         
      String nombre = leer.next();
      libro.setNombre(nombre);
      
         System.out.println("Ingrese el anio de la edicion");
         int anio= leer.nextInt();
         libro.setAnio(anio);
         
         System.out.println("Ingrese la cantidad de ejemplares");
         int cantidadEjemplares= leer.nextInt();
         libro.setEjemplares(cantidadEjemplares);
         libro.setEjemplaresRestantes(cantidadEjemplares);
         libro.setEjemplaresPrestados(0);
         System.out.println("");
         
      libro.setAlta(true);
      
        Autor autor=  as.crearAutor();
        libro.setAutor(autor);
        Editorial editorial= es.crearEditorial();
        libro.setEditorial(editorial);
      dao.guardarEntidad(libro);
  }
    
}
