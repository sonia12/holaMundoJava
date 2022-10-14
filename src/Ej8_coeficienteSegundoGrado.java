import java.util.Scanner;

public class Ej8_coeficienteSegundoGrado {
    public static void main(String []args){
        double a,b,c,x;

        Scanner entrada=new Scanner(System.in);

        System.out.println("introducir a, b,c");
        a= entrada.nextDouble();
        b= entrada.nextDouble();
        c= entrada.nextDouble();

        x= (-b+ Math.sqrt((Math.pow(b,2))-4*a*c))/(2*a);
        System.out.println(x);
    }
}
