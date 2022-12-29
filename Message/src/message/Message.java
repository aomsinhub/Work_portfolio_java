/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package message;

/**
 *
 * @author a
 */
import javax.swing.JOptionPane;
public class Message {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Enter Your Name");
        String age=JOptionPane.showInputDialog("Enter Your Age");
        String cr=JOptionPane.showInputDialog("Enter Your Classroom");
        String sh=JOptionPane.showInputDialog("Enter Your School");
        
        JOptionPane.showMessageDialog(null,"Hello my name is : "+name+"\nI'm : "+age+"years old\nMy Classroom : "+cr+"\nMy School : "+sh);
    }
    
}
