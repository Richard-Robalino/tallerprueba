

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Conferencia conferencia1 = new Conferencia(1234, "Juan", 2025/5/25, "Conferencia", 1000.20,false,false);
        Conferencia conferencia2 = new Conferencia(1235, "Pepe", 2024/6/15, "Conferencia", 100.20,false,true);
        // Mostrar información de los objetos
        System.out.println("Conferencia 1: " + conferencia1.getCliente()+  " - Costo: " + conferencia1.calcularCosto());
        System.out.println("Conferencia 2: " + conferencia2.getCliente() + " - Costo: " + conferencia2.calcularCosto());


    }
}
