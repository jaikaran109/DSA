package Methods;

public class Scope {
	
	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		{
			//int a = 872;  // already initialised outside the block in the same method , hence you cannot initialised again
			a = 100; // reassign the original ref variable t some other val
			System.out.print(a);
			int c = 10000; // values initialised in this block , will remain in this block
		}
		System.out.print(a);
//		System.out.print(c); // cannot use outside the block

	}

}
