import java.util.Scanner;

public class Ej1_calImprimCalificaciones {
    public static void main(String [] args){

        double nota1, nota2, nota3, suma, promedio;

        Scanner cal1 = new Scanner(System.in);
        Scanner cal2 = new Scanner(System.in);
        Scanner cal3 = new Scanner(System.in);

        System.out.println( "Introduzca calificacion 1");
        nota1 = cal1.nextDouble();
        System.out.println("introduzca calificacion 2");
        nota2= cal2.nextDouble();
        System.out.println("Introduzca calificacion 3");
        nota3 =cal3.nextDouble();

        suma = nota1 + nota2 + nota3;
        promedio = suma /3;

        System.out.println("la suma de sus calificaciones es" + suma);

        System.out.println("el promedio es: " + promedio);


    }
}
