package Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CalculaMediaVanessa {

    public static void main(String[] args) {

    int mediaEdad=0;
    double mediaAltura=0;

    try (BufferedReader br = new BufferedReader(new FileReader(new File("jugadores.txt")))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.trim().split("\\s+");
                mediaEdad+=Integer.parseInt(partes[1]);
                mediaAltura+=Double.valueOf(partes[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Media edad: "+mediaEdad);
        System.out.println("Media altura: "+mediaAltura);

    }

}


