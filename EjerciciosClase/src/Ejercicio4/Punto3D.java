package Ejercicio4;

public class Punto3D extends Punto{

    private int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z=z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Punto3D ["+super.toString()+" z=" + z + "]";
    }

    public double distancia(Punto3D otrPunto){
        return Math.sqrt(Math.pow(otrPunto.getX() - super.getX(), 2) + Math.pow(otrPunto.getY() - super.getY(), 2) + Math.pow(otrPunto.getZ() - z, 2));
    }

    public boolean comparar(Punto3D p){
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Punto3D otroPunto = (Punto3D) p;
        return super.getX() == otroPunto.getX() && super.getY() == otroPunto.getY() 
        && z == otroPunto.getZ();
    }
    
}
