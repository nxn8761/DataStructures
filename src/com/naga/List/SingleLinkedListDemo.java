package com.naga.List;

import com.naga.beans.Node;

public class SingleLinkedListDemo
{
     public static void main(String args[])
     {
    	 Node root = null;
    	 
    	 root  = insertData(root,5);
    	 root  = insertData(root,15);
    	 root  = insertData(root,20);
    	 
    	 display(root);
    	 
    	 root  = insertData(root,10);
    	 
    	 display(root);
    	 
    	 root = delete(root,15);
    	 root = delete(root,20);
    	 
    	 display(root);
    	 
    	 root  = insertData(root,15);
    	 root  = insertData(root,20);
    	 root  = insertData(root,25);
    	 
    	 display(root);
    	 
    	 Node temp = nthFromLastNode(root,4);
    	 System.out.println("Nth from last node is "+ temp.getData());
    	 
    	 display(root);
     }
	
	static Node insertData(Node root, int data)
	{
		if(root == null)
		{
			root = new Node();
			root.setData(data);
			root.setNext(null);
			return root;
		}
		else 
		{
			Node current = root;
			Node previous = root;
			
			while(current!=null)
			{
				previous = current;
				current = current.getNext();
			}
			
			current = new Node();
			current.setData(data);
			current.setNext(null);
			
			previous.setNext(current);
			return root;
		}
	}
		
	static void display(Node node)
	{
		while(node!=null)
		{
			System.out.println(node.getData());
			node = node.getNext();
		}
		
		System.out.println("Display Completed");
	}
	
	static Node delete(Node root, int data)
	{
		Node current = root;
		Node previous = root;
		
		while(current!=null)
		{
			if(current.getData()==data)
			{
				previous.setNext(current.getNext());
				break;
			}
			else
			{
				previous = current;
				current = current.getNext();
			}
		}
		
		return root;
	}
	
	// alternate delete method
	void removeElement(Node head,int data)
    {
    	Node current  = head;
    	Node previous = null;
    	
    	while(current!=null)
    	{
    		if(current.getData() == data)
    		{
    			break;
    		}
    	  previous = current;
    	  current  = current.getNext();
    	  
    	}
    	
    	previous.setNext(current.getNext());
    }
	
	public static Node nthFromLastNode(Node head,int n) 
	{ 
		Node firstPtr=head; 
		Node secondPtr=head; 
		for (int i = 0; i < n; i++) 
		{ 
			firstPtr=firstPtr.getNext(); 
		} 
		while(firstPtr!=null)
		{ 
			firstPtr=firstPtr.getNext();
			secondPtr=secondPtr.getNext(); 
		} 
			return secondPtr; 
	}
	
	
	// This function will find middle element in linkedlist  
	 public Node findMiddleNode(Node head)  
	 {  
		 Node slowPointer, fastPointer;   
		 slowPointer = fastPointer = head;   
	  
		while (fastPointer != null)
		{
			fastPointer = fastPointer.getNext();
			if (fastPointer != null && fastPointer.getNext() != null)
			{
				slowPointer = slowPointer.getNext();
				fastPointer = fastPointer.getNext();
			}
		}
	  
	  return slowPointer;   
	  
	 }  

	
	
}
