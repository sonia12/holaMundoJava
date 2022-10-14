public class incrementDecremento {

    public static void main (String []args){

        int x = 5, y;
        x ++; // x+=1; incremento en 1
        x --; // decrementa en 1

        y = x++; // aqui primero a y le das el valor de x que es 5 luego incrementa x
        y =++x ; // aqui primero incrementa luego le asigna el valor

        System.out.println(x);
    }
}


