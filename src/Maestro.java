import java.util.ArrayList;
import java.util.Date;

public class Maestro {


    // Atributos
    public static int ID =1;

    private String nombre;
    private int id;
    private String especialidad;


    public Maestro(){
        id = ID;
        ID++;
    }

    public Maestro(String nombre){
        this.nombre = nombre;
        id = ID;
        ID++;

    }

    public Maestro(String nombre, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
        id = ID;
        ID++;
    }



    public void mostrarId(){
        System.out.println("ID: " + id);
    }

    public void mostrarNombre(){
        System.out.println("Nombre: " + nombre);
    }

    //Get and Set

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    ArrayList <TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();


    //Clase anidada
    public static class TutoriasDisponibles{
        private int id;
        private Date fecha;
        private String hora;

        TutoriasDisponibles(Date fecha, String hora){
            this.fecha = fecha;
            this.hora = hora;
        }
    }
}