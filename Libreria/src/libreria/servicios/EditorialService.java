package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Editorial;

public class EditorialService {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    public Editorial crearEditorial() {
        Editorial editorial = new Editorial();
        String nombre;
        try {
            List<Editorial> editoriales = new ArrayList();
            System.out.println("Ingrese el nombre de la Editorial");
            nombre = input.next();
            editorial.setAlta(true);
            editorial.setNombre(nombre);

            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();
            editoriales.add(editorial);
            System.out.println(editorial);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return editorial;
    }

    public void buscarEditorial() {
        String nombreEditorial;
        try {
            boolean noEncontrado = true;
            do {
                System.out.println("Ingrese el nombre de la Editorial");
                nombreEditorial = input.next();
                List<Editorial> editoriales = em.createQuery("SELECT a FROM Editorial a").getResultList();
                for (Editorial aux : editoriales) {
                   if (aux.getNombre().equalsIgnoreCase(nombreEditorial)) {
                        System.out.println(aux);
                       noEncontrado = false;
                        break;     
                  }
                } 
               if (noEncontrado) {
                  System.out.println("La Editorial no se encuentra aun registrada");
               }
            } while (noEncontrado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            
        }
    }

    public void modificarEditorial() {
        String nombreEditorial;
        boolean noEncontrado = true;
        try {
            do {
                System.out.println("Ingrese el nuevo NOMBRE de la Editorial a cambiar");
            nombreEditorial = input.next();
            List<Editorial> editoriales = em.createQuery("SELECT a FROM Editorial a").getResultList();
            for (Editorial aux : editoriales) {
                if (aux.getNombre().equalsIgnoreCase(nombreEditorial)) {
                    aux.setNombre(nombreEditorial);
                    em.getTransaction().begin();
                    em.merge(nombreEditorial);
                    em.getTransaction().commit();
                    noEncontrado = false;
                } 
            } 
            if (noEncontrado) {
                    System.out.println("La Editorial "+ nombreEditorial + " no se encontro en la base de datos");
                }
            } while (noEncontrado); 
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            em.close();
        }
    }

    public void eliminarEditorial() {
        String nombre;
        try {
            boolean noEncontrado = true;
            do {
                System.out.println("Ingrese el nombre de la Editorial a Eliminar");
                nombre = input.next();

                List<Editorial> editoriales = em.createQuery("SELECT a FROM Editorial a").getResultList();
                for (Editorial aux : editoriales) {
                    if (aux.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println(aux);
                        em.getTransaction().begin();
                        em.remove(aux);
                        em.getTransaction().commit();
                        noEncontrado = false;
                    }
                }
                if (noEncontrado) {
                    System.out.println("La Editorial no se encuentra aun registrado");
                }
            } while (noEncontrado);
            System.out.println("La editorial " + nombre + " se ha eliminado exitosamente");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
