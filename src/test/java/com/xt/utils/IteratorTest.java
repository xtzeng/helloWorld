package com.xt.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * public interface Itereator<E>
 * @author xiaodi.zeng
 *
 */
public class IteratorTest {
	
	@Test
	public void testNext() {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String  string = iter.next();
			System.out.println(string);
		}
	}
	
	
	@Test
	public void testRemove() {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String  string = iter.next();
			System.out.println(string);
			iter.remove();
		}
		
		System.out.println("remove之后list的size:"+list.size());//为0
	}
}
