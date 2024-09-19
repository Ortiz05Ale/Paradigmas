package Pilares;

public class Order {
    private double price;
    private int quantity;

    // Constructor de Order
    public Order(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    // Método para calcular el precio total, considerando impuestos
    public void calculateTotalPrice() {
        // Clase anidada local dentro de este método
        class TaxCalculator {
            private double taxRate = 0.1; // 10% de impuesto

            public double calculateTax() {
                return price * quantity * taxRate;
            }
        }

        // Crear una instancia de la clase anidada local
        TaxCalculator taxCalculator = new TaxCalculator();
        double totalTax = taxCalculator.calculateTax();
        double totalPrice = (price * quantity) + totalTax;

        System.out.println("Price without tax: " + (price * quantity));
        System.out.println("Tax amount: " + totalTax);
        System.out.println("Total price with tax: " + totalPrice);
    }

    public static void main(String[] args) {
        Order order = new Order(100.0, 5);
        order.calculateTotalPrice(); // Llama al método que usa la clase anidada local
    }
}

