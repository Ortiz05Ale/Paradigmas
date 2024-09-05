import static UI.UIMenu.*;

public class Main {

    public static void main(String[] args) {
        //mostrarMenu();

        Maestro maestro = new Maestro("Pato");
        Maestro maestro2 = new Maestro("Mag", "Base de datos");
        Maestro maestro3 = new Maestro();
        System.out.println(maestro.id + maestro.nombre);
        System.out.println(maestro2.id + maestro2.nombre);
    }

}