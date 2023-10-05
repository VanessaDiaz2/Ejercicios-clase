package Electrodomésticos_Vanessa;

import java.util.ArrayList;
import java.util.Arrays;

public class ElectrodTest {
    
    /*super(marca,modelo,precio,color,pWatios,horasDía,díasAño,precioEnergía); */
    Nevera nevera1=new Nevera("Samsung","RS27T5200SR",
    1299.00,"negro",150,8,365,0.12,300,200,20);
    Televisor Televisor1=new Televisor();
    Nevera nevera2=new Nevera();
    Televisor Televisor2=new Televisor("sony","Bravia X900H",799.00,"Negro",90,5,365,0.12,50);
    ArrayList<Electrodomésticos> electrodomesticos=new ArrayList<>(
        Arrays.asList(nevera1,Televisor1,nevera2,Televisor2));

        public static double totalConsumo = 0;

        for(Electrodomésticos e: electrodomesticos){
            System.out.println("Electrodomestico: "+e.toString());
            System.out.println("Consumo Anual: " +e.consumoAnual());
            totalConsumo=e.consumoAnual();
        }

}
