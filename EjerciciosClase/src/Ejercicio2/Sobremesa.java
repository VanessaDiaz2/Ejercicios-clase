package Ejercicio2;

public class Sobremesa extends Ordenador{
    
    private String tipoTorre;

    public Sobremesa(String codigo,int Ram,String CPU,double precio,String tipoTorre){
        super(codigo,Ram,CPU,precio);
        this.tipoTorre=tipoTorre;
    }

    public void caracteristicas() {
        super.caracteristicas();
        System.out.println("Tipo de Torre: "+tipoTorre);
    }

    public String getTipoTorre() {
        return tipoTorre;
    }

    public void setTipoTorre(String tipoTorre) {
        this.tipoTorre = tipoTorre;
    }

    @Override
    public String toString() {
        return "Sobremesa [tipoTorre=" + tipoTorre + "]";
    }

    

}
