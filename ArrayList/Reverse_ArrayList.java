package ArrayList;



//write a program to reverse the given ArrayList
//input - [0,10,3,5,22,10]
//output - [10,22,5,3,10,0]


import java.util.*;
public class Reverse_Arraylist {
	static void reverselist(ArrayList<Integer> list) {
		int i = 0 , j = list.size() - 1;
		
		while(i < j) {
			/*
			 	int temp = a;
			 	a = b ; 
			 	b = temp; 
			 */
			
			Integer temp = Integer.valueOf(list.get(i));
			list.set(i, list.get(j));
			list.set(j,temp);
			i++;
			j--;
		}
	}
	

	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(22);
		list.add(10);
		
		
		
		System.out.println("Original List"+list);
		reverselist(list);
//		Collections.reverse(list);   //inbuilt method to reverse list  -- import.java.Collections;
		System.out.print("Reverse List"+list);
		
	}
}
