package Ejercicio3.Ejecutable;

import javax.swing.JOptionPane;

public class Test 
{
    public static boolean main(String[] args) 
    {
        int x;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero deseado: "));

        if (x == 0 || x == 1 || x == 4)
        {
            JOptionPane.showMessageDialog(null, "El numero ingresado no es un numero primo ");
        }
    }
}
