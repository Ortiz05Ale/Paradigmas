package UI;

import Model.Maestro;

import java.util.ArrayList;
import java.util.Scanner;
import static UI.UIMenu.*;

public class UIMaestro {
    public static ArrayList<Maestro>  maestrosConTutoria = new ArrayList<>();
    public static void maestroMenu() {
        int respuesta = 0;
        System.out.println("..:: Maestro - " + maestroLogeado.getNombre() + "::..");
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
                    listarTutorias();
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

        boolean banderaExterna = true;
        do {
            System.out.println("Ingresa la fecha del la tutoría [dd/mm/yyyy]");
            Scanner sc = new Scanner(System.in);
            String fecha = sc.nextLine();
            System.out.println("Ingresa la hora de la tutoría [00:00]");
            String hora = sc.nextLine();

            boolean banderaInterna = true;
           do {
               System.out.println("La tutoría es: " +  fecha + " "  + hora);
               System.out.println("1. Agregar tutoría\n2.Cambiar tutoría");
               int respuesta = sc.nextInt();
               if (respuesta == 2) {
                   banderaInterna = false;
               }else if (respuesta == 1) {
                   banderaExterna = false;
                   banderaInterna = false;
                    maestroLogeado.addTutoriaDisponible(fecha, hora);
                   System.out.println("Tutoría agregada exitosamente");
                   consultarMaestroConTutoria(maestroLogeado);
               } else {
                   System.out.println("Opcion no valida");
               }
           }while (banderaInterna);
        }while (banderaExterna);
    }

    private static void consultarMaestroConTutoria(Maestro maestro) {
        if (!maestrosConTutoria.contains(maestro)) {
            maestrosConTutoria.add(maestro);
        }
    }

    public static void listarTutorias(){
        System.out.println("Listado de tutorías");
        if (maestroLogeado.getTutoriasDisponibles().size() == 0) {
            System.out.println("No hay turorías registradas");
        } else {
            int j = 1;
            for (int i = 0; i < maestroLogeado.getTutoriasDisponibles().size(); i++) {
                System.out.println(j + ".-" + maestroLogeado.getTutoriasDisponibles().get(i).getFecha() + " " +
                        maestroLogeado.getTutoriasDisponibles().get(i).getHora());
                j++;
            }
        }
    }
}