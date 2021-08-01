/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;

/**
 *
 * @author user
 */
public class Implement {
    
    public static void main(String[] args){
        SinglyLinkedList<String> MyList = new SinglyLinkedList<String>();
        MyList.addFirst("element 1");
        MyList.addFirst("element 2");
        MyList.addFirst("element 3");
        MyList.addLast("element 4");
        MyList.addLast("element 5");
        MyList.addLast("element 6");
        MyList.indexOfElement("element 4");
        MyList.removeLast();
        MyList.last();
        MyList.removeElementAt("element 3");
        
        
        
    }
}
