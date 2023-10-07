package Impresora_Vanessa;

public class ImpresoraTinta implements Impresora{
    private int velocidad;

    public ImpresoraTinta(int velocidad){
        this.velocidad=velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "ImpresoraLaser [velocidad=" + velocidad + "]";
    }

    @Override
    public void imprimir(String texto) {
        System.out.println(texto);
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public boolean esMasRapida(Impresora otraImpresora) {
        return this.getVelocidad() > otraImpresora.getVelocidad();
    }

}
