package Model;

public class Secretaria extends Usuario{
    private String area;
    private String turno;

    Secretaria(String nombre, String correo, String turno){
        super(nombre, correo);
        this.turno = turno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() + "area: " + area;
    }

    @Override
    public void saludar() {
        System.out.println("Hola secretaria");
    }
}
