import javax.swing.*;

public class Ej11_caracterSaberSiEsMAyuscula {

    public static void main(String []args){
        char caracter;
        caracter =JOptionPane.showInputDialog("Introducir un caracter").charAt(0);

        if(Character.isUpperCase (caracter)){
            JOptionPane.showMessageDialog(null, "es mayuscula");

        } else{
            JOptionPane.showMessageDialog(null, "no es mayuscula");
        }

    }
}
