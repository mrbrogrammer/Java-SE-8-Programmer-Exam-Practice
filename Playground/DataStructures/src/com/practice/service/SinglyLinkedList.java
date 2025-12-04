package com.practice.service;

import com.practice.domain.Node;

public class SinglyLinkedList 
{
	public Node head;
	
	public SinglyLinkedList()
	{
		head = null;
	}
	
	public void insert(String data) 
	{
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;

			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}
}
