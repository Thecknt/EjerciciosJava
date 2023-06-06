/*

 */
package Principal;

import Entidades.Estudiantes;
import Entidades.PersonalDeServicio;
import Entidades.Profesores;
import Servicios.EstudiantesService;
import Servicios.PersonalService;
import Servicios.ProfesoresService;
import java.util.Scanner;

public class Ejercicio4ExtraFacultad {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        
        PersonalService pers = new PersonalService();
        ProfesoresService ps = new ProfesoresService();
        EstudiantesService es = new EstudiantesService();
        Profesores profe = null;
        Estudiantes estu = null;
        PersonalDeServicio personal = null;
        
        do {
            System.out.println("*******************************************************************");
            System.out.println("*             Bienvenido a la Facultad de Buenos Aires            *");
            System.out.println("*******************************************************************");
            System.out.println("*      sistema de Administracion de personal de la facultad       *");
            System.out.println("* 1) Inscribir alumno                                             *");
            System.out.println("* 2) Inscribir profesor a la Universidad                          *");
            System.out.println("* 3) Inscribir Personal de servicio                               *");
            System.out.println("* 4) Cambiar estado Civil Alumno                                  *");
            System.out.println("* 5) Cambiar estado Civil Docente                                 *");
            System.out.println("* 6) Cambiar estado Civil Personal de Servicio                    *");
            System.out.println("* 7) Reasignación de despacho a un empleado                       *");
            System.out.println("* 8) Matriculación de un estudiante en un nuevo curso             *");
            System.out.println("* 9) Cambio de departamento de un profesor                        *");
            System.out.println("*10) Traslado de sección de un empleado del personal de servicio. *");
            System.out.println("*11) Salir                                                        *");
            System.out.println("*******************************************************************");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    estu = es.crearEstudiante();
                    break;
                case 2:
                    profe = ps.crearProfesor();
                    break;
                case 3:
                    personal = pers.crearEmpleadoDeServicio();
                    break;
                case 4:
                    if (estu == null) {
                        System.out.println("Aun no hay alumnos registrados en la Facultad");
                    } else {
                        es.cambiarEstadoCivil(estu);
                        System.out.println("Finalizando sistema de registros");
                    }
                    break;
                case 5:
                    if (profe == null) {
                        System.out.println("Aun no hay Profesores registrados en la Facultad");
                    } else {
                        ps.cambiarEstadoCivil(profe);
                        System.out.println("Finalizando sistema de registros");
                    }
                    break;
                case 6:
                    
                    if (personal == null) {
                        System.out.println("Aun no hay Personal de Servicio registrados en la Facultad");
                    } else {
                        pers.cambiarEstadoCivil(personal);
                        System.out.println("Finalizando sistema de registros");
                    }
                    break;
                case 7:
                    int opcion2;
                    if (profe == null && personal == null) {
                        System.out.println("Aun no hay Profesores o personal registrados en la Facultad");
                    } else {
                        do {
                            System.out.println("******************************");
                            System.out.println("* 1) Profesor                *");
                            System.out.println("* 2) Personal de Servicio    *");
                            System.out.println("* 3) Volver al menu anterior *");
                            System.out.println("******************************");
                            opcion2 = input.nextInt();
                            switch (opcion2) {
                                case 1:
                                    ps.cambiarDeDespacho(profe);
                                    break;
                                case 2:
                                    pers.cambiarDeDespacho(personal);
                                    break;
                                case 3:
                                    System.out.println("Regresando al menu principal");
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }                            
                        } while (opcion2 != 3);
                    }
                    break;
                case 8:
                    if (estu == null) {
                        System.out.println("Aun no hay alumnos registrados en la Facultad");
                    } else {
                        es.cambioDeCurso(estu);
                        System.out.println("Finalizando sistema de registros");
                    }
                    break;
                case 9:
                    if (profe == null) {
                        System.out.println("Aun no hay Profesores registrados en la Facultad");
                    } else {
                        ps.CambioDepartamento(profe);
                        System.out.println("Finalizando sistema de registros");
                    }
                    break;
                case 10:
                    if (personal == null) {
                        System.out.println("Aun no hay Personal registrados en la Facultad");
                    } else {
                        pers.cambiarDeSeccion(personal);
                        System.out.println("Finalizando sistema de registros");
                    }
                    break;
                case 11:
                    System.out.println("Saliendo del sistema de gestion de la Facultad");
                    break;
                default:
                    System.out.println("opcion invalida, intente nuevamente");
                    break;
            }
        } while (opcion != 11);
    }
    
}
