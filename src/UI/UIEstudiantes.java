package UI;

import Model.CitaMaestro;
import Model.Maestro;
import UI.UIMenu.*;

import java.util.Scanner;

public class UIEstudiantes {
    public final static  String  [] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void estudianteMenu(){
        int respuesta;
        do {
            System.out.println("..:: Estudiantes ::..");
            System.out.println("1. Agendar tutoría");
            System.out.println("2. Mis tutorias");
            System.out.println("0. Cancelar");

            Scanner input = new Scanner(System.in);
            respuesta = Integer.valueOf(input.nextLine());

            switch (respuesta){
                case 1:
                    agendarTutoria();
                    break;
                case 2:
                    listarTutorias();
                    break;
                case 0:
                    System.out.println("..:: Bye ::..");
                    break;
                default:
                    System.out.println("Por favor seleccione otra respuesta");
                    break;
            }
        }while (respuesta !=0);
    }

    private static void agendarTutoria(){
        /*
        1.- Maestro 1
        1.- Tutoria 1
        2.- Maestro 2
        1.- Tutoria 2
        Solo maestros que tengan tutorias disponibles
         */
        System.out.println("..:: Agendar Tutoria ::..");
        for(int i = 0; i <= UIMenu.maestroLogeado)
    }
    private static void listarTutorias(){
        System.out.println("..:: Agendar Tutoria ::..");
    }
}
