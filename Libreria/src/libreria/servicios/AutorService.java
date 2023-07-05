package libreria.servicios;


import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;

public class AutorService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    
    public Autor crearAutor() {
        Autor autor = null;
        try {
             autor = new Autor();
            System.out.println("ingrese el nombre del Autor");
            String nombre = input.next();
            autor.setAlta(true);
            autor.setNombre(nombre);
            em.getTransaction().begin();
            em.persist(autor);
            em.getTransaction().commit();
            System.out.println(autor);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return autor;
    }

    public void buscarAutor(){
    
    String nombreAutor;
        try {
            boolean noEncontrado = true;
            do {
                System.out.println("Ingrese el nombre del Autor");
                nombreAutor = input.next();

                List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
                for (Autor aux : autores) {
                    if (aux.getNombre().equalsIgnoreCase(nombreAutor)) {
                        System.out.println(aux);
                        noEncontrado = false;
                    }
                }
                if (noEncontrado) {
                    System.out.println("El Autor no se encuentra aun registrado");
                }
            } while (noEncontrado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void modificarAutor(){
    String nombreAutor;
        boolean noEncontrado = true;
        try {
            do {
                System.out.println("Ingrese el nuevo NOMBRE del Autor a cambiar");
            nombreAutor = input.next();
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
            for (Autor aux : autores) {
                if (aux.getNombre().equalsIgnoreCase(nombreAutor)) {
                    aux.setNombre(nombreAutor);
                    em.getTransaction().begin();
                    em.merge(nombreAutor);
                    em.getTransaction().commit();
                    noEncontrado = false;
                }
            }
                if (noEncontrado) {
                    System.out.println("El autor "+ nombreAutor +" no se encontro en la base de datos");
                }
            } while (noEncontrado); 
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            em.close();
        }
    }
    
    public void eliminarAutor(){
     String nombre;
        try {
            boolean noEncontrado = true;
            do {
                System.out.println("Ingrese el nombre del Autor a Eliminar");
                nombre = input.next();

                List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
                for (Autor aux : autores) {
                    if (aux.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println(aux);
                        em.getTransaction().begin();
                        em.remove(aux);
                        em.getTransaction().commit();
                        noEncontrado = false;
                    }
                }
                if (noEncontrado) {
                    System.out.println("El Autor "+nombre +" no se encuentra aun registrado");
                }
            } while (noEncontrado);
            System.out.println("El Autor " + nombre + " se ha eliminado exitosamente");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
