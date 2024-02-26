package com.Vector;

import java.util.Arrays;

public class Vector <T>{
	
	 private int defaultCapacity = 10;
	    private Object[] elements;
	    private int size;

	    // Default size Vector
	    public Vector() {
	        this.elements = new Object[defaultCapacity];
	        this.size = 0;
	    }

	    // Sized Vector
	    public Vector(int initialCapacity) {
	        if (initialCapacity < 0) {
	            System.out.println("Wrong Capacity!!!");
	        }
	        this.elements = new Object[initialCapacity];
	        this.size = 0;
	    }

	    // Size
	    public synchronized int size() {
	        return size;
	    }

	    public synchronized boolean isEmpty() {
	        return size == 0;
	    }

	    // Check capacity if full then doubles it
	    private synchronized void ensureCapacity(int minCapacity) {
	        if (minCapacity > elements.length) {
	            int newCapacity = elements.length * 2;
	            while (newCapacity < minCapacity) {
	                newCapacity *= 2;
	            }
	            elements = Arrays.copyOf(elements, newCapacity);
	        }
	    }

	    // Add element
	    public synchronized void add(T element) {
	        ensureCapacity(size + 1);
	        elements[size++] = element;
	    }

	    // Get element
	    @SuppressWarnings("unchecked")
	    public synchronized T get(int index) {
	        if (index < 0 || index >= size) {
	            return (T) "IndexOut of Bounds!!!";
	        }
	        return (T) elements[index];
	    }

	    // For removing element
	    public synchronized void remove(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
	        }
	        for (int i = index; i < size - 1; i++) {
	            elements[i] = elements[i + 1];
	        }
	        elements[--size] = null;
	    }

	    // For print Vector
	    @Override
	    public synchronized String toString() {
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
