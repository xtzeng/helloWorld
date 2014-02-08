package com.xt.utils;

//: holding/IterableClass.java
//Anything Iterable works with foreach.
import java.util.*;

public class IterableClass implements Iterable<String> {
	
	protected String[] words = ("And that is how " +
								"we know the Earth to be banana-shaped.").split(" ");

	public Iterator<String> iterator() {
		
		//返回一个实现Iterator接口的内部类
		return new Iterator<String>() {
				
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				return index < words.length;
	        }
			
			@Override
		    public String next() { 
		    	return words[index++]; 
		    }
			
			@Override
		    public void remove() { // Not implemented
		    	throw new UnsupportedOperationException();
		    }
   };
}	
	
	
	public static void main(String[] args) {
//		for(String s : new IterableClass())
//		System.out.print(s + " ");
		
		IterableClass iterableClass = new IterableClass();
		Iterator<String> iterator = iterableClass.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
} /* Output:
And that is how we know the Earth to be banana-shaped.
*///:~
