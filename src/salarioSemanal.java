import javax.swing.*;

public class salarioSemanal {
    public static void main(String[]args){

        double htrab1, salario1, salario2, htrab2, salariototal;

        htrab1 = Double.parseDouble(JOptionPane.showInputDialog("cuantas horas trabajo?"));

        if (htrab1 <=40){
            salario1= htrab1*16;
            JOptionPane.showMessageDialog(null,"su salario es: " + salario1);
        } else if (htrab1 > 40) {
            htrab2=htrab1 - 40;
            salario2= htrab2 *20;
            salariototal= (16*40) +salario2;
            JOptionPane.showMessageDialog(null, "su salario es" + salariototal);
        }
    }
}
