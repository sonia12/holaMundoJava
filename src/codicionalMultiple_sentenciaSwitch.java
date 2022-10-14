/*
* switch (dato){
*   case1: instruccion1;
*          break;
*   caso2: instruccion2;
*          break;
*   casen: instrucionn;
*           break;
*   default CasoContrario;
*           break;
*
* }
* */

import javax.swing.*;

public class codicionalMultiple_sentenciaSwitch {
    public static void main(String[]args){
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre 1- 5:"));

        switch (dato){

            case 1: JOptionPane.showMessageDialog(null," el numero es 1 ");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "el numero es 2");
                    break;
            case 3: JOptionPane.showMessageDialog(null," el numero es 3");
                break;
            case 4: JOptionPane.showMessageDialog(null, "el numero es 4");
                break;
            case 5: JOptionPane.showMessageDialog(null," el numero es 5 ");
                break;
            default: JOptionPane.showMessageDialog(null, "el numero no esta en el rango");


        }
    }
}
