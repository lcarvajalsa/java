import java.util.Scanner;
public class reto2 {
    public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      double pesoBebe,mesesBebe, dosisVacuna;
      System.out.println("Ingrese el peso en libras del bebe ");
      pesoBebe=leer.nextDouble();
      System.out.println("Ingrese la edad en meses del bebe ");
      mesesBebe=leer.nextDouble();
      dosisVacuna= ((pesoBebe+10)/(mesesBebe*10))*8;
      System.out.println("La dosis a aplicar son" +dosisVacuna+ "mililitros o mL");
      leer.close(); 
  } 
 }

    
