package Ejercicio3;
import java.time.LocalDateTime;

public interface ParkingVanessa {

    public boolean hayPlaza();

    public void aparcarCoche(VehiculoVanessa coche) throws Exception;

    public double sacarCoche(VehiculoVanessa coche, LocalDateTime paramFechaInicio, LocalDateTime paraFechaFin)
            throws Exception;

    public double getFactura(LocalDateTime paramFechaInicio, LocalDateTime paraFechaFin);

}
