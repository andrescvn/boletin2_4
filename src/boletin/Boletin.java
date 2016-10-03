/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1;
        float num2;
        num1=Float.parseFloat(JOptionPane.showInputDialog("num1"));
        num2=Float.parseFloat(JOptionPane.showInputDialog("num2"));
        float suma = num1+num2;
        float resta = num1-num2;
        float producto = num1*num2;
        float cociente = num1/num2;
       JOptionPane.showMessageDialog(null, "suma ="+ suma);
       JOptionPane.showMessageDialog(null, "resta ="+ resta);
       JOptionPane.showMessageDialog(null, "producto ="+ producto);
       JOptionPane.showMessageDialog(null, "cociente ="+ cociente);
         
             
        
    }
    
}
