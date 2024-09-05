public class Maestro {


    // Atributos
    public static int ID =1;

    String nombre;
    int id;
    String especialidad;


    public Maestro(){
        System.out.println("yo me ejecute primero");
        id = ID;
        ID++;
    }

    public Maestro(String nombre){
        System.out.println("sobrecarga con un argumento");
        this.nombre = nombre;
        id = ID;
        ID++;

    }

    public Maestro(String nombre, String especialidad){
        System.out.println("sobrecarga con dos argumento");
        this.nombre = nombre;
        this.especialidad = especialidad;
        id = ID;
        ID++;
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