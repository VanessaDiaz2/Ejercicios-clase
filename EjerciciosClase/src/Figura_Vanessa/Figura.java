package Figura_Vanessa;

public abstract class Figura {
   double total=0;
   //Método ya implementado que herendan la subclases
   public void mostrarArea(){
    System.out.println("Área calculada de "+
    this.getClass()+" es: "+total);
   } 
   //Método que deben implemnetar las subclases
   abstract public void cacularArea();
}
