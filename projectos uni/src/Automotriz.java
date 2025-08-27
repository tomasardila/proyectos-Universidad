
import java.util.Scanner;


/**
 *14. Una empresa automotriz necesita un sistema para seleccionar el tipo de carro (auto, SUV o
   camioneta) lo cual debe de aparecer en un menú, y el color (negro, blanco o rojo) en otro menú.
   Al final se necesita que despliegue la selección realizada. Nota. Debe de anidarse una estructura
   de selección múltiple dentro de otra.
 * 
 * @author tomas ardila gonzalez u20251235126
 */
public class Automotriz {
    public static void main(String[] args) {
        int auto, color;
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("tipos de carro: ");
        System.out.println("1.  auto");
        System.out.println("2.  SUV");
        System.out.println("3.  camioneta");
        System.out.println("");
        System.out.println("escoja el numero del tipo de auto que quiere");
        
        auto=in.nextInt();
        
        switch (auto){
            
            case 1:
        System.out.println("colores del auto:");
        System.out.println("1.  negro");
        System.out.println("2.  blanco");
        System.out.println("3.  rojo");
        System.out.println("");
        System.out.println("escoja el numero del color que quiere");

        color=in.nextInt();
        
         switch (color){
             case 1: 
                 System.out.println("usted a seleccionado el tipo de carro auto y el color negro");
             break;
             case 2:
                 System.out.println("usted a seleccionado el tipo de carro auto y el color blanco");
             break;
             case 3: 
                 System.out.println("usted a seleccionado el tipo de carro auto y el color rojo");
             break;
             default:
                 System.out.println("seleccione un valor valido");
             break;    
         }
        
        break;
            case 2:
                                        System.out.println("colores del auto:");
        System.out.println("1.  negro");
        System.out.println("2.  blanco");
        System.out.println("3.  rojo");
        System.out.println("");
        System.out.println("escoja el numero del color que quiere");

        color=in.nextInt();
        
         switch (color){
             case 1: 
                 System.out.println("usted a seleccionado el tipo de carro SUV y el color negro");
             break;
             case 2:
                 System.out.println("usted a seleccionado el tipo de carro SUV y el color blanco");
             break;
             case 3: 
                 System.out.println("usted a seleccionado el tipo de carro SUV y el color rojo");
             break;
             default:
                 System.out.println("seleccione un valor valido");
             break;    
           }
         break;
            case 3:
                                        System.out.println("colores del auto:");
        System.out.println("1.  negro");
        System.out.println("2.  blanco");
        System.out.println("3.  rojo");
        System.out.println("");
        System.out.println("escoja el numero del color que quiere");
 
        color=in.nextInt();
        
         switch (color){
             case 1: 
                 System.out.println("usted a seleccionado el tipo de carro camioneta y el color negro");
             break;
             case 2:
                 System.out.println("usted a seleccionado el tipo de carro camioneta y el color blanco");
             break;
             case 3: 
                 System.out.println("usted a seleccionado el tipo de carro camioneta y el color rojo");
             break;
             default:
                 System.out.println("seleccione un valor valido");
             break;    
         }
            break;
            default : System.out.println("seleccione un valor valido");
            break;
        }

    }
    
}
