import java.util.Scanner;

public class operadores {
    public static void main(String []args){


        Scanner entrada = new Scanner(System.in);
        float numero1, numero2, suma, resta, multiplicacion, division;

        System.out.println("introduzca 2 numeros flotantes");

        numero1 =entrada.nextFloat();
        numero2 =entrada.nextFloat();
        suma = numero1 + numero2;
        resta = numero2 - numero1;
        multiplicacion = numero1 * numero2;

        //numero = numero+ 5;  => numero  += 5;  (es lo mismo)

        System.out.println(" los numeros son: " + numero1 +" and " + numero2);
        System.out.println(" la suma es: " + suma);
        System.out.println(" la resta es: " + resta);
        System.out.println(" la multiplicacion es: " + multiplicacion);




    }
}
