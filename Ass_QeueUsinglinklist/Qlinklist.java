/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queueusinglinklist;

/**
 *
 * @author Memoona
 */
public class Qlinklist {
  Qnode front;
  Qnode rear;
   public Qlinklist(){
       this.front=null;
       this.rear=null;}
  public  int dequeue()
    {
        if (front == null) {
            System.out.print(" Underflow");
        }
 
        Qnode temp = front;
        System.out.printf("removing"+ temp.data);
         front = front.next;
         if (front == null) {
            rear = null;
        }
        int item = temp.data;
        return item;
    }
   public  void enqueue(int item)    
    {
       
        Qnode node = new Qnode(item);
        System.out.printf("Inserting this value"+ item);
        if (front == null) {
            front = node;
            rear = node;
        }
        else {
          rear.next = node;
            rear = node;
        }
    }
    public  void peek() {
        if (front != null) {
           System.out.println (front.data);
        } else {
            System.out.println ("no data found");
        }
 
       
    }
 
}
