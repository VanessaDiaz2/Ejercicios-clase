package Ejercicio2;

public class Ordenador {
    private String codigo;
    private int Ram;
    private String CPU;
    private double precio;

    public Ordenador(String codigo,int Ram,String CPU,double precio){
        this.codigo=codigo;
        this.Ram=Ram;
        this.CPU=CPU;
        this.precio=precio;
    }

    public void caracteristicas(){
        System.out.println("Código: "+ codigo);
        System.out.println("RAM: "+ Ram);
        System.out.println("CPU: "+ CPU);
        System.out.println("Precio: "+ precio);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String cPU) {
        CPU = cPU;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador [codigo=" + codigo + ", Ram=" + Ram + ", CPU=" + CPU + ", precio=" + precio + "]";
    }

    


    
}
