package com.velocity.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
		
		list.add("Pune");
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Banglore");
		
		//System.out.println(list);
		for(String str : list) {
			System.out.println(str);
		}
	}

}
