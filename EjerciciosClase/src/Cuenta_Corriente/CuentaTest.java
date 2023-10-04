package Cuenta_Corriente;

public class CuentaTest {
    public static void transferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, double importe) {
        try {
            if(cuentaOrigen.retirarDinero(importe)){
                if(cuentaDestino.ingresarDinero(importe)){
                    System.out.println("Transferencia exitosa");
                }
            }else{
                System.out.println("No se logro realizar la tranferencia");            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("12345678P", "Pedro", 12345678, 3060);
        
        Cuenta cuenta2 = new Cuenta("87654321P", "Marta", 87654321, 10000);
        
            
            //1-Probamos el método ingresar dinero
            System.out.println("Ingresamos dinero a la cuenta1");
            try {
                 //ingresamos dinero en la cuenta1
                cuenta1.ingresarDinero(5000);
                //ingresamos más dinero y comprobamos si permite 
                //hacer el ingreso a pesar de superar el importe máximo
                cuenta1.ingresarDinero(4000);

            } catch (Exception e) {
                System.out.println(e);
                //e.printStackTrace();
            } 

            System.out.println("\n");
            
            System.out.println("Retiramos dinero a la cuenta2");
            //2-Probamos el método retirar dinero
            try {
                 //ingresamos dinero en la cuenta1
                cuenta2.retirarDinero(500);
                //ingresamos más dinero y comprobamos si lo permite 
                cuenta2.retirarDinero(2000);

            } catch (Exception e) {
                System.out.println(e);
                //e.printStackTrace();
            } 
            
            System.out.println("\n");

            System.out.println("Saldos antes de la transferencia");
            System.out.println("Saldo cuenta1: "+cuenta1.getSaldo());
            System.out.println("Saldo cuenta2: "+cuenta2.getSaldo());


            System.out.println("Realizamos una Transferencia");
            transferencia(cuenta2,cuenta1,50);

            

            System.out.println("Saldos después de la transferencia");
            System.out.println("Saldo cuenta1: "+cuenta1.getSaldo());
            System.out.println("Saldo cuenta2: "+cuenta2.getSaldo());

         //System.out.println("Saldo actual:" + cuenta1.ingresarDinero(6001));
         // System.out.println("Saldo actual:" + cuenta2.sacarDinero(30000));
         //cuenta2.cambioTitular("Manuela", "12345678P");
         //System.out.println(cuenta2);
         
         //System.out.println("Saldo actual:" + cuenta1.ingresarDineroUno(40));
         //System.out.println("Saldo actual:" + cuenta2.sacarDinero(30000));
         //transferencia(cuenta1, cuenta2, 40);
        
            System.out.println("\n");
            
        System.out.println("Agregamos número IBAN a la cuenta1 y validamos");
        cuenta1.setNumCuentaIBAN("ES1301829982580201650178");
        //cuenta2.setNumCuentaIBAN("ES1330580544150634144361");

        if (cuenta1.validarCuentaBancaria(cuenta1.getNumCuentaIBAN())) {
            System.out.print("La cuanta es válida");
        } else {
            System.out.print("La cuenta no es válida");
        }

        

    }
}
