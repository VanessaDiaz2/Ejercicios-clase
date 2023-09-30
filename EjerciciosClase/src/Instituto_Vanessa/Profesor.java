package Instituto_Vanessa;

import java.util.Arrays;

public class Profesor extends Persona {

    /* Atributos */
    private String materia;

    /* Constructor */
    public Profesor(String paramNombre, int paramEdad, String paramAula, String paramMateria) throws Exception {
        super(paramNombre, paramEdad, paramAula);

        if (!Arrays.asList(ConstantesVanessa.materias).contains(paramMateria)) {
            throw new Exception();
        }

        this.materia = paramMateria;
    }

    /* Métodos */
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor [materia=" + materia + "] \n";
    }

}
