import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        String nombre,apellido,nombreCompleto;
        Scanner leer=new Scanner(System.in);
        System.out.println("Dijite su nombre por favor ");
        nombre=leer.next();
        System.out.println("Dijite su apellido por favor ");
        apellido=leer.next();
        int longitud=nombre.length();
        System.out.println(" La longitud de su nombre es "+longitud  );
        int longitudA=apellido.length();
        System.out.println(" La longitud de su apellido es "+longitudA  );
        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toLowerCase());
        nombreCompleto=nombre+ " " +apellido;
        System.out.println(nombreCompleto);
        String subnombre=nombre.substring(0,2);
        System.out.println(subnombre+apellido);

        leer.close();
    }
    
}
