import javax.swing.*;

//condicionla simple if
//condicional doble if else
    /*if(condicion){
      instruccion
    }*/
public class condicionales_sentenciaIf {
    public static void main (String [] args){
        int numero, dato =5;

        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if(numero  == dato){
            JOptionPane.showMessageDialog(null,"el numero es 5");

        }else{
            JOptionPane.showMessageDialog(null,"el numero es diferente de 5");
        }
    }
//== igualdad , != desigualdad >= mayor o igual --> operadores
}
