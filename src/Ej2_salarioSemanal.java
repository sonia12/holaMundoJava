import java.util.Scanner;

public class Ej2_salarioSemanal {
    public static void main(String[] args){
        double htrab, salarioH, salarioSemanal;

        Scanner horas = new Scanner(System.in);
        Scanner costo = new Scanner(System.in);

        System.out.println("Introducir horas de trabajo semanal");
        htrab =horas.nextDouble();
        System.out.println("Introducir salario por hora");
        salarioH= costo.nextDouble();

        salarioSemanal= htrab*salarioH;

        System.out.println("su salario semanal es:" + salarioSemanal);
    }
}
