package Pilares;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Empleado> empleados;

    // Constructor de la clase Empresa
    public Empresa() {
        empleados = new ArrayList<>();
    }

    // Método para agregar empleados a la empresa
    public void agregarEmpleado(String nombre, String puesto) {
        empleados.add(new Empleado(nombre, puesto));
    }

    // Método para mostrar la información de todos los empleados
    public void mostrarEmpleados() {
        EmpleadoIterator iterator = new EmpleadoIterator();
        while (iterator.hasNext()) {
            Empleado emp = iterator.next();
            System.out.println(emp.getDetalles());
        }
    }

    // Clase interna Empleado
    private class Empleado {
        private String nombre;
        private String puesto;

        public Empleado(String nombre, String puesto) {
            this.nombre = nombre;
            this.puesto = puesto;
        }

        public String getDetalles() {
            return "Empleado: " + nombre + ", Puesto: " + puesto;
        }
    }

    // Clase interna EmpleadoIterator para recorrer la lista de empleados
    private class EmpleadoIterator {
        private int index = 0;

        public boolean hasNext() {
            return index < empleados.size();
        }

        public Empleado next() {
            if (hasNext()) {
                return empleados.get(index++);
            }
            return null;
        }
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado("Juan Pérez", "Ingeniero de Software");
        empresa.agregarEmpleado("Ana Gómez", "Gerente de Proyectos");
        empresa.mostrarEmpleados();
    }
}
