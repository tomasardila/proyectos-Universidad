
import java.util.Scanner;

/*1. En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.

  @author tomas ardila gonzalez u20251235126
 */
public class TiendaDeComputadoras {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
       double valorCompu, totalCompu;
       int numCompu;

       valorCompu=500; 
       
        System.out.println("las computadora vale U$500, cuantas compuradoras va a llevar");
        numCompu=in.nextInt();
        
       totalCompu= valorCompu*numCompu;

        if (numCompu<5 && numCompu > 0 ){
            
            System.out.println("el valor de la compra es de: "+totalCompu);
            totalCompu=totalCompu-(totalCompu*0.10);
            System.out.println("su total a pagar es de: "+totalCompu);
        
        }else if (numCompu>=5 && numCompu < 10){
        
        System.out.println("el valor de la compra es de: "+totalCompu);
            totalCompu=totalCompu-(totalCompu*0.20);
            System.out.println("su total a pagar es de: "+totalCompu);
        
        }else if (numCompu >= 10){
        
            System.out.println("el valor de la compra es de: "+totalCompu);
            totalCompu=totalCompu-(totalCompu*0.40);
            System.out.println("su total a pagar es de: "+totalCompu);
        
        }else {
        
            System.out.println("porfavor digite un numero valido");
        
           }
    }
}
