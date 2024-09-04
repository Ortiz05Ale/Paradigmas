public class Maestro {


    // Atributos
    String nombre;
    public static int id = 0;
    String especialidad;



    public Maestro(String nombre)
    {
        id++;
        this.nombre = nombre;
        System.out.println("yo me ejecute primero");
    }

    public void mostrarId()
    {
        System.out.println("ID: " + id);
    }

    //comportamientos / Metodos
    //verbo o sustantivo
    public void mostrarNombre()
    {
        System.out.println("Nombre: " + nombre);
    }

}