package Confluent.Confluent1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.*;
import java.util.Set;
import java.util.TreeSet;

public class UserDefinedHashmap {

	
	public static void main(String args[]){
		
		HashSet<Integer> set=new HashSet<Integer>();
		TreeSet<Integer> tree=new TreeSet<Integer>();
		
		
		
		int[] myArray = new int[] { 10,3, 4, 2, 10, 11, 15 };
		for(int i=0;i<myArray.length;i++)
			set.add(myArray[i]);
		
		set.add(10);
		set.add(20);
		tree.addAll(set);
		
		
	
	
		
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "giri");
		map.put(2, "Ravi");
		map.put(3, "hari");
		Set<Entry<Integer, String>> entrySet=map.entrySet();
		
		for(Entry<Integer, String> i:entrySet ){
			
		System.out.println(map.containsKey(i.getKey()));
			
			//System.out.println(i.getKey()+" "+ i.getValue());
		}
		System.out.println(map.toString()+"Hello");
		
	
	}
}
