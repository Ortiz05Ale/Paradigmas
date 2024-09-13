public class Estudiante extends Usuario {

    private String matricula;
    private String semestre;

    public Estudiante(String nombre,String correo, String matricula) {
        super(nombre, correo);
        this.matricula = matricula;
    }

    //Getters and Setters
    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + "matricula: " + matricula;
    }

    @Override
    public void saludar() {
        System.out.println("Hola estudiante");
    }
}
