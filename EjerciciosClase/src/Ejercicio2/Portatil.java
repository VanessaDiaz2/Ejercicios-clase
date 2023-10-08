package Ejercicio2;

public class Portatil extends Ordenador{

    private double peso;

    public Portatil(String codigo,int Ram,String CPU,double precio,double peso){
        super(codigo,Ram,CPU,precio);
        this.peso=peso;
    }

    
    public void caracteristicas() {
        super.caracteristicas();
        System.out.println("Peso: "+peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Portatil [peso=" + peso + "]";
    }

    



}
