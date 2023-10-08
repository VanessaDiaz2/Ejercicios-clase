package Ejercicio4;

public class Suceso extends Punto3D{

    private int tiempo;
    private String direccion;

    public Suceso(int x, int y, int z,int tiempo,String descripcion) {
        super(x, y, z);
        this.tiempo=tiempo;
        this.direccion=descripcion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Suceso ["+super.toString()+"tiempo=" + tiempo + ", direccion=" + direccion + "]";
    }

    
    
}
