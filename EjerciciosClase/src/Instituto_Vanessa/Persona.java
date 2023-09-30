package Instituto_Vanessa;

import java.util.Arrays;
import java.lang.Exception;

public class Persona {

    /* atributos */
    protected String nombre;
    protected int edad;
    protected String aula;

    /* Constructor */
    public Persona(String paramNombre, int paramEdad, String paramAula) throws Exception {
        /* Validamos si el alumno está en la lista de alumnos */

        if (this instanceof Alumno) { // pregunta si donde estoy es de tipo alumno
            if (!Arrays.asList(ConstantesVanessa.alumnosDisponibles).contains(paramNombre)) {
                throw new Exception();
            }
        } else if (this instanceof Profesor) {
            if (!Arrays.asList(ConstantesVanessa.profesoresDisponibles).contains(paramNombre)) {
                throw new Exception();
            }
        }

        this.nombre = paramNombre;
        this.edad = paramEdad;
        this.aula = paramAula;
    }

    /* Métodos */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", aula=" + aula + "]";
    }

}

