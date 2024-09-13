package UI;

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
                    System.out.println("..:: Agendar tutorías ::..");
                    for (int i=0; i< 5; i++){
                        System.out.println(i + ": "+ MESES[i]);
                    }
                    break;
                case 2:
                    System.out.println("..:: Mis tutorias");
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
}
