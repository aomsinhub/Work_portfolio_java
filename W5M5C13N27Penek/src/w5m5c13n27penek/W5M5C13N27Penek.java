/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w5m5c13n27penek;

/**
 *
 * @author a
 */
public class W5M5C13N27Penek {

    public static void main(String[] args){
        
        int j = 0,i = 1;
        while (i <= 10){
            j=j+i;
            i++;
        }
        System.out.println("ผลบวกของ 1 ถึง 10="+j);
        
    
        for(int t = 2;t <= 12;t++){
            System.out.println("สูตรคูณแม่"+t);
            for(int num = 1;num <= 12 ; num++){
                System.out.println(t+"x"+num+"="+t*num);
            }
        }
    }
}