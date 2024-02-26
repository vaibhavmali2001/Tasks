package com.ArrayList;

import java.util.Arrays;

public class ArrayList<T> {
	private int defaultCapacity=10;
	private Object[] elements;
	private int size;
	
	//Default size ArrayList
	public ArrayList() {
		this.elements = new Object[defaultCapacity];
		this.size = 0;
	}
	
	
	//Sized ArrayList
	public ArrayList(int initialCapacity) {
		if(initialCapacity<0)
		{
			System.out.println("Wrong Capacity!!!");
		}
		this.elements=new Object[initialCapacity];
		this.size=0;
	}
	
	
	//Size
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	//Check capacity if full then increase 50% it
	private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 3/2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
	
	
	//Add element
	public void add(T element) {
		ensureCapacity(size+1);
		elements[size++]=element;
	}
	
	
	//Get element
	@SuppressWarnings("unchecked")
	public T get(int index) {
		if(index<0||index>=size) {
			return (T) "IndexOut of Bounds!!!";
		}
		return (T) elements[index];
	}
	
	//For removing element
	public void remove(int index) {
	    if (index < 0 || index >= size) {
	        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	    }
	    for (int i = index; i < size - 1; i++) {
	        elements[i] = elements[i + 1];
	    }
	    elements[--size] = null;
	}

	//For print ArrayList
	   @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("[");
	        for (int i = 0; i < size; i++) {
	            sb.append(elements[i]);
	            if (i < size - 1) {
	                sb.append(", ");
	            }
	        }
	        sb.append("]");
	        return sb.toString();
	    }
	
	
	
	
	
	
	
}