import java.util.Arrays;
import java.util.Scanner;

public class Rowwise_MAtrix_Sort {
    public static void main(String[] args) {
        // int r = 4 ; 
        // int c = 5 ;
        // int[][]arr = {{13, 5, 13, 9, 11}, {5, 10, 11, 4, 6,}, {6, 10, 17, 12, 16},{8, 11, 7, 18, 5}} ;
        Scanner sc = new Scanner(System.in) ; 
        int r = sc.nextInt() ;
        int c = sc.nextInt() ;
        int [][] arr = new int[r][c] ;
        for(int i = 0 ; i < r; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                arr[i][j] = sc.nextInt() ;
            }
        }
        sc.close();
        
        for(int i = 0 ; i < r ; i++)
        {
            Arrays.sort(arr[i]) ;
        }

        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                System.out.print(arr[i][j]+" "); ;
            }
            System.out.println();
        }

    }
}
