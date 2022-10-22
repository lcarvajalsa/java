import java.util.Random;
import java.util.Scanner;
public class reto6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int subtotal=0;
        int bolita,producto=0,cantidad=0;
        String pregunta="si";
        do {
            System.out.println(" Bienvenido a supermercados Noé ");
            System.out.println("Ingrese el precio del producto");
            producto=leer.nextInt();
            System.out.println("Ingrese la cantidad del producto");
            cantidad=leer.nextInt();
            subtotal=producto*cantidad;
            leer.nextLine();
            if (subtotal>=0){
                System.out.println("Desea ingresar otro producto?");
                pregunta=leer.nextLine();
            }
        } while(pregunta.equals("si"));
        if (subtotal>=50000){
            System.out.println(" Tu compra supera los 50000 pesos colombianos ");
            System.out.println(" y te obsequiamos un descuento en el valor a pagar ");
            System.out.println(" Si sacas la bolita roja obtienes descuento del 10% ");
            System.out.println(" Si sacas la bolita azul obtienes descuento del 30% ");
            System.out.println(" Si sacas la bolita amarilla obtienes descuento del 50% ");
            System.out.println(" Si sacas la bolita blanca te llevas tu compra total mente Gratis ");
            Random dado=new Random();
            bolita= (int) (dado.nextDouble()*4+1);
                if (bolita==1){
                subtotal=subtotal-((subtotal*10)/100);
                System.out.println("sacaste la Roja");
                System.out.println("tu valor a pagar es "+subtotal);
                }
                else if (bolita==2){
                subtotal=subtotal-((subtotal*30)/100);
                System.out.println("sacaste la Azul");
                System.out.println(" tu valor a pagar es "+subtotal);
                }
                else if (bolita==3){
                subtotal=subtotal-((subtotal*50)/100);
                System.out.println("sacaste la Amarilla");
                System.out.println("tu valor a pagar es "+subtotal);
                }
                else {
                System.out.println("llevas tu compra gratis Ganaste....");
                }
        }
        else {
            System.out.println(" Su valor a pagar es "+subtotal+ " pesos colombianos ");
        }
        leer.close();
    }
}
