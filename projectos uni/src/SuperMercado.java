
import java.util.Scanner;

/**
 * 13. Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar
   de una canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo pero de
   otra canasta, los premios se dan bajo la siguiente tabla:
     HOMBRES MUJERES
    # Bolita Premio # bolita Premio
   1 Desodorante 1 Loción
   2 Six-Pack de cerveza 2 Bikini
   3 Camiseta 3 Crema para la cara
   4 Pantaloneta 4 Plancha para el cabello
   5 Sudadera 5 Esmalte de uñas
 * 
 *
 * @author tomas ardila gonzalez u20251235126
 */
public class SuperMercado {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       
       String sex;
       int numBolita;
       
        System.out.println("digite cual es su sexo:");
       sex= in.nextLine();
       
        System.out.println("cual es el numero de su bolita");
       numBolita= in.nextInt();
       
       if (sex.equals("hombre")){
           
           switch (numBolita){
               
               case 1:
                   System.out.println("su premio es un desodorante");
                break;
                
               case 2:
                   System.out.println("su premio es un six-pack");
                break;
               case 3:
                   System.out.println("su premio es una camiseta");
                break;
               case 4:
                   System.out.println("su premio es una pantaloneta");
                break;
               case 5:
                   System.out.println("su premio es una sudadera");
                break;
               default :
                   System.out.println("digite un valor valido");
                break;   
           }
           
       }else if (sex.equals("mujer")){
              switch (numBolita){
               
               case 1:
                   System.out.println("su premio es una locion");
                break;
                
               case 2:
                   System.out.println("su premio es un bikini");
                break;
               case 3:
                   System.out.println("su premio es una crema para la cara");
                break;
               case 4:
                   System.out.println("su premio es una plancha para el cabello");
                break;
               case 5:
                   System.out.println("su premio es un esmalte para uñas");
                break;
               default :
                   System.out.println("digite un valor valido");
                break;   
           }
             
       } else{System.out.println("digite un valor valido");}
    }
}
