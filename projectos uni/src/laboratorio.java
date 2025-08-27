
import java.util.Scanner;


/**
 *   
 *   6. Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, un médico
determina si una persona tiene anemia o no, lo cual depende de su nivel de hemoglobina en la
sangre, de su edad y de su sexo. Si el nivel de hemoglobina que tiene una persona es menor
que el rango que le corresponde, se determina su resultado como positivo y en caso contrario
como negativo. La tabla en la que el medico se basa para obtener el resultado es la siguiente:

 EDAD NIVEL HEMOGLOBINA
  0 - 1 mes 13 - 26 g%
  > 1 y < = 6 meses 10 - 18 g%
  > 6 y < = 12 meses 11 - 15 g%
  > 1 y < = 5 años 11.5 - 15 g%
  > 5 y < = 10 años 12.6 - 15.5 g%
  > 10 y < = 15 años 13 - 15.5 g%
   Mujeres > 15 años 12 - 16 g%
   Hombres > 15 años 14 - 18 g%
 * 
 * 
 * 
 * 
 * @author garu
 */
public class laboratorio {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int edad;
        double hemoglobina;
        String sex , tiemp;
        
        System.out.println("escriba su edad (primero el numero y despues especifique si son años o meses)");
        edad=in.nextInt();
        in.nextLine();
        tiemp=in.nextLine();
        
        System.out.println("cual es su sexo hombre/mujer");
        sex=in.nextLine();
        
        System.out.println("cual es el nivel de hemoglobina");
        hemoglobina=in.nextDouble();
        
        if (edad > 1 && edad <= 6 && tiemp.equals("meses")) {

            if (hemoglobina >= 10) {

                System.out.println("negativo para anemia");
            } else {
                System.out.println("positivo para anemia");
            }

        } else if (edad > 6 && edad <= 12 && tiemp.equals("meses")) {

            if (hemoglobina >= 11) {

                System.out.println("negativo para anemia");
            } else {
                System.out.println("positivo para anemia");
            }

        }else if (edad >= 1 && edad <= 5 && tiemp.equals("años")) {

            if (hemoglobina >= 11.5) {

                System.out.println("negativo para anemia");
            } else {
                System.out.println("positivo para anemia");
            }

        }else if (edad > 5 && edad <= 10 && tiemp.equals("años")){
           
          if(hemoglobina >= 12.6)  {
          
              System.out.println("negativo para anemia");
          }else {
              System.out.println("positivo para anemia");
          }
          
        }else if (edad > 10 && edad <= 15 && tiemp.equals("años")){
           
          if(hemoglobina >= 13)  {
          
              System.out.println("negativo para anemia");
          }else {
              System.out.println("positivo para anemia");
          }
          
        }else if (edad > 15 && sex.equals("mujer") && tiemp.equals("años")){
           
          if(hemoglobina >= 12)  {
          
              System.out.println("negativo para anemia");
          }else {
              System.out.println("positivo para anemia");
          }
          
        }else if (edad > 15 && sex.equals("hombre") && tiemp.equals("años")){
           
          if(hemoglobina >= 14)  {
          
              System.out.println("negativo para anemia");
          }else {
              System.out.println("positivo para anemia");
          }
          
        }else {System.out.println("digite valores validos");}
    }
}
