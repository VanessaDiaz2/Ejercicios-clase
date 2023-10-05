package Electrodomésticos_Vanessa;

public class Electrodomésticos {
    
private String marca;
private String modelo;
private double precio;
private String color;
private double pWatios;
private int horasDía;
private int díasAño;
private double precioEnergía;

    public Electrodomésticos(){
        marca="bosch";
        modelo="7200";
        precio=400.00;
        color="gris";
        pWatios=2300.00;
        horasDía=1;
        díasAño=144;
        precioEnergía=0.40397;
    }

    public Electrodomésticos(String marca,String modelo,double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        color="gris";
        pWatios=2300.00;
        horasDía=1;
        díasAño=144;
        precioEnergía=0.40397;
    }

    public Electrodomésticos(String marca,String modelo,double precio,String color,
    double pWatios, int horasDía, int díasAño,double precioEnergía){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        this.color=color;
        this.pWatios=pWatios;
        this.horasDía=horasDía;
        this.díasAño=díasAño;
        this.precioEnergía=precioEnergía;
    }

    public double consumoAnual() {
        double consumoDiario = (pWatios * horasDía) / 1000; // kWh
        double consumoAnual = consumoDiario * díasAño * pWatios;
        return consumoAnual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getpWatios() {
        return pWatios;
    }

    public void setpWatios(double pWatios) {
        this.pWatios = pWatios;
    }

    public int getHorasDía() {
        return horasDía;
    }

    public void setHorasDía(int horasDía) {
        this.horasDía = horasDía;
    }

    public int getDíasAño() {
        return díasAño;
    }

    public void setDíasAño(int díasAño) {
        this.díasAño = díasAño;
    }

    public double getPrecioEnergía() {
        return precioEnergía;
    }

    public void setPrecioEnergía(double precioEnergía) {
        this.precioEnergía = precioEnergía;
    }

    @Override
    public String toString() {
        return "Electrodomésticos [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
                + ", pWatios=" + pWatios + ", horasDía=" + horasDía + ", díasAño=" + díasAño + ", precioEnergía="
                + precioEnergía + "]";
    }

    

}
