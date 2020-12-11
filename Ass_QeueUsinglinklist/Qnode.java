/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package queueusinglinklist;

/**
 *
 * @author Memoona
 */
public class Qnode {
   int data;
   Qnode next;
  
 public Qnode(int data){
    this.data=0;
     next=null;

 }
 public Qnode(int d,Qnode n){
     data=d;
     next=n;
 }
 public void setData(int d){
     data=d;
 }
 public void setNext(Qnode n){
 next=n;
 }
 public int  getData(){
     return data;
 }
 public Qnode getNext(){
     return next;
 }
}

