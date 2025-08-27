
import java.util.Scanner;


/**
  2. En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
     en lo siguiente:
  • Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
    compran de cinco a 10 y de U$50 si se compran más de 10.

  • Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
    que compra y la que tiene que pagar por el total de la compra.
 
 * @author tomas ardila gonzalez u20251235126
 */
public class serviteca {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int numLlanta, totalPagar, valorLlanta;
        System.out.println("cuantas llantas desea llevar");
        numLlanta=in.nextInt();
        if (numLlanta < 5 && numLlanta > 0 ){
        
            valorLlanta=100;
            System.out.println("el valor de la llanta es de: "+valorLlanta);
            
            totalPagar= valorLlanta*numLlanta;
            System.out.println("el total a pagar es de: "+totalPagar);
        
        }else if (numLlanta >= 5 && numLlanta <= 10){
        
        valorLlanta=75;
            System.out.println("el valor de la llanta es de: "+valorLlanta);
            
            totalPagar= valorLlanta*numLlanta;
            System.out.println("el total a pagar es de: "+totalPagar);
        
        }else if (numLlanta > 10){
        
        valorLlanta=50;
            System.out.println("el valor de la llanta es de: "+valorLlanta);
            
            totalPagar= valorLlanta*numLlanta;
            System.out.println("el total a pagar es de: "+totalPagar);
        
        }else {
        
            System.out.println("porfavor digite un numero valido de llantas");
        
        }
    }
        

}

