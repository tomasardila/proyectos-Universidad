
import java.util.Scanner;


/**
 *   5. El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
        año. La manera de planificarlas depende de lo siguiente:
        Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
        que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
        préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
        un saldo superior a los U$20.000 no pedirá ningún préstamo.
  Posteriormente repartirá su presupuesto de la siguiente manera:
  • U$5.000 para equipo de computo
  • U$2.000 para mobiliario
  • El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
     Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
     en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.
 * 
 * 
 * 
 * @author tomas ardila gonzalez  u20251235126
 */
public class empresaFinanciera {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        
       int valorCompu, valorMobili;
       double capital;
    
        System.out.println("cuanta capital posee");
        capital=in.nextDouble();
        
        valorCompu=5000;
        valorMobili=2000;
        
        if (capital<0){
        
            System.out.println("pedir al banco un prestamo de 10.000");
            capital=10000;
           
            capital=capital-valorCompu-valorMobili;
            System.out.println("para equipo de computo se le daran: "+valorCompu);
            System.out.println("para la mobiliaria se le daran: "+valorMobili);
            
            capital=capital/2;
            System.out.println("para la compra de insumos seran: "+capital);
            System.out.println("para los incentivos al personal seran: "+capital);
        
        }else if (capital>0){
        
            System.out.println("pedir al banco un prestamo de 20.000");
            capital=20000;
           
            capital=capital-valorCompu-valorMobili;
            System.out.println("para equipo de computo se le daran: "+valorCompu);
            System.out.println("para la mobiliaria se le daran: "+valorMobili);
            
            capital=capital/2;
            System.out.println("para la compra de insumos seran: "+capital);
            System.out.println("para los incentivos al personal seran: "+capital); 
            
        }else if (capital>20000){
        
            System.out.println("no se necesita pedir un prestamo al banco");
           
            capital=capital-valorCompu-valorMobili;
            System.out.println("para equipo de computo se le daran: "+valorCompu);
            System.out.println("para la mobiliaria se le daran: "+valorMobili);
            
            capital=capital/2;
            System.out.println("para la compra de insumos seran: "+capital);
            System.out.println("para los incentivos al personal seran: "+capital); 
            
        }else {
            System.out.println("a ocurrido un error");
        }        
    }        
}
