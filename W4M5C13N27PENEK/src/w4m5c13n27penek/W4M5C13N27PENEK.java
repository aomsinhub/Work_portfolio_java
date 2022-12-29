/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4m5c13n27penek;

import java.util.Scanner;
public class W4M5C13N27PENEK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("ใส่ปี พ.ศ. เกิด: ");
        int n = scan.nextInt();


        if(n>=2539){
          System.out.printf("ผู้ที่เกิดปีพ.ศ.%d%s", n ," จัดอยู่ในกลุ่ม Generation Z\n\n\n");
        }else if(n>=2520 && n<=2538){
          System.out.printf("ผู้ที่เกิดปีพ.ศ.%d%s", n ," จัดอยู่ในกลุ่ม Generation Y\n\n\n");
        }else if(n>=2508 && n<=2519){
          System.out.printf("ผู้ที่เกิดปีพ.ศ.%d%s", n ," จัดอยู่ในกลุ่ม Generation X\n\n\n");
        }else if(n>=2489 && n<=2507){
          System.out.printf("ผู้ที่เกิดปีพ.ศ.%d%s", n ," จัดอยู่ในกลุ่ม Baby Boomer Generation\n\n\n ");
        }else if(n>=2468 && n<=2488){
          System.out.printf("ผู้ที่เกิดปีพ.ศ.%d%s", n ," จัดอยู่ในกลุ่ม Silent Generation\n\n\n ");
        } 

        System.out.print ("กรุณาใส่เลข0-9เพียงตัวเดียว>> ");

        int x = scan.nextInt();


        int digit=x;
        switch(digit){
            case 0 : System.out.print("0 อ่านว่า ศูนย์\nเลขไทยคือ ๐");
                    break;
            case 1 : System.out.print("1 อ่านว่า หนึ่ง\nเลขไทยคือ ๑");
                    break;
            case 2 : System.out.print("2 อ่านว่า สอง\nเลขไทยคือ ๒");
                    break;
            case 3 : System.out.print("3 อ่านว่า สาม\nเลขไทยคือ ๓");
                    break;
            case 4 : System.out.print("4 อ่านว่า สี่\nเลขไทยคือ ๔");
                    break;
            case 5 : System.out.print("5 อ่านว่า ห้า\nเลขไทยคือ ๕");
                    break;
            case 6 : System.out.print("6 อ่านว่า หก\nเลขไทยคือ ๖");
                    break;
            case 7 : System.out.print("7 อ่านว่า เจ็ด\nเลขไทยคือ ๗");
                    break;
            case 8 : System.out.print("8 อ่านว่า แปด\nเลขไทยคือ ๘");
                    break;
            case 9 : System.out.print("9 อ่านว่า เก้า\nเลขไทยคือ ๙");
                    break;
            default:
                System.out.print("ไม่มีเลข"); 

    }
}
