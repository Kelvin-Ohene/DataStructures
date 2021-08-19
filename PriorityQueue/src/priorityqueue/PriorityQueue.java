/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;


/**
 *
 * @author KEL
 */
public class PriorityQueue {

    /**
     * @param args the command line arguments
     */
    private int maxv;
  private int[] arrayy;
  private String[] arr;
  private int items,count;
  
  
  public PriorityQueue() {
    maxv = 10;
    arrayy = new int[maxv];
    arr = new String[maxv];
    items = 0;
    count = items;
  }
  
  public void insert(int key, String val) {
    int i;
    if(items != maxv){
    if(items == 0) {
      arrayy[0] = key;
      arr[0] = val;
      items++;
      //count++;
      return;
    }
    for(i = items - 1; i >= 0; i--) {
      if(  key > arrayy[i]) {
        arrayy[i+1] = arrayy[i];
        arr[i+1] = arr[i];
      } else {
        break;
      }
    }
    arrayy[i+1] = key;
    arr[i+1] = val;
    items++;
    
  }else{
        System.out.println("FUll");
    }
  }
  
  public void printPriorityQueue() {
    //count =items;
      for(int i = 0; i < items; i++) {
      System.out.print(arr[i] + " " /*+ arr[i]*/);
    }
  }
  
  public void remove() {
   
    System.out.println("Item removed from index  " + arrayy[--items] );  
    //return arrayy[--items];
  }
     
  
  public boolean isFull() {
    if (items == maxv) {
        System.out.println("Queue is full");
        return true;
    } else {
        System.out.println("Queue is not full");
        return false;
    }
  }
  
  public boolean isEmpty() {
    if (items == 0) {
        System.out.println("Queue is empty");
        return true;
    } else {
        System.out.println("Queue is not empty");
        return false;
    }
  }
  
  public void peek() {
    System.out.println("The peek value is " + arr[items - 1]);
      //return arrayy[items - 1];
  }
}

