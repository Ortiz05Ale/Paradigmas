public class Main {
    public static void main(String[] args) {

        Maestro maestro = new Maestro("German");
        maestro.nombre = "German";
        maestro.mostrarNombre();

        Calculator.Suma(14,16);
        System.out.println(Calculator.Pi);
        maestro.mostrarId();

        Maestro maestro2 = new Maestro("Dc nava");

        maestro2.mostrarNombre();

        Maestro.id++;

        maestro.mostrarId();




    }
}