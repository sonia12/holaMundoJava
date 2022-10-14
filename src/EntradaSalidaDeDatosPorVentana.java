import javax.swing.*;

public class EntradaSalidaDeDatosPorVentana {
    public static void main(String [] arg){
        String cadena;
        int Entero;
        char letra;
        double decimal;
        cadena= JOptionPane.showInputDialog("Digite una cadena");

        Entero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entero"));

        letra = JOptionPane.showInputDialog("introduzca un caracter").charAt(0);

        decimal = Double.parseDouble(JOptionPane.showInputDialog("introduzca el decimal"));

        JOptionPane.showMessageDialog(null,"la cadena es:" + cadena);
        JOptionPane.showMessageDialog(null,"el entero es:" + Entero);
        JOptionPane.showMessageDialog(null,"la letra es:" + letra);
        JOptionPane.showMessageDialog(null,"el decimal es :" + decimal);


    }
}
