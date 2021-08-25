/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author KEL
 */
//Kelvin Ohene Amoako-219008973
public class HashTable<E> {

   HashtablewithLinkedList[] arrayH;
int size;  
    
    
    
    public  HashTable(int size){
        this.size = size;
        this.arrayH = new HashtablewithLinkedList[size];
        for(int i=0;i<size;i++){
            arrayH[i]=new HashtablewithLinkedList();
                
        }
        
    }
        
       int GetHash(int Key){
        return Key%size;
            
    }
   public void insert(int Key, Object Value){
       int HashIndex=GetHash(Key);
       HashtablewithLinkedList arrayValue = arrayH[HashIndex];
       HashtablewithLinkedList newItem = new HashtablewithLinkedList(Key, Value);
       newItem.next = arrayValue.next;
       arrayValue.next = newItem;
       
       //System.out.println();
       
       
       
   }
   
   public E getValue(int Key){
       E Value = null;
       int HashIndex=GetHash(Key);
       HashtablewithLinkedList arrayValue = arrayH[HashIndex];
       
       while(arrayValue!=null){
           if(arrayValue.GetKey()==Key){
               Value = (E) arrayValue.GetValue();
               break;
           }
           arrayValue = arrayValue.next;
       }
       return Value;
       
   }
   
   
   public void removeValue(int Key, Object Value){
       int HashIndex=GetHash(Key);
       HashtablewithLinkedList arrayValue = arrayH[HashIndex];
       HashtablewithLinkedList newItem = new HashtablewithLinkedList(Key, Value);
       arrayValue.next = newItem.next;
       newItem = arrayValue.next;
       System.out.println(HashIndex  + " has been removed");
   }
    
}
