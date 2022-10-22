import java.util.Scanner;
public class reto1{
    public static void main(String[] args) {
        Double gradosC, gradosf;
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la temperatura en grados fahrenheit que desea poner en su horno ");
        gradosf=leer.nextDouble();
        gradosC= (gradosf-32)/1.8;
        System.out.println("los grados centigrados para la receta son " +gradosC);
        leer.close();
    }
}