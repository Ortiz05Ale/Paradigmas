import Model.*;
import UI.*;

import java.util.Date;

import static UI.UIMenu.*;
public class Main {
    public static void main(String[] args) {
        maestros.add(new Maestro("Luis Morales", "luismorales04@uv.mx", 57522));
        maestros.add(new Maestro("Javier Pino", "jpino@uv.mx", 11111));
        maestros.add(new Maestro("Magdiel Mercado", "mamercado@uv.mx", 22222));
        maestros.add(new Maestro("Patricia Martínez", "pmartinez@uv.mx", 33333));

        estudiantes.add(new Estudiante("Ricardo Landa", "landa.uv.mx", "zs220170"));
        estudiantes.add(new Estudiante("Alexis Lava Ollas", "nava.uv.mx", "zs220170"));
        estudiantes.add(new Estudiante("Roberto Zuñigaberto", "figmaberto.uv.mx", "zs220170"));

        mostrarMenu();
    }

}