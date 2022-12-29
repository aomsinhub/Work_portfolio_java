/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;
import java.util.Scanner;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter You Name : ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Enter You Age : ");
        Integer age = scan.nextInt();
        System.out.println("Enter You Classroom : ");
        String cr = scan.next();
        System.out.println("Enter You School : ");
        String sch = scan.next();
        //สอง
        System.out.printf("\nHello my name is : %s",name);
        System.out.printf("\nI'm : %d years old",age);
        System.out.printf("\nMy class room : %s",cr);
        System.out.printf("\nMy school : %s",sch);
    }
    
}
