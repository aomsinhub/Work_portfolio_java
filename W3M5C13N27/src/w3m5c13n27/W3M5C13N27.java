/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3m5c13n27;
    import java.util.Scanner;

public class W3M5C13N27 {

    
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        System.out.print("Fahrenheit = ");
        Double f = cc.nextDouble();
        Double c = (5.0/9.0)*(f-32.0);
        System.out.println("celsius = "+c);
    }
    
}
