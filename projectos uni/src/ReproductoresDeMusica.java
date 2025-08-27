
import java.util.Scanner;



/*
 *3. Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
  de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
  5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
  cualquiera por la compra de su aparato. El IVA es del 19%.
 
  @author tomas ardila gonzalez u20251235126

 */
public class ReproductoresDeMusica {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double valorRepro, iva;
        String marca;
        
        System.out.println("cuanto cuesta el reproductor de musica en dolares");
        valorRepro=in.nextDouble();
        in.nextLine();
       
        System.out.println("el reproductor de musica es marca soni si/no");
        marca=in.nextLine();
        
        iva=valorRepro*0.19;
        
        if (valorRepro>=500 && marca.equals("si")){
        
            System.out.println("el valor del producto es de: "+valorRepro);    
            valorRepro=valorRepro-(valorRepro*0.15);
            
            System.out.println("valor Iva: "+iva);
            valorRepro=valorRepro+iva;
            System.out.println("total a pagar: "+valorRepro);
        
        }else if(valorRepro>=500 && marca.equals("no")){
                 
            System.out.println("el valor del producto es de: "+valorRepro);    
            valorRepro=valorRepro-(valorRepro*0.10);
            
            System.out.println("valor Iva: "+iva);
            valorRepro=valorRepro+iva;
            System.out.println("total a pagar: "+valorRepro);
               
        }else if (valorRepro<500 && marca.equals("si")){
            
                    
            System.out.println("el valor del producto es de: "+valorRepro);    
            valorRepro=valorRepro-(valorRepro*0.5);
            
            System.out.println("valor Iva: "+iva);
            valorRepro=valorRepro+iva;
            System.out.println("total a pagar: "+valorRepro);
        
           }else if (valorRepro<500 && marca.equals("no")){
                   
            System.out.println("el valor del producto es de: "+valorRepro);    
            
            
            System.out.println("valor Iva: "+iva);
            valorRepro=valorRepro+iva;
            System.out.println("total a pagar: "+valorRepro);
        
           
         }else {
           
            System.out.println("profavor digite un valor valido");
         }
    }
    
}
