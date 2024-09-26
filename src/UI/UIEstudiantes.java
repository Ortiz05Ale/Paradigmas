package UI;

import Model.CitaMaestro;
import Model.CitaTutoria;
import Model.Maestro;
import UI.UIMenu.*;

import java.util.ArrayList;
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

    public static void agendarTutoria(){
        System.out.println("..:: Agendar Tutoria ::..");

        int respuestaConfirmacion = 0;

        do {
            System.out.println("Seleccione un maestro");
            int i = 1;
            for(Maestro maestro : UIMaestro.maestrosConTutoria){
                System.out.println(i +" " +  maestro.getNombre());
                i++;
            }

            Scanner input = new Scanner(System.in);
            int respuestaMaestro = input.nextInt();

            Maestro maestroSeleccionado = UIMaestro.maestrosConTutoria.get(respuestaMaestro - 1);

            System.out.println("Seleccione una tutoría");
            i = 1;
            for(Maestro.TutoriasDisponibles td : maestroSeleccionado.getTutoriasDisponibles()){
                System.out.println(i + ".- " + td.getFecha() + " " + td.getHora());
                i++;
            }

            int tutoriaSeleccionado = input.nextInt();

            do {
                System.out.println("Maestro: " + maestroSeleccionado.getNombre() + ", Tutoría:" +
                        maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionado - 1).getFecha());
                System.out.println("1.- Continuar \n2.- Cambiar tutoría");
                 respuestaConfirmacion = input.nextInt();
            }while (tutoriaSeleccionado < 1 || respuestaConfirmacion > 2);
            if (respuestaConfirmacion == 1){
                Maestro.TutoriasDisponibles ts = maestroSeleccionado.getTutoriasDisponibles().get(tutoriaSeleccionado - 1);
                UIMenu.estudianteLogeado.addTutoriaMaestro(maestroSeleccionado, ts.getFechaDate(), ts.getHora());
            }
        }while (respuestaConfirmacion != 1);



    }


    private static void listarTutorias(){
        System.out.println("..:: Listar Tutoria ::..");

        ArrayList<CitaMaestro> misTutorias = UIMenu.estudianteLogeado.getTutoriasAgendadas();

        if (misTutorias.isEmpty()){
            System.out.println("No hay tutorias disponibles");
        }

        int i=1;
        for(CitaMaestro cita : misTutorias){
            System.out.println(i + ".- " + cita);
            i++;
        }
        System.out.println();
    }
}
