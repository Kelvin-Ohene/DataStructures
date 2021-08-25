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
public class HashtablewithLinkedList {
    
    int Key;
    
    Object Value;
    
     HashtablewithLinkedList next;

    /**
     * @param args the command line arguments
     */
    
    public  HashtablewithLinkedList(int Key, Object Value){
        this.Key = Key;
        this.Value = Value;
        next = null;    
    
}
    
    public  HashtablewithLinkedList(){
        next = null;
    }
    
    public int GetKey(){
        return Key ;
    }
    public Object GetValue(){
        return Value;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashTable<String> hello = new HashTable<String>(11);
        hello.insert(12, "kwame");
        hello.insert(17, "esther");
        hello.insert(65, "kofi");
        hello.insert(42, "barbs");
        hello.insert(65, "kent");
        hello.insert(13, "kel");
        hello.insert(56, "mase");
        hello.insert(2, "ken");
        
        
      // hello.HashTableArray(11);
        
        
        System.out.println(hello.getValue(92));
        System.out.println(hello.GetHash(92));
        
        
        //hello.removeValue(92,"");
         System.out.println(hello.getValue(65));
         System.out.println(hello);
        
        
    }
    
}
