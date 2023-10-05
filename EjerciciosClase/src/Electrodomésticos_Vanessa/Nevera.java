package Electrodomésticos_Vanessa;

public class Nevera extends Electrodomésticos{
   
    private int capacidadFrigorífico;
    private int capacidadCongelador;
    private int sonoridad;

    public Nevera(){
        super();
        capacidadFrigorífico=300;
        capacidadCongelador=200;
    }

    public Nevera(String marca,String modelo,double precio,String color,
    double pWatios, int horasDía, int díasAño,double precioEnergía,int capacidadFrigorífico, 
    int capacidadCongelador, int sonoridad){
        super(marca,modelo,precio,color,pWatios,horasDía,díasAño,precioEnergía);
        this.capacidadFrigorífico=capacidadFrigorífico;
        this.capacidadCongelador=capacidadCongelador;
        this.sonoridad=sonoridad;
    }

    @Override
    public double consumoAnual() {
        double consumoAnual = super.consumoAnual();

        if (capacidadFrigorífico > 300 || capacidadCongelador > 200) {
            consumoAnual += 50; 
        }

        return consumoAnual;
    }

    public int getCapacidadFrigorífico() {
        return capacidadFrigorífico;
    }

    public void setCapacidadFrigorífico(int capacidadFrigorífico) {
        this.capacidadFrigorífico = capacidadFrigorífico;
    }

    public int getCapacidadCongelador() {
        return capacidadCongelador;
    }

    public void setCapacidadCongelador(int capacidadCongelador) {
        this.capacidadCongelador = capacidadCongelador;
    }

    public int getSonoridad() {
        return sonoridad;
    }

    public void setSonoridad(int sonoridad) {
        this.sonoridad = sonoridad;
    }

    @Override
    public String toString() {
        return "Nevera ["+ super.toString() +"capacidadFrigorífico=" + capacidadFrigorífico + 
        ", capacidadCongelador=" + capacidadCongelador
                + ", sonoridad=" + sonoridad + "]";
    }

    
}
