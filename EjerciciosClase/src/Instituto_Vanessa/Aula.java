package Instituto_Vanessa;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Exception;

public class Aula {

    /* Atributos */
    private String nombre;
    private ArrayList<Profesor> profesoresAsignados;
    private ArrayList<Alumno> alumnosAsignados;
    private ArrayList<String> materiasImparten = new ArrayList<String>();
    private int numEstudiantes;

    /* Constructor */
    public Aula(String nombre, ArrayList<Profesor> profesoresAsignados, ArrayList<Alumno> alumnosAsignados,
            int paramNumEstudiantes)
            throws Exception {

        if (!Arrays.asList(ConstantesVanessa.AulasDisponibles).contains(nombre)) {
            throw new Exception();
        }

        if (paramNumEstudiantes > ConstantesVanessa.numeroEstudiantes) {
            throw new Exception();
        }

        for (int i = 0; i < profesoresAsignados.size(); i++) {
            materiasImparten.add(profesoresAsignados.get(i).getMateria());
        }

        this.nombre = nombre;
        this.profesoresAsignados = profesoresAsignados;
        this.alumnosAsignados = alumnosAsignados;
        this.numEstudiantes = paramNumEstudiantes;

    }

    /* Métodos */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEstudiantes() {
        return numEstudiantes;
    }

    public void setNumEstudiantes(int numEstudiantes) {
        this.numEstudiantes = numEstudiantes;
    }

    public void ordenarAlumnosPorEdad() {
        Collections.sort(alumnosAsignados, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return Integer.compare(a1.getEdad(), a2.getEdad());
            }
        });
    }

    public void ordenarProfesoresPorEdad() {
        Collections.sort(profesoresAsignados, new Comparator<Profesor>() {
            @Override
            public int compare(Profesor a1, Profesor a2) {
                return Integer.compare(a1.getEdad(), a2.getEdad());
            }
        });
    }

    @Override
    public String toString() {
        ordenarAlumnosPorEdad();
        ordenarProfesoresPorEdad();
        return "Aula [nombre=" + nombre + ", profesoresAsignados=" + profesoresAsignados + ", alumnosAsignados="
                + alumnosAsignados + ", materiasImparten=" + materiasImparten + ", numEstudiantes="
                + numEstudiantes + "]";
    }

}
