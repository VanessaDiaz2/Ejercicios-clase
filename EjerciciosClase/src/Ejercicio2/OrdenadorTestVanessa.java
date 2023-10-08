package Ejercicio2;

public class OrdenadorTestVanessa {
    public static void main(String[] args) {
        
        Portatil portatil = new Portatil("P001", 16, "Intel Core i7", 1200.0, 2.5);
        Sobremesa sobremesa = new Sobremesa("S001", 32, "AMD Ryzen 9", 1500.0, "Torre ATX");

        System.out.println("Características del Portátil:");
        portatil.caracteristicas();

        System.out.println("\nCaracterísticas de la Sobremesa:");
        sobremesa.caracteristicas();

    }
}
