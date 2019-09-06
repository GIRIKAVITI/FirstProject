package Confluent.Confluent1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = new int[] { 3, 4, 6, 10, 11, 15 };
		int[] alicesArray = new int[] { 1, 5, 8, 12, 14, 19 };

		System.out.println(getSorteArray(myArray, alicesArray));
		
		
	}

	public static ArrayList<Integer> getSorteArray(int[] arry1, int[] arry2) {

		HashMap<Integer,Integer> a = new HashMap<Integer,Integer>();
		int i=0;
		for (; i < arry1.length; i++)
			a.put(i,arry1[i]);
		for (int j = i+1; i < arry2.length+i; j++)
			a.put(j,arry2[i]);
		
		System.out.println(a);
		
		
	return null;


	}

}
