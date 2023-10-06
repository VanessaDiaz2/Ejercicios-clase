package Figura_Vanessa;

public class Rectangulo extends Figura{
    
    private double paramBase;
    private double paramAltura;

    public Rectangulo(double paramBase,double paramAltura){
        this.paramBase=paramBase;
        this.paramAltura=paramAltura;
    }

    @Override
    public void cacularArea() {
        total= this.paramAltura*this.paramBase;
    }
    
    public double getParamBase() {
        return paramBase;
    }

    public void setParamBase(double paramBase) {
        this.paramBase = paramBase;
    }

    public double getParamAltura() {
        return paramAltura;
    }

    public void setParamAltura(double paramAltura) {
        this.paramAltura = paramAltura;
    }

    @Override
    public String toString() {
        return "Rectangulo [paramBase=" + paramBase + ", paramAltura=" + paramAltura + "]";
    }

    

    

}
