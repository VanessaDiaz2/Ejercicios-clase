package Ejercicio4;

public class Punto {
    
    private int x;
    private int y;

    public Punto(int x,int y){
        this.x=x;
        this.y=y;
    }

    public boolean comparar(Punto p){
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Punto otroPunto = (Punto) p;
        return this.x == otroPunto.x && this.y == otroPunto.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    public double distancia(Punto otrPunto){
        return Math.sqrt(Math.pow(otrPunto.getX() - x, 2) + Math.pow(otrPunto.getY() - y, 2));
    }

}
