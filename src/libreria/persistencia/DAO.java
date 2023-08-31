
package libreria.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



 
public class DAO <T> {
    
    private final EntityManagerFactory emf;
    protected EntityManager entityManager;    
  
   

    public DAO() {
       this.emf = Persistence.createEntityManagerFactory("EjercicioPU");
        this.entityManager = emf.createEntityManager();
    }
  
   protected void conectarBase() {
        if (!entityManager.isOpen()) {
            entityManager = emf.createEntityManager();
        }
    }

    protected void desconectarBase() {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
    }

    protected void guardarEntidad(T object) {

        try {
            conectarBase();
            entityManager.getTransaction().begin();
            entityManager.persist(object);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("No se pudo Cargar la Base");
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();

            }

        } finally {
            desconectarBase();
        }

    }
    
     protected void modificarEntidad(T object) {

        try {
            conectarBase();
            entityManager.getTransaction().begin();
            entityManager.merge(object);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("No se pudo Cargar la Base");
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();

            }

        } finally {
            desconectarBase();
        }

    }
    
     protected void eliminarEntidad(T object) {

        try {
            conectarBase();
            entityManager.getTransaction().begin();
            entityManager.remove(object);
            entityManager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("No se pudo Cargar la Base");
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();

            }

        } finally {
            desconectarBase();
        }

    }
    
    
    
    
    
    
    
    
     
     
     
     
     
     
     
     
     
     
    
    
    
    
}
