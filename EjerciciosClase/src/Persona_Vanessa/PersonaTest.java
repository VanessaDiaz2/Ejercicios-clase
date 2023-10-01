package Persona_Vanessa;

import java.util.Scanner;

public class PersonaTest {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, sexo;
        int edad, peso, altura;
        String dni;

        System.out.print("Ingrese nombre: ");
        nombre = sc.next();
        System.out.print("Ingrese edad: ");
        edad = sc.nextInt();
        System.out.print("Ingrese sexo: ");
        sexo = sc.next();
        System.out.print("Ingrese peso: ");
        peso = sc.nextInt();
        System.out.print("Ingrese altura: ");
        altura = sc.nextInt();
        System.out.print("Ingrese dni: ");
        dni = sc.next();

        Persona persona1 = new Persona(nombre, edad, dni, sexo, peso, altura);
        Persona persona2 = new Persona();

        persona2.setNombre("Pedro");
        persona2.setEdad(47);
        persona2.generarDNI();
        persona2.setSexo("Hombre");
        persona2.setAltura(180);
        persona2.setPeso(75);

        System.out.println("IMC Persona 1: " + persona1.calcularIMC(persona1.getPeso(), persona1.getAltura()));
        System.out.println("IMC Persona 2: " + persona2.calcularIMC(persona2.getPeso(), persona2.getAltura()));

        System.out.println("Persona 1: " + persona1);
        System.out.println("Persona 2: " + persona2);

    }
    
}
