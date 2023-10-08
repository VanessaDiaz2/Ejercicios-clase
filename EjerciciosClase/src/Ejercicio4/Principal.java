package Ejercicio4;

public class Principal {
    public static void main(String[] args) {
        
        Punto p1=new Punto(2, 3);
        Punto p2=new Punto(2,3);

        System.out.println("Distancia:"+p1.distancia(p2));

        System.out.println(p1+" es igual a "+p2+"= "+ p1.comparar(p2));

        Punto3D p3=new Punto3D(6, -2, 4);
        Punto3D p4=new Punto3D(2, 1, -7);

        System.out.println("Distancia: "+ p3.distancia(p4) );

        System.out.println(p3+" es igual a "+p4+"= "+ p3.comparar(p4));
        
        

    }

}
