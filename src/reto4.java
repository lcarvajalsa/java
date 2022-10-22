import java.util.Random;
import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
        int numero,eleccion;
        Scanner leer=new Scanner(System.in); 
        Random dado=new Random();
        numero= (int) (dado.nextDouble()*3+1);
        System.out.println(" Digite 1 para piedra y 2 para papel o 3 para tijera ");
        eleccion=leer.nextInt();
        if (numero==1 && eleccion==1){
            System.out.println(" Salio Piedra, usted eliguio piedra sigue participando....");
        }
        else if (numero==1 && eleccion== 2){
            System.out.println(" Salio Piedra, usted eliguio papel Ganaste....");
        }
        else if(numero==1 && eleccion ==3 ){
            System.out.println(" Salio piedra, usted eliguio tijera Perdiste....");
        }
        else if(numero==2 && eleccion==1){
            System.out.println(" Salio papel, usted eliguio piedra perdiste....");
        }
        else if(numero==2 && eleccion==2){
            System.out.println(" Salio papel, usted eliguio papel sigue participando....");
        }
        else if(numero==2 && eleccion==3){
            System.out.println(" Salio papel, usted eliguio tijera Ganaste....");
        }
        else if(numero==3 && eleccion==1){
            System.out.println(" Salio tijera, usted eliguio piedra Perdiaste....");
        }
        else if(numero==3 && eleccion==2){
            System.out.println(" Salio tijera, usted eliguio papel perdiste....");
        }
        else if(numero==3 && eleccion==3){
            System.out.println(" Salio tijera, usted eliguio tijera sigue participando....");
        }
        else{
            System.out.println(" Elige depende la seguencia ");
        }
        leer.close();
    }
    
}
