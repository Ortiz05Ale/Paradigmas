package UI;

import java.util.Scanner;
import static UI.UIMenu.*;

public class UIMaestro {
    public static void maestroMenu() {
        int respuesta = 0;
        System.out.println("..:: Maestro ::..");
        do {
            System.out.println("Seleccione una opción: ");
            System.out.println("1 Agregar curso");
            System.out.println("2 Listar cursos");
            System.out.println("3 Salir");

            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    agregarTutoria();
                    break;
                case 2:
                    listarCursos();
                    break;
                case 3:
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (respuesta != 3);


    }

    public static void agregarTutoria(){
        System.out.println("Agregar Tutoría");
        System.out.println("Ingresa la fecha del curso [dd/mm/yyyy]");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        System.out.println("Ingresa la hora del curso [00:00]");
        String hora = sc.nextLine();
    }
    public static void listarCursos(){
        System.out.println("Listado de cursos");
    }
}