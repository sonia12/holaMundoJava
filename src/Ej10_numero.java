import javax.swing.*;

public class Ej10_numero {
    public static void main(String[] args){
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introducir numero 2"));
        if (numero1>numero2){
            JOptionPane.showMessageDialog(null,"el numero " + numero1 + "es mayor");
        }
        else if(numero2>numero1){
            JOptionPane.showMessageDialog(null,"el numero " + numero2 + "es mayor");


        }else {
            JOptionPane.showMessageDialog(null,"el numero " + numero1 + "y" + numero2+ "son iguales");
        }




    }
}
