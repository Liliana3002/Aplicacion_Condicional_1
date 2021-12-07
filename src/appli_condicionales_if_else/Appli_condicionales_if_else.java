/*Condicionales o estructura condicional, la sentencia if, 
puede ser simple o doble*/
package appli_condicionales_if_else;

import javax.swing.JOptionPane;

public class Appli_condicionales_if_else {

    public static void main(String[] args) {
       int numero, dato = 5;
       
       numero = Integer.parseInt (JOptionPane.showInputDialog ("Digite un número: "));
       if (numero == dato) {
           JOptionPane.showMessageDialog (null, "El numero es 5");
     }
       else {
           JOptionPane.showMessageDialog(null, "El número es diferente de 5, el número digitado es:"+numero);
       }
    }
    
}
