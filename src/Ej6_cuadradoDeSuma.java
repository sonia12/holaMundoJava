import java.util.Scanner;

public class Ej6_cuadradoDeSuma {
    public static void main (String []args){

        double a, b, cuadradoSuma;
        double c = 2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("introduzca un valor para a: ");
        a= entrada.nextDouble();

        System.out.println("introduzca un valor para b:");
        b=entrada.nextDouble();

        cuadradoSuma=Math.pow(a,c) + Math.pow(b,c) +(2*(a*b));
        System.out.println("El cuadrado de la suma es: " + cuadradoSuma);


    }
}
