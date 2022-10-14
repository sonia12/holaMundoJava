import java.util.Scanner;

public class Ej4_companiaCarros {
    public static void main (String[]args){

        double salario = 1000;
        int cantVendido;
        double comision = 150;
        double precioCarro, salarioMensual;

        Scanner carrVendido =new Scanner(System.in);
        Scanner precioCarros = new Scanner(System.in);

        System.out.println("Cuantos carros vendio?");
        cantVendido = carrVendido.nextInt();

        System.out.println("A cuanto vendio los carros?");
        precioCarro= precioCarros.nextDouble();

        salarioMensual=salario + (comision* cantVendido) + (((precioCarro*5) /100)*cantVendido) ;

        System.out.println("Usted vendio " + cantVendido+ "carros.");
        System.out.println(" su salario mensual es: " + salarioMensual);




    }
}
