import java.util.Scanner;

public class Ej5_calificacionFinal {
    public static void main (String[]args){

        double participacion, PrimerEx, SegundoEx, FinalEx, calFinal;


        Scanner entrada =new Scanner(System.in);

        System.out.println("Introduzca notas");

        participacion =entrada.nextDouble();
        PrimerEx =entrada.nextDouble();
        SegundoEx = entrada.nextDouble();
        FinalEx =entrada.nextDouble();

        calFinal = ((participacion* (10.0/100))+ (PrimerEx *(25.0/100))+ (SegundoEx* (25.0/100)) + (FinalEx * (40.0/100))) ;

        System.out.println("calificacion final es: " + calFinal);


    }
}
