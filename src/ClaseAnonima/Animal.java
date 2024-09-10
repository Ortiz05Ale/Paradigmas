package ClaseAnonima;

abstract class Animal {
    abstract void makeSound();
}

class Main {
    public static void main(String[] args) {
        Animal perro = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Wof Wof");
            }
        };
        Animal gato = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Meow Meow");
            }
        };

        perro.makeSound();
        gato.makeSound();
    }
}
