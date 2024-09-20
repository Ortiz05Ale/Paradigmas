package UI;

import Model.Estudiante;
import Model.Maestro;
import Model.Secretaria;

import java.util.ArrayList;
import java.util.Scanner;
import static UI.UIEstudiantes.*;
import static UI.UIMaestro.*;
import static UI.UISecretaria.*;

public class UIMenu {
    public static ArrayList<Maestro> maestros = new ArrayList<>();
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static ArrayList<Secretaria> secretarias = new ArrayList<>();
    public static Maestro maestroLogeado;
    public static Estudiante estudianteLogeado;
    public static Secretaria secretariaLogeada;

    public static void mostrarMenu() {
        int respuesta;
        do {
            System.out.println("...:: Bienvenido ::..");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Maestros");
            System.out.println("2. Estudiantes");
            System.out.println("3. Secretaria");
            System.out.println("0. Salir");
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    loginUsuario(1);
                    break;
                case 2:
                    loginUsuario(2);
                    break;
                case 3:
                    loginUsuario(3);
                    break;
                case 0:
                    System.out.println("..:: Bye ::..");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Por favor, seleccione una respuesta válida");
                    break;
            }
        } while (respuesta != 0);
    }

    public static void loginUsuario(int tipoUsuario) {
        //Maestro -> 1
        //Estudiante -> 2
        //Secretaria -> 3
        boolean banderaCorreo = true;
        do {
            System.out.println("Ingresa tu correo: ");
            Scanner sc = new Scanner(System.in);
            String correoUsuario = sc.nextLine();
            if (tipoUsuario == 1) {
                for(Maestro maestro : maestros) {
                    if (maestro.getCorreo().equals(correoUsuario)) {
                        banderaCorreo = false;
                        maestroLogeado = maestro;
                        maestroMenu();
                    }
                }
            } else if (tipoUsuario == 2) {
                for(Estudiante estudiante : estudiantes) {
                    if (estudiante.getCorreo().equals(correoUsuario)) {
                        banderaCorreo = false;
                        estudianteLogeado = estudiante;
                        estudianteMenu();
                    }
                }
            } else if (tipoUsuario == 3) {
                for(Secretaria secretaria : secretarias) {
                    if (secretaria.getCorreo().equals(correoUsuario)) {
                        banderaCorreo = false;
                        secretariaLogeada = secretaria;
                        secretariaMenu();
                    }
                }
            }
        } while (banderaCorreo);

    }



}



