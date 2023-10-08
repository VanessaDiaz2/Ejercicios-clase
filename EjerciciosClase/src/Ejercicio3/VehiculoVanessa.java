package Ejercicio3;

import java.time.LocalDateTime;

public class VehiculoVanessa {

    private String maticula;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;

    public VehiculoVanessa(String paramMatricula, LocalDateTime paramFechaInicio, LocalDateTime paraFechaFin) {
        this.maticula = paramMatricula;
        this.fechaInicio = paramFechaInicio;
        this.fechaFin = paraFechaFin;
    }

    // Métodos

    public String getMaticula() {
        return maticula;
    }

    public void setMaticula(String maticula) {
        this.maticula = maticula;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "VehiculoVanessa [maticula=" + maticula + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
                + "]";
    }

}

