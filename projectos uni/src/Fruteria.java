
import java.util.Scanner;



/**
 *  Una frutería ofrece las manzanas con descuento según la siguiente tabla:
    NUM. DE KILOS COMPRADOS % DESCUENTO
 0 - 2             0%
 2.01 -5           10%
 5.01 -10          15%
 10.01 en adelante 20%
 Determinar cuánto pagara una persona que compre manzanas es esa frutería.
 * 
 * 
 * @author tomas ardila gonzalez u20251235126
 */
public class Fruteria {
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        
        double kilosFru, valorManz, totalM;
        valorManz = 7;
        System.out.println("el kilo de manzana esta a 7 dollar cuantos va a llevar: ");
        kilosFru =in.nextDouble();
        
        totalM=valorManz*kilosFru;
        
        if(kilosFru<=2 && kilosFru>0){
        
            System.out.println("el total a pagar es de: "+totalM);
        
        }else if(kilosFru>=2.01 && kilosFru<=5){
        
            totalM=totalM-(totalM*0.1);
            System.out.println("el total a pagar es de: "+totalM);
          
        }else if(kilosFru>=5.01 && kilosFru<=10){
           
           totalM=totalM-(totalM*0.15); 
            System.out.println("el total a pagar es de: "+totalM);
        
        }else if(kilosFru>=10.01){
         
            totalM=totalM-(totalM*0.2); 
            System.out.println("el total a pagar es de: "+totalM);
         
        }else {
           
            System.out.println("porfavor digite un valor valido");
             
        }                        
    }        
}
