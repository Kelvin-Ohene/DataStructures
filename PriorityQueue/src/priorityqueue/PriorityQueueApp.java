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
public class PriorityQueueApp {
    
    

  public static void main(String[] args) {
    PriorityQueue test = new PriorityQueue();
    test.insert(15,"E");
    test.insert(10,"V");
    test.insert(11,"L");
    test.insert(2,"I");
    test.insert(32,"K");
    test.insert(1,"N");
    
    test.printPriorityQueue();
    System.out.println();
    
    test.remove();
    System.out.println();
    
    test.printPriorityQueue();
    System.out.println();
    
    System.out.println(test.isFull());
    
    test.peek();
    System.out.println();
    
    test.remove();
    System.out.println();
    
    test.printPriorityQueue();
    System.out.println();
    
  }
    
}

    

