/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6m5c13n27penek;

    import java.util.Scanner;
public class W6M5C13N27Penek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //h1-h6 คือค่า boolean ของหัวข้อ 1.1-1.6 ถ้าผ่านเงื่อนไขจะเป็น true
        //input
        Scanner scan = new Scanner(System.in);
        System.out.println("ใส่รหัส:");
        String pass1 = scan.nextLine();
        System.out.println("ใส่รหัสยืนยัน:");
        String pass2 = scan.nextLine();
        
        //1.1 equals
        boolean h1 = pass1.equals(pass2);
       
        //1.2 รหัส 8+
        boolean h2 = false;
        int len = pass1.length();
        if(len >= 8){
            h2 = true;}
        //1.3 มีเลขอย่างน้อย 1 ตัว
        boolean h3 = false;
        for(int i = 0 ; i < pass1.length() ;i++){
                   char j = pass1.charAt(i);
                    if(Character.isDigit(j)){
                        h3 = true;}}
        //1.4.1 ตัวพิมพ์ใหญ่
        boolean h41 = false;
        for(int i2 = 0 ; i2 < pass1.length() ;i2++){
            char j2 = pass1.charAt(i2);
            if(Character.isUpperCase(j2)){
                h41 = true;
            }
        }
        //1.4.2 ตัวพิมพ์เล็ก
        boolean h42 = false;
        for(int i3 = 0 ; i3 < pass1.length() ;i3++){
            char j3 = pass1.charAt(i3);
            if(Character.isLowerCase(j3)){
                h42 = true;
            }
        }
        
        //เช็ครวม
        if(h1 && h2 && h3 && h41 && h42){
            System.out.println("ตั้งรหัสเสร็จสมบูรณ์");
            } else {
            System.out.println("ตั้งรหัสไม่ตรงเงื่อนไข");
            }
}}
