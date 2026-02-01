package ArrayList;
import java.util.*;
public class Basics {
	public static void main(String[] args) {
	//Wrapper Classes
	// a  class whose object contains or wraps PDT(primitive data type = int,float,etc)
	// object of a wrapper class contains a field which stores PDT
	//   PDT      WRAPPER CLASS
	//   int      Integer
	//   float    Float
	//   char     Character
	//   boolean  Boolean
	//   long     Long
	
	
//		Integer i = Integer.valueOf(4);
//		System.out.println(i);
//		Float f = Float.valueOf(4.5434f);
//		System.out.println(f);
		
		
		//dekho ab basic ques ye h ki ye kaam to hm int i , float f kr ke bhi kr skte the
		//lekin java ek object oriented language h aur int i , float f to variables me store krna hua 
		//isiliye hm iss type se create krte h , aise create krne ka mtlb hm object hi bna rhe h 
		//aur jo java.util.* hota h uske helps se hm log iss type ke variables pe operations easily kr skte h like :- Arraylist,etc
		
		
//		Arraylist is a class which present in java.util.*
//		its like array but have some extra feature like :- we can change size of array , and many more features
		
		
//		Syntax
		ArrayList<Integer> l1= new ArrayList<>();  
//		ArrayList<Float> l2= new ArrayList<>();
		
		
		
		
		
		System.out.println("\n");
//		Normal Methods
		// add new element
		l1.add(5);   // 5 
		l1.add(75);  // 5 75
		l1.add(7);	 // 5 75 7									//added in given order
		l1.add(3);   // 5 75 7 3
		l1.add(6);   // 5 75 7 3 6
		
		
		
		
		
		System.out.println("\n");
		//get an element at index i
		System.out.println(l1.get(3)+"\n");
		
		
		
		
		
		
		System.out.println("\n");
		//print with loop
		for(int i = 0 ; i < l1.size(); i++) {
			System.out.print(l1.get(i)+" ");     // 5 , 75 ,7 , 3 , 6
		}
		
		
		
		
		
		
		System.out.println("\n");
		//printing the array list directly
		System.out.println("\n"+l1);   // [5,75,7,3,6] -- output
		
		
		
		
		
		System.out.println("\n");
		//adding element at some index i 
		l1.add(1,100);
		System.out.println(l1);   //[5, 100, 75, 7, 3, 6]
		
		
		
		
		
		System.out.println("\n");
		//modifying element at index i
		l1.set(2, 10);
		System.out.println(l1);   //[5, 100, 10, 7, 3, 6]
		
		
		
		
		System.out.println("\n");
		//removing an element at index i
		l1.remove(1);
		System.out.println(l1);  //[5, 10, 7, 3, 6]
		
		
		
		
		System.out.println("\n");
		// removing an element e
		l1.remove(Integer.valueOf(7));
		System.out.println(l1);   // [5, 10, 3, 6]
		System.out.println(l1.remove(Integer.valueOf(10))); // returns true which means 10 present h
		System.out.println("\n");
		System.out.println(l1); 
		System.out.println(l1.remove(Integer.valueOf(17)));  // returns false which means 17 present nhi h 
		
		
		
		
		
		
		System.out.println("\n");
		//checking if an element exists or not
		boolean ans = l1.contains(Integer.valueOf(6));
		System.out.println(ans);
		
		System.out.println("\n");
		
		boolean ans1 = l1.contains(Integer.valueOf(60));
		System.out.println(ans);
		
		
		
		
		
		
		
		System.out.println("\n");
		//  if you don't specify class,you can put anything inside l
		ArrayList l = new ArrayList();
		l.add("rgrfd");
		l.add(567);
		l.add(true);
		System.out.println(l);
		
		
		
		
		
	}
}
