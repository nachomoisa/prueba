
package libreria.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import libreria.entidades.Autor;
import static libreria.entidades.Libro_.autor;


public class AutorDAO extends DAO<Autor> {




    @Override
    public void guardarEntidad(Autor autor) {
        super.guardarEntidad(autor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarEntidad(Autor autor) {
        super.modificarEntidad(autor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarEntidad(Autor autor) {
        super.eliminarEntidad(autor); //To change body of generated methods, choose Tools | Templates.
    }

 
 public Autor buscarAutor(Integer id) {
        conectarBase();
        Autor autor = entityManager.find(Autor.class, id);
        desconectarBase();
        return autor;
    }
   

   
    


    
    
    
 

    
    
    
    
}
