/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist;
import java.util.LinkedList;
/**
 *
 * @author user
 */
public class implement1 {
    public static void main(String[] args){
        SinglyLinkedList<String> MyList1 = new SinglyLinkedList<String>();
        
        MyList1.add(0, "kelv");
        MyList1.add(1, "kel");
        MyList1.indexOfElement("kel");
        MyList1.clear();
        MyList1.size();
    }
}
