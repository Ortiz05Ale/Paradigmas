import java.util.ArrayList;
import java.util.Date;

public class Maestro extends Usuario{


    // Atributos
    private int numeroPersonal;
    private String especialidad;

    //Constructor
    public Maestro(String nombre) {
        super();
    }

    //Get and Set
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getNumeroPersonal() {
        return numeroPersonal;
    }

    public void setNumeroPersonal(int numeroPersonal) {
        this.numeroPersonal = numeroPersonal;
    }

    //ArrayList
    ArrayList <TutoriasDisponibles> tutoriasDisponibles = new ArrayList<>();

    public void addCursoDisponible(Date fecha, String hora){
        tutoriasDisponibles.add(new TutoriasDisponibles(fecha, hora));
    }

    public ArrayList <TutoriasDisponibles> getCursosDisponibles(){
        return tutoriasDisponibles;
    }


    //Clase anidada
    public static class TutoriasDisponibles{
        private int id;
        private Date fecha;
        private String hora;

        TutoriasDisponibles(Date fecha, String hora){
            this.fecha = fecha;
            this.hora = hora;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }
    }
}