package Pilares;

public class Button {
    private String label;

    // Constructor de la clase Button
    public Button(String label) {
        this.label = label;
    }

    // Método para simular el click del botón
    public void click() {
        System.out.println(label + " button clicked!");
    }

    // Método que permite asignar un comportamiento cuando el botón es clicado
    public void setOnClickListener(OnClickListener listener) {
        listener.onClick();
    }

    // Interfaz interna que define el comportamiento de click
    public interface OnClickListener {
        void onClick();
    }

    public static void main(String[] args) {
        // Crear un botón
        Button submitButton = new Button("Submit");

        // Usar una clase anidada anónima para definir el comportamiento del clic
        submitButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Submit action performed!");
            }
        });

        // Simular el clic del botón
        submitButton.click();
    }
}

