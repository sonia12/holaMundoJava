import javax.swing.*;

public class cantidadPagarCompra {
    public static void main(String[]args){
        double cantPagar, totalPAgado;

        cantPagar= Double.parseDouble(JOptionPane.showInputDialog("cuanto pago?"));

        if(cantPagar>300){
            totalPAgado = cantPagar-(20.0/100);


            JOptionPane.showMessageDialog(null,"su compra es de " + totalPAgado + "conun descuento del 20 % ");
        }else {
            JOptionPane.showMessageDialog(null, "su compra es menor a 300 usted no tiene descuento");
        }

    }
}
