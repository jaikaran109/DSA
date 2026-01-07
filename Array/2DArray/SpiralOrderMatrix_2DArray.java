package Array;


// -- Good Ques 

//Spiral order means:
//Start from top-left
//Move right
//Then down
//Then left
//Then up
//Repeat this process layer by layer until all elements are printed.


// -- EXAMPLE 
//1   5   7   9   10  11
//6   10  12  13  20  21
//9   25  29  30  32  41
//15  55  59  63  68  70
//40  70  79  81  95 105

// -- Spiral Output
//1 5 7 9 10 11 
//21 41 70 105 
//95 81 79 70 40 
//15 9 6 
//10 12 13 20 
//32 68 
//63 59 55 
//25 29 30






import java.util.*;
public class SpiralOrderMatrix_2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int m = sc.nextInt();


	      int matrix[][] = new int[n][m];
	      for(int i=0; i<n; i++) {
	           for(int j=0; j<m; j++) {
	               matrix[i][j] = sc.nextInt();
	           }
	      }
	      
	      
	    //Original Array
			System.out.println("Original Array");
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < m ; j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
			
			

	      System.out.println("The Spiral Order Matrix is : ");
	      int rowStart = 0;
	      int rowEnd = n-1;
	      int colStart = 0;
	      int colEnd = m-1;


	      //To print spiral order matrix
	      while(rowStart <= rowEnd && colStart <= colEnd) {
	          //1
	          for(int col=colStart; col<=colEnd; col++) {
	              System.out.print(matrix[rowStart][col] + " ");
	          }
	          rowStart++;


	          //2
	          for(int row=rowStart; row<=rowEnd; row++) {
	              System.out.print(matrix[row][colEnd] +" ");
	          }
	          colEnd--;


	          //3
	          for(int col=colEnd; col>=colStart; col--) {
	              System.out.print(matrix[rowEnd][col] + " ");
	          }
	          rowEnd--;


	          //4
	          for(int row=rowEnd; row>=rowStart; row--) {
	              System.out.print(matrix[row][colStart] + " ");
	          }
	          colStart++;


	          System.out.println();
	      }

		

	}

}
