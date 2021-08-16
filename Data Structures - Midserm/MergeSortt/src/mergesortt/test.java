/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortt;

/**
 *
 * @author KEL
 */
public class test {
    
    
    public static void main(String[] args)
	{

		MergeSortt list = new MergeSortt();
		
		list.insert(30);
		list.insert(7);
		list.insert(0);
		list.insert(2);
		list.insert(1);
		list.insert(287);

                
                System.out.print("\n The unsorted List is: \n");
		list.printList(list.head);
		list.head = list.mergeSort(list.head);
		System.out.print("\n The final sorted List is: \n");
		list.printList(list.head);
	}
    
}
