package Figura_Vanessa;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        this.radio=radio;
    }

    @Override
    public void cacularArea() {
        total=Math.PI*(Math.pow(radio, 2));
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    


}
