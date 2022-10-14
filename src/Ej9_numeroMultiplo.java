import javax.swing.*;

public class Ej9_numeroMultiplo {
    public static void main(String[]args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("introducir un numero entero"));
        if(numero%10==0){
            JOptionPane.showMessageDialog(null,"el numero" + numero + " es multiplo de 10");

        }else {
            JOptionPane.showMessageDialog(null,"no es multiplo de 10");
        }

    }
}
