package Ejercicio1;

public class Complejo {
    
    private double dPReal; 
    private double dPImag;

    public Complejo(){
        dPReal=0;
        dPImag=0;
    }

    public Complejo(double x,double y){
        this.dPReal=x;
        this.dPImag=y;
    }

    public void asignar(double x,double y){
        this.dPReal=x;
        this.dPImag=y;
    }

    public Complejo sumar(Complejo c1,Complejo c2){

        Complejo c3=new Complejo();
        c3.dPReal=c1.dPReal+c2.dPReal;
        c3.dPImag=c1.dPImag+c2.dPImag;

        return c3;
    }

    public double getdPReal() {
        return dPReal;
    }

    public void setdPReal(double dPReal) {
        this.dPReal = dPReal;
    }

    public double getdPImag() {
        return dPImag;
    }

    public void setdPImag(double dPImag) {
        this.dPImag = dPImag;
    }

    public void imprimir(){
        if(this.dPReal > 0 && this.dPImag > 0){
            System.out.println("z= "+this.dPReal +" + "+this.dPImag+"i");
        }else if(this.dPReal > 0 && this.dPImag < 0){
            System.out.println("z= "+this.dPReal +" "+this.dPImag+"i");
        }else if(this.dPReal < 0 && this.dPImag > 0){
            System.out.println("z= -"+this.dPReal +" + "+this.dPImag+"i");
        }else{
            System.out.println("z="+this.dPReal +" "+this.dPImag+"i");
        }
        
    }

    


}
