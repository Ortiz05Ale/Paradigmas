import Model.*;
import UI.*;

import java.util.Date;

import static UI.UIMenu.*;
public class Main {
    public static void main(String[] args) {

        Maestro maestro1 = new Maestro("Luis Morales", "luismorales04@uv.mx", 57522);
        maestro1.addTutoriaDisponible("18/10/2024" , "13:00");
        maestro1.addTutoriaDisponible("20/10/2024" , "14:00");

        Maestro maestro2 = new Maestro("Javier Pino", "jpino@uv.mx", 11111);
        maestro2.addTutoriaDisponible("05/10/2024" , "09:00");
        maestro2.addTutoriaDisponible("16/10/2024" , "12:00");
        maestro2.addTutoriaDisponible("15/10/2024" , "16:00");

        Maestro maestro3 = new Maestro("Magdiel Mercado", "mamercado@uv.mx", 22222);

        maestros.add(maestro1);
        maestros.add(maestro2);
        maestros.add(maestro3);

        UIMaestro.maestrosConTutoria.add(maestro1);
        UIMaestro.maestrosConTutoria.add(maestro2);


        estudiantes.add(new Estudiante("Ricardo Landa", "landa.uv.mx", "zs220170"));
        estudiantes.add(new Estudiante("Alexis Lava Ollas", "nava.uv.mx", "zs220170"));
        estudiantes.add(new Estudiante("Roberto Zuñigaberto", "figmaberto.uv.mx", "zs220170"));
        // mostrarMenu();
        UIEstudiantes.agendarTutoria();
    }

}