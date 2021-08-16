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




public class MergeSortt {
	node head = null;
	
	static class node {
		int v;
		node next;

		public node(int v)
		{
			this.v = v;
		}
	}

	node sortedMerge(node f, node s)
	{
		node result = null;
		
		if (f == null)
			return s;
		if (s == null)
			return f;

		
		if (f.v <= s.v) {
			result = f;
			result.next = sortedMerge(f.next, s);
		}
		else {
			result = s;
			result.next = sortedMerge(f, s.next);
		}
		return result;
	}

	node mergeSort(node h)
	{
		
		if (h == null || h.next == null) {
			return h;
		}

		
		node middle = getMiddleV(h);
		node nextofmiddle = middle.next;

		
		middle.next = null;

		
		node left = mergeSort(h);

		
		node right = mergeSort(nextofmiddle);

		
		node sortedlist = sortedMerge(left, right);
		return sortedlist;
	}

	
	public static node getMiddleV(node head)
	{
		if (head == null)
			return head;

		node slow = head, fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	void insert(int new_data)
	{
		
		node new_node = new node(new_data);

		
		new_node.next = head;

		
		head = new_node;
	}

	
	void printList(node headref)
	{
		while (headref != null) {
			System.out.print(headref.v + " ");
			headref = headref.next;
		}
	}

	
}


