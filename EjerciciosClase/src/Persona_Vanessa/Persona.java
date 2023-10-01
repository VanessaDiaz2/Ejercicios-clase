package Persona_Vanessa;

public class Persona {
    
    private String nombre;
    private int edad;
    private String dni;
    private String sexo;
    private int peso;
    private int altura;

    private static String Hombre;
    private static String Mujer;
    private static final String LETRA = "TRWAGMYFPDXBNJZSQVHLCKE";

    public Persona() {
        nombre = "";
        sexo = Hombre;
        edad = 0;
        dni = "";
        peso = 0;
        altura = 0;
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String dni, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(int peso, int altura) {
        return peso / (int) Math.pow(altura, 2);
    }

    public boolean validarDni(String dni) {
        char letra;
        int parteNumerica;
        if (dni.length() == 9) {
            letra = dni.charAt(8);
            parteNumerica = parteNumerica = Integer.parseInt(dni.substring(0, 8));

            if (LETRA.indexOf(letra) == -1) {
                if (letra == LETRA.charAt(parteNumerica % 23)) {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
        return false;
    }

    public void generarDNI() {
        int cont = 0, num, parteNum;
        String numeros, primeraParte = "";
        char letra;

        while (cont != 8) {
            num = (int) (Math.random() * 10 + 0);
            numeros = String.valueOf(num);
            primeraParte += numeros;
            cont++;
        }

        parteNum = Integer.parseInt(primeraParte);
        letra = LETRA.charAt(parteNum % 23);

        dni = parteNum + String.valueOf(letra);

    }

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
                + ", altura=" + altura + "]";
    }

}
