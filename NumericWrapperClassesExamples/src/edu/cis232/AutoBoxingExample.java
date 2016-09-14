package edu.cis232;

import java.util.ArrayList;

public class AutoBoxingExample {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		
		ArrayList<Integer> numList = new ArrayList<>();
		//Boxing the primitive type into a wrapper
		numList.add(5);
		int value = 6;
		numList.add(value);
		
		//Boxing the primitive type into a wrapper
		Integer integerValue = 7;
		numList.add(integerValue);
		
		//Unboxing the value into a primitive type
		for(int num : numList){
			System.out.println(num);
		}
	}

}
