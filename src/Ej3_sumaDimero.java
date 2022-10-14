import java.util.Scanner;

public class Ej3_sumaDimero {

    public static void main(String[]args){

        double dguiller, dluis, djuan, totalDeLosTres;

        Scanner dinero = new Scanner(System.in);

        System.out.println("cuanto tiene guillermo?");

        dguiller= dinero.nextDouble();
        dluis = dguiller/2;
        djuan = (dguiller+dluis)/2;
        totalDeLosTres = dguiller+dluis+djuan;

        System.out.println("guillermo tiene "+ dguiller);
        System.out.println("Luis tiene " + dluis);
        System.out.println("Juan tiene "+ djuan);
        System.out.println("el total de los 3 es: " + totalDeLosTres);



    }
}
