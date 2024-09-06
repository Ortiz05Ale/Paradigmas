import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //mostrarMenu();
        //Cuando la clase
        /*
        ClaseExterna instancia = new ClaseExterna();
        ClaseExterna.claseInterna instanciaAnidada = instancia.new claseInterna();
        instanciaAnidada.saludar();
        */

        Maestro maestro = new Maestro("Morales");

        //Agregar tutorias
        maestro.addCursoDisponible(new Date(), "12:00");
        maestro.addCursoDisponible(new Date(), "14:00");
        maestro.addCursoDisponible(new Date(), "16:00");
        //Listar tutorías
        System.out.println(maestro.getCursosDisponibles());

        System.out.println("Cursos disponibles");
        for(Maestro.TutoriasDisponibles td : maestro.getCursosDisponibles()) {
            System.out.println(td.getFecha() + " " + td.getHora());
        }

    }

}