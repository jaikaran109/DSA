package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortDecending {

	public static void main(String[] args) {
		
		//for integer
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(22);
		list.add(10);
		
		System.out.println("Original List"+list);
		Collections.sort(list);
		System.out.println("Ascending order"+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Desc Order"+list);

		
		
		
		System.out.println("\n \n");

		
		//for string
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Hello");
		list1.add("Everyone");
		list1.add("Jai karan");
		list1.add("here");
				
		System.out.println("Original List"+list1);
		Collections.sort(list1);
		System.out.println("Ascending order"+list1);
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("Desc Order"+list1);
		
	}

}
