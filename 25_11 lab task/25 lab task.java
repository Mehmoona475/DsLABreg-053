/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package labtask;
import java.util.Scanner;
/**
 *
 * @author Memoona
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner Scan =new Scanner (System.in);
       System.out.println("please enter the decimal number u want to convert in binary form");
       int num=Scan.nextInt();
       System.out.println(FindBinary(num));
     
       
       }
    static int FindBinary(int decimal){
        if(decimal==0)
            return 0;
        else
            return(decimal%2+10*FindBinary(decimal/2));
    }
    }


