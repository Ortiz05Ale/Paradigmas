package Model;

import java.util.ArrayList;
import java.util.Date;
public class Maestro extends Usuario {
    //Atributos
    private int numPersonal;
    private String especialidad;

    //Constructor
    public Maestro(String nombre, String correo, int numPersonal) {
        super(nombre, correo);
        this.numPersonal = numPersonal;
    }

    //Get and Set
    public int getNumPersonal() {
        return numPersonal;
    }

    public void setNumPersonal(int numPersonal) {
        this.numPersonal = numPersonal;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    ArrayList<TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();
    public void addTutoriaDisponible(String fecha, String hora) {
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));

    }

    public ArrayList<TutoriasDisponibles> getTutoriasDisponibles() {
        return tutoriasDisponibles;
    }

    public static class TutoriasDisponibles extends CitaTutoria{
        TutoriasDisponibles(String fecha, String hora) {
            super(fecha, hora);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Personal: " + numPersonal +
                "\nLos cursos disponibles son:\n" +
                tutoriasDisponibles;
    }

    @Override
    public void saludar() {
        System.out.println("Hola papus");
    }
}