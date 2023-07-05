package libreria.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class LibroService {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    AutorService as = new AutorService();
    EditorialService es = new EditorialService();
    
    public Libro crearLibro() {
        String nombre;
        Long isbn;
        Integer anio;
        String nombreAutor;
        Integer ejemplares;
        List<Libro> libros = new ArrayList();
        Libro libro = new Libro();
        try {
            libro = new Libro();
            System.out.println("Ingrese el nombre del Libro por favor");
            nombre = input.next();
            libro.setTitulo(nombre);
            System.out.println("Ingrese el ISBN (se encuentra al dorso del libro)");
            isbn = input.nextLong();
            libro.setIsbn(isbn);
            System.out.println("Ingrese el año de publicacion:");
            anio = input.nextInt();
            libro.setAnio(anio);
            System.out.println("Ingrese la cantidad de ejemplares que agregara al stock");
            ejemplares = input.nextInt();
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(0);
            libro.setAlta(true);
            Integer ejemplaresRestantes = libro.getEjemplares();
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            boolean noEncontrado = true;
            do {
                System.out.println("Ingrese el nombre del Autor");
                nombreAutor = input.next();
                List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
                for (Autor aux : autores) {
                    if (aux.getNombre().equalsIgnoreCase(nombreAutor)) {
                        libro.setAutor(aux);
                        noEncontrado = false;
                    }
                }
                if (noEncontrado) {
                    System.out.println("El autor no se encuentra aun registrado");
                    System.out.println("Vamos a agregar el Autor " + nombreAutor + " ingresado a la base datos");
                    libro.setAutor(as.crearAutor());
                    noEncontrado = false;
                }
            } while (noEncontrado);
            noEncontrado = true;
            do {
                System.out.println("Ingrese el nombre de la Editorial");
                String nombreEditorial = input.next();
                List<Editorial> editoriales = em.createQuery("SELECT a FROM Editorial a").getResultList();
                for (Editorial aux : editoriales) {
                    if (aux.getNombre().equalsIgnoreCase(nombreEditorial)) {
                        libro.setEditorial(aux);
                        noEncontrado = false;
                    }
                }
                if (noEncontrado) {
                    System.out.println("La Editorial aun no se ecuentra en Sistema");
                    System.out.println("Vamos a agregar la Editorial " + nombreEditorial + " ingresando a la base datos");
                    libro.setEditorial(es.crearEditorial());
                    noEncontrado = false;
                }
                /*else {
                    
                }*/
            } while (noEncontrado);
            libros.add(libro);
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
            System.out.println("Libro creado con exito!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        em.close();
        return libro;
    }
    
    public void buscarLibro() {
        int opciones;
        String nombre;
        do {
            System.out.println("");
            System.out.println("*****************************************************");
            System.out.println("*           Elija la opcion deseada                 *");
            System.out.println("* 1) Busqueda de un Libro por su Titulo             *");
            System.out.println("* 2) Búsqueda de un libro por ISBN                  *");
            System.out.println("* 3) Búsqueda de un libro/s por nombre de Editorial *");
            System.out.println("* 4) Búsqueda de un libro/s por nombre de Autor     *");
            System.out.println("* 5) Regresar al menu anterior                      *");
            System.out.println("*****************************************************");
            System.out.println("");
            opciones = input.nextInt();
            switch (opciones) {
                case 1:
                    try {
                    boolean noEncontrado = true;
                    do {
                        System.out.println("Ingrese el nombre del Libro");
                        nombre = input.next();
                        
                        List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
                        for (Libro aux : libros) {
                            if (aux.getTitulo().equalsIgnoreCase(nombre)) {
                                System.out.println(aux);
                                noEncontrado = false;
                            }
                        }
                        if (noEncontrado) {
                            System.out.println("El Libro no se encuentra aun registrado");
                        }
                    } while (noEncontrado);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
                case 2:
                    try {
                    boolean noEncontrado = true;
                    do {
                        System.out.println("Ingrese el ISBN del Libro");
                        int nombreISBN = input.nextInt();
                        
                        List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
                        for (Libro aux : libros) {
                            if (aux.getIsbn() == nombreISBN) {
                                System.out.println(aux);
                                noEncontrado = false;
                            }
                        }
                        if (noEncontrado) {
                            System.out.println("ISBN inexistente");
                        }
                    } while (noEncontrado);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
                case 3:
                     try {
                    boolean noEncontrado = true;
                    do {
                        System.out.println("Ingrese el nombre de la Editorial");
                        String nombreEditorial = input.next();
                        List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.editorial a WHERE a.nombre LIKE CONCAT(:nombreEditorial, '%')")
                                .setParameter("nombreEditorial", nombreEditorial)
                                .getResultList();
                        for (Libro aux : libros) {
                            {
                                System.out.println(aux);
                                noEncontrado = false;
                            }
                        }
                        if (noEncontrado) {
                            System.out.println("No se encuentra la editorial registrada");
                        }
                    } while (noEncontrado);
                    
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
                case 4:
                    buscarLibroPorAutor();
                    break;
                case 5:
                    System.out.println(" <-----Regresando al menu Principal");
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
            
        } while (opciones != 6);  
    }
    
    public void buscarLibroPorAutor() {
        try {
            boolean noEncontrado = true;
            
            System.out.println("Ingrese el nombre del Autor");
            String nombreAutor = input.next();
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE CONCAT(:nombreAutor, '%')")
                    .setParameter("nombreAutor", nombreAutor)
                    .getResultList();
            for (Libro aux : libros) {
                {
                    System.out.println(aux);
                    noEncontrado = false;
                }
            }
            if (noEncontrado) {
                System.out.println("El Autor no tiene Libros registrados en la Biblioteca");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public Libro modificarLibro() {
        String nombre;
        Libro libro = new Libro();
        int opcion;
        Integer anio;
        Integer nuevoAnio;
        String nuevoNombre;
        do {
            System.out.println("    ¿Que dato desea modificar? 😀 ");
            System.out.println(" ------------------------------------ ");
            System.out.println("| 1) Cambiar nombre del Libro       |");
            System.out.println("| 2) Cambiar año de publicacion     |");
            System.out.println("| 3) Cambiar nombre de Autor        |");
            System.out.println("| 4) Cambiar Editorial              |");
            System.out.println("| 5) Salir                          |");
            System.out.println("|-----------------------------------|");
            System.out.println("");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:   
                      try {
                    boolean noEncontrado = true;
                    do {
                        System.out.println("Ingrese el nombre del Libro");
                        nombre = input.next();
                        System.out.println("¿Por cual nombre le gustaria cambiar el libro?");
                        nuevoNombre = input.next();
                        List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
                        for (Libro aux : libros) {
                            if (aux.getTitulo().equalsIgnoreCase(nombre)) {
                                System.out.println(aux);
                                aux.setTitulo(nuevoNombre);
                                noEncontrado = false;
                                em.getTransaction().begin();
                                em.merge(aux);
                                em.getTransaction().commit();
                            }
                            System.out.println("Nombre cambiado exitosamente de " + nombre + " a " + nuevoNombre);
                        }
                        if (noEncontrado) {
                            System.out.println("El Libro no se encuentra aun registrado");
                        }
                    } while (noEncontrado);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
                case 2:
                   try {
                    boolean noEncontrado = true;
                    do {
                        System.out.println("Ingrese el nombre del Libro");
                        nombre = input.next();
                        System.out.println("¿Por cual año le gustaria actualizar el libro?");
                        nuevoAnio = input.nextInt();
                        List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
                        for (Libro aux : libros) {
                            if (aux.getTitulo().equalsIgnoreCase(nombre)) {
                                System.out.println(aux);
                                aux.setAnio(nuevoAnio);
                                noEncontrado = false;
                                em.getTransaction().begin();
                                em.merge(aux);
                                em.getTransaction().commit();
                            }
                        }
                        System.out.println("Año cambiado exitosamente, correspondiente al Libro " + nombre);
                        if (noEncontrado) {
                            System.out.println("El Libro no se encuentra aun registrado, no es posible cambiar el año");
                        }
                    } while (noEncontrado);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
                case 3:
                    Autor autor = new Autor();
                    String nuevoAutor;
                    try {
                        boolean noEncontrado = true;
                        do {
                            System.out.println("Ingrese el nombre del Libro");
                            nombre = input.next();
                            System.out.println("¿Por qué autor le gustaría actualizar el libro?");
                            nuevoAutor = input.next();
                            autor.setNombre(nuevoAutor);
                            List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
                            for (Libro aux : libros) {
                                if (aux.getTitulo().equalsIgnoreCase(nombre)) {
                                    System.out.println(aux);
                                    if (noEncontrado) {
                                        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
                                        for (Autor aux2 : autores) {
                                            if (aux2.getNombre().equalsIgnoreCase(nuevoAutor)) {
                                                autor.setNombre(nuevoAutor);
                                                noEncontrado = false;
                                                em.getTransaction().begin();
                                                aux.setAutor(autor);
                                                em.merge(aux);
                                                em.getTransaction().commit();
                                            }
                                        }
                                    }
                                }
                            }
                            if (noEncontrado) {
                                System.out.println("El Libro no se encuentra aún registrado, no es posible cambiar el Autor");
                            }
                        } while (noEncontrado);
                        System.out.println("Autor cambiado exitosamente, correspondiente al Libro " + nombre);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    Editorial editorial = new Editorial();
                    
                    String nuevaEditorial;
                    try {
                        boolean noEncontrado = true;
                        do {
                            System.out.println("Ingrese el nombre del Libro");
                            nombre = input.next();
                            System.out.println("¿Por qué Editorial le gustaría actualizar el libro?");
                            nuevaEditorial = input.next();
                            editorial.setNombre(nuevaEditorial);
                            List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
                            for (Libro aux : libros) {
                                if (aux.getTitulo().equalsIgnoreCase(nombre)) {
                                    System.out.println(aux);
                                    if (noEncontrado) {
                                        List<Editorial> editoriales = em.createQuery("SELECT a FROM Editorial a").getResultList();
                                        for (Editorial aux2 : editoriales) {
                                            if (aux2.getNombre().equalsIgnoreCase(nuevaEditorial)) {
                                                editorial.setNombre(nuevaEditorial);
                                                noEncontrado = false;
                                                em.getTransaction().begin();
                                                aux.setEditorial(editorial);
                                                em.merge(aux);
                                                em.getTransaction().commit();
                                            }
                                        }
                                    }
                                }
                            }
                            if (noEncontrado) {
                                System.out.println("El Libro no se encuentra aún registrado, no es posible cambiar el Autor");
                            }
                        } while (noEncontrado);
                        System.out.println("Autor cambiado exitosamente, correspondiente al Libro " + nombre);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del menu de cambios...");
                    em.close();
                    break;
                default:
                    System.out.println("opcion invalida, vuelva a intentarlo");
                    break;
            }
        } while (opcion != 5);
        
        return libro;
    }
    
    public void eliminarLibro() {
        String nombre;
        try {
            boolean noEncontrado = true;
            do {
                System.out.println("Ingrese el nombre del Libro a Eliminar");
                nombre = input.next();
                
                List<Libro> libros = em.createQuery("SELECT a FROM Libro a").getResultList();
                for (Libro aux : libros) {
                    if (aux.getTitulo().equalsIgnoreCase(nombre)) {
                        System.out.println(aux);
                        em.getTransaction().begin();
                        em.remove(aux);
                        em.getTransaction().commit();
                        noEncontrado = false;
                    }
                }
                if (noEncontrado) {
                    System.out.println("El Libro no se encuentra aun registrado");
                }
            } while (noEncontrado);
            System.out.println("El libro " + nombre + " eliminado exitosamente");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
