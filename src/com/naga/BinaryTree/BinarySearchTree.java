package com.naga.BinaryTree;

import com.naga.beans.BinaryNode;

public class BinarySearchTree
{

	public static void main(String[] args)
	{
		BinaryNode root = null;
		root = insert(root,5);
	}
	
	
	static BinaryNode insert(BinaryNode root, int data)
	{
		if(root == null)
		{
			root = new BinaryNode();
			root.setLeft(null);
			root.setRight(null);
			return root;
		}
		else
		{
			BinaryNode current = root;
			
			while(current!=null)
			{
				if(current.getData()>data)
				{
					current = current.getLeft();
				}
				else
				{
					current = current.getRight();
				}
			}
			current = new BinaryNode();
	
		}
		return null;
		
	}

	
	static void search()
	{
		
	}
}
