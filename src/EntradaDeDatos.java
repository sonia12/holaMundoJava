import java.util.Scanner;

public class EntradaDeDatos {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        String nombre ;

        System.out.println("introduzca su nombre: ");
        nombre= entrada.nextLine(); // next guarda hasta que encuentre un espacio
        //nombre = entrada.nextLine().ChartA (); guarda un caracter solo el primero
        System.out.println(" su nombre es:" + nombre);

    }
}
