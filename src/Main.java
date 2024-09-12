import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //mostrarMenu();
        /*
        ClaseExterna instancia = new ClaseExterna();
        ClaseExterna.claseInterna instanciaAnidada = instancia.new claseInterna();
        instanciaAnidada.saludar();
        */

        Maestro maestro = new Maestro("Morales", 5785, "morales@uv.mx");


        //Agregar tutorias
        maestro.addTutoriasDisponibles(new Date(), "12:00");
        maestro.addTutoriasDisponibles(new Date(), "14:00");
        maestro.addTutoriasDisponibles(new Date(), "16:00");
        System.out.println(maestro);


    }

}