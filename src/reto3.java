import java.util.Random;
import java.util.Scanner;
public class reto3 {
    public static void main(String[] args) {
        int juego,jugador;
        Scanner leer=new Scanner(System.in);
        Random aleatorio=new Random();
        juego= (int)(aleatorio.nextDouble()*2+1);
        System.out.println(" Elige 1 para cara o 2 para sello ");
        jugador=leer.nextInt();
        if (jugador==juego){
            System.out.println(" Ganaste Elejiste " +jugador+ " Felicitaciones ");
         }
        else if(jugador!=juego){
            System.out.println("Perdiste " +jugador+ " Sigue intentando ");
         }
         else{
            System.out.println(" Elige depende la seguencia ");
         }
        leer.close();
    }
    
}
