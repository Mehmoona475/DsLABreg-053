/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queueusinglinklist;
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
       boolean flag=true;
        while(true){
            Qlinklist q=new Qlinklist();
        
        Scanner scan=new Scanner(System.in);
        System.out.println("1.enqueue");
        System.out.println("2.dequeue");
        System.out.println("3.peek");
        System.out.println("4. exit");
        System.out.println("enter choice");
        int choice=scan.nextInt();
        switch(choice){
            case 1:
                 System.out.println("enter value");
                int valu=scan.nextInt();
                q.enqueue(valu);
                break;
            case 2:
                q.dequeue();
                break;
            case 3:
                 q.peek();
                break;
           
            case 4:
                flag=false;
                break;
            default:
                System.out.println("invalid choice");
                        
                     
        
        
    }
    }
    }

}
