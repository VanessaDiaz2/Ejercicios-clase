package Electrodomésticos_Vanessa;

public class Televisor extends Electrodomésticos{
    private int resolucion;   

    public Televisor(){
        super();
        resolucion=50;
    }

    public Televisor(String marca,String modelo,double precio,String color,
    double pWatios, int horasDía, int díasAño,double precioEnergía,int resolucion){
        super(marca,modelo,precio,color,pWatios,horasDía,díasAño,precioEnergía);
        this.resolucion=resolucion;
    }

    @Override
    public double consumoAnual() {
        double consumoAnual = super.consumoAnual();

        if (resolucion > 50) {
            consumoAnual += 30; 
        }

        return consumoAnual;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Televisor ["+super.toString()+"resolucion=" + resolucion + "]";
    }

    

}
