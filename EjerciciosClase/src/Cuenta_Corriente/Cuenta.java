package Cuenta_Corriente;

import java.time.LocalDateTime;

public class Cuenta {
 
    private String dni;
    private String nombre;
    private tipoCuenta tipoCuenta;
    private int numCuenta;
    private String numCuentaIBAN;
    private double saldo;
    private static double importeMaximoRetirar = 3000;
    private static double importeMaximoIngresar = 6000;
    private LocalDateTime fechaIngresoHoy;
    private double dImporteIngresoHoy;
    private LocalDateTime fechaRetirarHoy;
    private double dImporteRetirarHoy;
    private static int contador = 0;

    public boolean ingresarDinero(double paramdCant) throws Exception {
        boolean bRes = false;
        if (puedoIngresarMasHoy(paramdCant)) {
            this.dImporteIngresoHoy += paramdCant;
            this.saldo += paramdCant;
            bRes = true;
        } else {
            throw new Exception("Superado el importe máximo a ingresar");
        }
        
        if(bRes){
            System.out.println("Ingreso exitoso");
            return true;
        }else{
            System.out.println("No se puede realizar el ingreso");
            return false;
        }

        
    }

    private boolean puedoIngresarMasHoy(double paramdCant) {
        boolean bRes = false;
        // si hoy todavía no ha habido ningún ingreso
        if (this.dImporteIngresoHoy == 0) {
            // ponemos la fecha de ingreso a hoy
            this.fechaIngresoHoy = LocalDateTime.now();
            if (paramdCant < importeMaximoIngresar) {
                bRes = true;
            }
        } // si ya ha habido más ingresos
        else {
            // sigo en el mismo día
            LocalDateTime fechaIngresoActual = LocalDateTime.now();
            if (this.fechaIngresoHoy.getDayOfYear() == fechaIngresoActual.getDayOfYear()) {
                // si lo acumulado + lo nuevo a ingresar no supera el max ingreso
                if ((this.dImporteIngresoHoy + paramdCant) < importeMaximoIngresar) {
                    bRes = true;
                }

            } else {
                // nuevo día entonces --> inicializar fecha importe
                this.fechaIngresoHoy = LocalDateTime.now();
                dImporteIngresoHoy = 0;
                if (paramdCant < importeMaximoIngresar) {
                    bRes = true;
                }
            }
        }

        // ahora ya compruebo los importes

        return bRes;

    }

    public boolean retirarDinero(double paramdCant) throws Exception {
        boolean bRes = false;
        if(this.saldo > paramdCant){
            if (puedoRetirarMasHoy(paramdCant)) {
                this.dImporteRetirarHoy += paramdCant;
                this.saldo -= paramdCant;
                bRes = true;
            } else {
                throw new Exception("Superado el importe máximo a retirar");
            }
            
            if(bRes){
                System.out.println("Ingreso exitoso");
                return true;
            }else{
                System.out.println("No se puede realizar el ingreso");
                return false;
            }
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
        
    }

    private boolean puedoRetirarMasHoy(double paramdCant) {
        boolean bRes = false;
        // si hoy todavía no ha habido ningún retiro
        if (this.dImporteRetirarHoy == 0) {
            // ponemos la fecha de retiro a hoy
            this.fechaRetirarHoy = LocalDateTime.now();
            if ((paramdCant < importeMaximoRetirar) && (paramdCant < this.saldo)){
                bRes = true;
            }
        } // si ya ha habido más retiros
        else {
            // sigo en el mismo día
            LocalDateTime fechaRetiroActual = LocalDateTime.now();
            if (this.fechaRetirarHoy.getDayOfYear() == fechaRetiroActual.getDayOfYear()) {
                // si lo acumulado + lo nuevo a retirar no supera el max retiro
                if ((this.dImporteRetirarHoy + paramdCant) < importeMaximoRetirar) {
                    bRes = true;
                }

            } else {
                // nuevo día entonces --> inicializar fecha importe
                this.fechaRetirarHoy = LocalDateTime.now();
                dImporteRetirarHoy = 0;
                if (paramdCant < importeMaximoRetirar) {
                    bRes = true;
                }
            }
        }

        // ahora ya compruebo los importes

        return bRes;

    }

    public Cuenta(String dni, String nombre, int numCuenta, double saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fechaIngresoHoy = null;
        this.dImporteIngresoHoy = 0;
        this.fechaRetirarHoy = null;
        this.dImporteRetirarHoy = 0;
    }

    public Cuenta(int numCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.fechaIngresoHoy = null;
        this.dImporteIngresoHoy = 0;
        this.fechaRetirarHoy = null;
        this.dImporteRetirarHoy = 0;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNumCuentaIBAN() {
        return numCuentaIBAN;
    }

    public void setNumCuentaIBAN(String numCuentaIBAN) {
        this.numCuentaIBAN = numCuentaIBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [dni=" + dni + ", nombre=" + nombre + ", numCuenta=" + numCuenta + ", saldo=" + saldo
                + ", importeMaximoRetirar=" + importeMaximoRetirar + ", importeMaximoIngresar=" + importeMaximoIngresar
                + "]";
    }

    public void cambioTitular(String nuevoNombre, String dni) {
        this.nombre = "nuevoNombre";
        this.dni = dni;
        System.out.println(" La operación se ha realizado de manera correcta.");
    }

    public static int validarIban(String numero) {

        if (contador == 0) {
            numero = "00" + numero;
            contador++;
        }

        int[] num = { 1, 2, 4, 8, 5, 10, 9, 7, 3, 6 };

        char iban[] = new char[10];
        int resultado = 0;
        numero.getChars(0, 10, iban, 0);

        for (int i = 0; i < 10; i++) {
            int valor = Character.getNumericValue(iban[i]);
            resultado += valor * num[i];
        }

        int totalFinal = 11 - (resultado % 11);
        if (totalFinal == 10) {
            return 1;
            /*
             * String primerNum = String.valueOf(totalFinal); // pasar de int a String
             * primerNum = primerNum.substring(0, 1);
             * totalFinal = Integer.parseInt(primerNum); // pasar de String a int
             * return totalFinal;
             */
        } else {
            return totalFinal;
        }
    }

    public static boolean validarCuentaBancaria(String numeroCuenta) {
        String letras, numeros, primera, segunda, valor1, valor2, comparar = "";

        if (numeroCuenta.length() == 24) {
            letras = numeroCuenta.substring(0, 2);
            numeros = numeroCuenta.substring(2);

            if (letras.matches(".*[a-zA-Z].*") && numeros.matches(".*[0-9].*")) {
                if (letras.equals("ES")) {

                    primera = numeroCuenta.substring(4, 12);
                    int num1 = validarIban(primera);
                    segunda = numeroCuenta.substring(14);
                    int num2 = validarIban(segunda);

                    valor1 = Integer.toString(num1);
                    valor2 = Integer.toString(num2);
                    
                    comparar = valor1 + valor2;

                    String digitoControl = numeroCuenta.substring(12, 14);

                    if (comparar.equals(digitoControl)) {
                        return true;
                    } else {
                        return false;
                    }

                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
    
}
