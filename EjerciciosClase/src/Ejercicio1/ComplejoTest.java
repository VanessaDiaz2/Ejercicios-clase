package Ejercicio1;

public class ComplejoTest {
 
    public static void main(String[] args) {
        
        Complejo c1=new Complejo(3.0,2.0);
        Complejo c2=new Complejo();

        c2.asignar(1.0, -4.0);

        System.out.print("C1: ");
        c1.imprimir();

        System.out.print("C2: ");
        c2.imprimir();

        System.out.print("Suma: ");
        Complejo c3=new Complejo();
        c3=c3.sumar(c1,c2);

        c3.imprimir();

    }
    
}
