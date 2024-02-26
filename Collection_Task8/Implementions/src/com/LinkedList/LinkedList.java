package com.LinkedList;

public class LinkedList<T>{
	
	 private Node<T> head;
	 private Node<T> tail;
	 private int size;
	 
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	 public int size() {
	        return size;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }
	    
	    //Add first
	    public void addFirst(T data) {
	        Node<T> newNode =new Node<>(data);
	        if (isEmpty()) {
	            head = tail = newNode;
	        } else {
	            newNode.setNext(head);
	            head.setPrev(newNode);
	            head = newNode;
	        }
	        size++;
	    }
	    
	    
	    //Add Last
	    public void addLast(T data) {
	        Node<T> newNode = new Node<>(data);
	        if (isEmpty()) {
	            head = tail = newNode;
	        } else {
	            tail.setNext(newNode);
	            newNode.setPrev(tail);
	            tail = newNode;
	        }
	        size++;
	    }

	    //Remove First
	    @SuppressWarnings("unchecked")
		public T removeFirst() {
	        if (isEmpty()) {
	           return (T) "List is Empty!!!";
	        }
	        T removedData = head.getData();
	        if (size == 1) {
	            head = tail = null;
	        } else {
	            head = head.getNext();
	            head.setPrev(null);
	        }
	        size--;
	        return removedData;
	    }

	    //Remove Last
	    @SuppressWarnings("unchecked")
		public T removeLast() {
	        if (isEmpty()) {
	        	return (T) "List is Empty!!!";
	        }
	        T removedData = tail.getData();
	        if (size == 1) {
	            head = tail = null;
	        } else {
	            tail = tail.getPrev();
	            tail.setNext(null);
	        }
	        size--;
	        return removedData;
	    }
	    
	    
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("[");
	        Node<T> current = head;
	        while (current != null) {
	            sb.append(current.getData());
	            if (current.getNext() != null) {
	                sb.append(", ");
	            }
	            current = current.getNext();
	        }
	        sb.append("]");
	        return sb.toString();
	    }
	 
}
