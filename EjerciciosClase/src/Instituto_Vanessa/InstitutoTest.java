package Instituto_Vanessa;

import java.util.ArrayList;

public class InstitutoTest {

    public static void main(String[] args) {

        try {
            Profesor profesorCris = new Profesor("Cris", 31, "2.6", "Programación");
            Profesor profesorLeo = new Profesor("Leo", 30, "2.6", "Empresa");
            Profesor profesorIgnacio = new Profesor("Ignacio", 40, "2.6", "Inglés");

            ArrayList<Profesor> listaProfesor = new ArrayList<Profesor>();
            listaProfesor.add(profesorCris);
            listaProfesor.add(profesorLeo);
            listaProfesor.add(profesorIgnacio);

            Alumno alumnoGabriel = new Alumno("Gabriel", 22, "2.6", 8);
            Alumno alumnoNicole = new Alumno("Nicole", 28, "2.6", 10);
            Alumno alumnoLia = new Alumno("Lia", 25, "2.6", 5);
            Alumno alumnoPatricia = new Alumno("Patricia", 35, "2.6", 6);

            ArrayList<Alumno> listaAlumnosDosSeis = new ArrayList<Alumno>();
            listaAlumnosDosSeis.add(alumnoGabriel);
            listaAlumnosDosSeis.add(alumnoNicole);
            listaAlumnosDosSeis.add(alumnoLia);
            listaAlumnosDosSeis.add(alumnoPatricia);

            Aula aula26 = new Aula("2.6", listaProfesor, listaAlumnosDosSeis, 4);
            System.out.println("Aula2.6 incluye= " + aula26);

        } catch (Exception e) { // une todos los catch
            System.out.println("Error generico"+e);
        }

    }

}
