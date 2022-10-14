import java.util.Scanner;

public class Ej7_numeroSemana {
    public static void main (String[]args){

        double horas, semana, dias, decisemanas, decidias, hrs;
        int part, partdias;
        Scanner entrada = new Scanner(System.in);

        System.out.println("introducir total de horas");
        horas = entrada.nextDouble();

        semana = (horas/(24*7));
        part = (int) semana;
        decisemanas =semana-part;
        dias= decisemanas*7;

        partdias= (int)dias;
        decidias=dias-partdias;

        hrs = decidias * 24;

        System.out.println(part + "semanas");
        System.out.println(partdias + "dias");
        System.out.println(hrs + "horas");









    }
}
