package Ejercicio3;

import java.time.LocalDateTime;
import java.time.Duration;
import java.lang.Exception;

public class ParkingVehiculoVanessa implements ParkingVanessa {

    public static final double precioMinuto = 0.0425;
    public static final int maximoPlazas = 100;

    private String direccionParking;
    private static int plazasActualesOcupadas = 0;

    public ParkingVehiculoVanessa(String paramDireccionParking) {
        this.direccionParking = paramDireccionParking;
    }

    public boolean hayPlaza() {
        if (plazasActualesOcupadas < maximoPlazas) {
            return true;
        } else {
            return false;
        }

    }

    public void aparcarCoche(VehiculoVanessa coche) throws Exception {
        if (hayPlaza()) {
            plazasActualesOcupadas++;
            System.out.println("Vehículo " + coche.getMaticula() + " aparcado con éxito");
        } else {
            throw new Exception("NO hay plazas disponibles");
        }
    }

    public double sacarCoche(VehiculoVanessa coche, LocalDateTime paramFechaInicio,
            LocalDateTime paraFechaFin) throws Exception {
        if (!paramFechaInicio.isBefore(paraFechaFin)) {
            throw new Exception("La fecha de fin es inferior a la fecha de inicio");
        }
        if (!paramFechaInicio.isBefore(LocalDateTime.now())) {
            throw new Exception("La fecha de inicio es inferior a la fecha actual");
        }
        if (!paraFechaFin.isBefore(LocalDateTime.now())) {
            throw new Exception("La fecha de fin es inferior a la fecha actual");
        }

        plazasActualesOcupadas--;
        return getFactura(paramFechaInicio, paraFechaFin);
    }

    public double getFactura(LocalDateTime paramFechaInicio, LocalDateTime paraFechaFin) {

        Duration duracion = Duration.between(paramFechaInicio, paraFechaFin);
        double tiempo = duracion.toMinutes();
        return tiempo * precioMinuto;
    }

    public String getDireccionParking() {
        return direccionParking;
    }

    public void setDireccionParking(String direccionParking) {
        this.direccionParking = direccionParking;
    }

    public int getPlazasActualesOcupadas() {
        return plazasActualesOcupadas;
    }

    @Override
    public String toString() {
        return "ParkingVehiculoVanessa [direccionParking=" + direccionParking + ", plazasActualesOcupadas="
                + plazasActualesOcupadas + "]";
    }

}

