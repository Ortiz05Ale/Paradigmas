package InterfazClasesAbstractas;

public interface Vehiculo {
    void arrancar();
    void detener();
}

abstract class Refaccion{
    public void llenarGasolina() {
        System.out.println("Llenando gasolina");
    }
    public void cambiarLlanta(){
        System.out.println("Cambiando llanta");
    }
    public void volar(){
        System.out.println("Volar");
    }
}

class Automovil extends Refaccion implements Vehiculo {
    public void arrancar() {
        System.out.println("Arrancando automovil");
    }
    public void detener() {
        System.out.println("Detenendo automovil");
    }

    @Override
    public void llenarGasolina() {
        super.llenarGasolina();
    }

    @Override
    public void cambiarLlanta() {
        super.cambiarLlanta();
    }
}

class Motocicleta extends Refaccion implements Vehiculo {
    public void arrancar() {
        System.out.println("Arrancando motocicleta");
    }
    public void detener() {
        System.out.println("Detenendo motocicleta");
    }

    @Override
    public void llenarGasolina() {
        super.llenarGasolina();
    }
    @Override
    public void cambiarLlanta(){
        super.cambiarLlanta();
    }
}

class Helicoptero extends Refaccion implements Vehiculo{
    @Override
    public void arrancar() {
        System.out.println("Despegando helicóptero");
    }

    @Override
    public void detener() {
        System.out.println("Aterrizando helicoptero");
    }

    @Override
    public void llenarGasolina() {
        super.llenarGasolina();
    }

    @Override
    public void volar(){
        super.volar();
    }
}
class Main{
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        automovil.arrancar();
        automovil.detener();
        automovil.llenarGasolina();
        System.out.println("");
        Motocicleta motocicleta = new Motocicleta();
        motocicleta.arrancar();
        motocicleta.detener();
        motocicleta.llenarGasolina();
        System.out.println("");
        Helicoptero helicoptero = new Helicoptero();
        helicoptero.arrancar();
        helicoptero.detener();
        helicoptero.llenarGasolina();
        helicoptero.volar();
    }
}
