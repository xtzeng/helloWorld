package com.xt.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/**
 * public interface Collection<E>
 * extends Iterable<E>
 * @author xiaodi.zeng
 *
 */
public class CollectionTest {

	@Test
	public void testAdd() {
		Collection collection = new ArrayList();
		collection.add(1);
		collection.add("abc");
		collection.add(1);
		System.out.println("the size of Collection------"+collection.size());
		
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
	@Test
	public void testClear() {
		Collection collection = new ArrayList();
		collection.add(1);
		collection.add("abc");
		collection.add(1);
		System.out.println("the size of Collection------"+collection.size());
		
		collection.clear();
		System.out.println("After Clear the size of Collection==="+ collection.size());
	}
	
	@Test 
	public void testToArray() {
		Collection collection = new ArrayList();
		collection.add(1);
		collection.add("abc");
		collection.add(1);
		
		Object[] objects = collection.toArray();
		
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);
		}
	}
	
	@Test
	public void testToArrayT() {
		Collection<String> c = new ArrayList<String>();
		c.add("aa");
		c.add("bb");
		c.add("cc");
		
		String[] strings = c.toArray(new String[0]);
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	
	
	
}
