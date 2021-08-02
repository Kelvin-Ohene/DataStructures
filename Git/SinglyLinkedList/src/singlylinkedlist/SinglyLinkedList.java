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
public class SinglyLinkedList<T> {

    /**
     * @param args the command line arguments
     */
    private static class Node<T> {
        private T element;
        private Node<T> next;
        public Node(T e, Node<T> n){
            element = e;
            next = n;
        }
        public T getElement(){
            return element;
        }
        public Node<T> getNext() {
            return next;
        }
        public void setNext(Node<T> n){
            next = n;
        }
    }
    
    //Singly Linked List
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;
    public SinglyLinkedList(){};
    public int size() {
        System.out.println(size);
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    public T first(){
        if(isEmpty()){
            return null;
        }System.out.println("First element is " + head.getElement());
        return head.getElement();
    }
    
    public T last(){
        if(isEmpty()){
            return null;
        }System.out.println("Last element is " + tail.getElement());
        return tail.getElement();
    }
    
    public void add(int i, T e){
        if(i < 0 || i > size()){
            throw new IndexOutOfBoundsException();
        } 
        if(i == size()){
            addLast(e);
            return;
        }
        if(i == 0){
            addFirst(e);
            return;
        }
        
    }
    
    public void addFirst(T e){
        head = new Node<>(e, head);
        if(size == 0){
            tail = head;
        }size++;
        System.out.println("Added head node with " + head.getElement() + " element");
    }
    
    public void addLast(T e){
        Node<T> newNode =new Node<>(e, null);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
        System.out.println("Added tail node with " + tail.getElement() + " element");
        
    }
    
    public  T removeFirst(){
        if(isEmpty()){
            return null;
        }
        T answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        System.out.println("Removed head node with " + answer + " element");
        return answer;
    }
    public  void removeLast(){
        if(tail == null){
            return;
        }else{
            if (head == tail){
            head = null;
            tail = null;
        }else{
                Node<T> previousToTail = head;
                while(previousToTail.next != tail)
                    previousToTail = previousToTail.next;
                tail = previousToTail;
                tail.next = null;
                System.out.println("Removed tail node");
            }
        }
        
    }
    
    public  void clear(){
        head = null;
        tail = null;
        size = 0;
    }
   
    
    public T removeElementAt(T e){
        Node<T> current = head;
        Node<T> previous = head;
        int position = 0;
        while(current !=null && current.getElement() !=e){
            previous = current;
            current = current.getNext();
            position++;
        }if(current == null){
            return null;
        }else{
            if(head == current){
                head = current.getNext();
            }else if(tail == current){
                tail = previous;
                tail.setNext(null);
            }else{
                previous.setNext(current.getNext());
            }System.out.println("Found and removed at position " + position);
            size--;
            return current.getElement();
        }
    }
    
     
    //same as get
    public T indexOfElement(T e){
        Node<T> current = head;
        Node<T> previous = head;
        int position = 0;
        while(current !=null && current.getElement() !=e){
            previous = current;
            current = current.getNext();
            position++;
        }if(current == null){
            return null;
        }else{
            if(head == current){
                head = current.getNext();
            }else if(tail == current){
                tail = previous;
                tail.setNext(null);
            }else{
                previous.setNext(current.getNext());
            }System.out.println("Found "+ current.getElement() + " at index " + position);
            return current.getElement();
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
