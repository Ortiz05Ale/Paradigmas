package Pilares;

public class Computer {
    private String brand;
    private int ram;

    // Constructor de la clase externa
    public Computer(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public void displayDetails() {
        System.out.println("Computer brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
    }

    // Clase anidada estática
    public static class Processor {
        private int cores;
        private String manufacturer;

        // Constructor de la clase anidada estática
        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public void displayProcessorDetails() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        // Creación de una instancia de Computer
        Computer computer = new Computer("Dell", 16);
        computer.displayDetails();

        // Creación de una instancia de la clase anidada estática Processor
        Computer.Processor processor = new Computer.Processor(8, "Intel");
        processor.displayProcessorDetails();
    }
}

