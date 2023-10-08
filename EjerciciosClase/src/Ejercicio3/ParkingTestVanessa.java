package Ejercicio3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParkingTestVanessa {

        public static void main(String[] args) {

                try {
                        // coche 1
                        VehiculoVanessa coche1 = new VehiculoVanessa("1234ABC",
                                        LocalDateTime.parse("24/03/2023 09:13:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                                        LocalDateTime.parse("24/03/2023 10:13:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                        // coche 2
                        VehiculoVanessa coche2 = new VehiculoVanessa("0815GYR",
                                        LocalDateTime.parse("24/03/2023 10:00:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                                        LocalDateTime.parse("24/03/2023 14:00:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                        // coche 3
                        VehiculoVanessa coche3 = new VehiculoVanessa("1111AAA",
                                        LocalDateTime.parse("24/03/2023 10:30:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                                        LocalDateTime.parse("24/03/2023 12:00:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                        // coche 4
                        VehiculoVanessa coche4 = new VehiculoVanessa("0000MBB",
                                        LocalDateTime.parse("24/03/2023 22:00:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                                        LocalDateTime.parse("25/03/2023 07:30:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                        // coche 5
                        VehiculoVanessa coche5 = new VehiculoVanessa("7610JBB",
                                        LocalDateTime.parse("24/03/2023 08:12:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                                        LocalDateTime.parse("24/02/2023 17:25:00",
                                                        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

                        // Parking
                        ParkingVehiculoVanessa parking = new ParkingVehiculoVanessa("TuParking");

                        // Test
                        parking.aparcarCoche(coche1);

                        System.out.println("La factura del coche " + coche1.getMaticula() + " es: " +
                                        +parking.sacarCoche(coche1, coche1.getFechaInicio(), coche1.getFechaFin()));

                        parking.aparcarCoche(coche2);

                        System.out.println("La factura del coche " + coche2.getMaticula() + " es: " +
                                        +parking.sacarCoche(coche2, coche2.getFechaInicio(), coche2.getFechaFin()));

                        parking.aparcarCoche(coche3);

                        parking.aparcarCoche(coche4);

                        System.out.println("Plazas ocupadas: " + parking.getPlazasActualesOcupadas());

                        System.out.println("La factura del coche " + coche5.getMaticula() + " es: " +
                                        +parking.sacarCoche(coche5, coche5.getFechaInicio(), coche5.getFechaFin()));

                } catch (Exception e) { // une todos los catch
                        System.out.println(e);
                }

        }
}
