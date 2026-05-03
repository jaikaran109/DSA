import java.util.Scanner;

public class Transpose_matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int [][] arr = new int[n][n] ;
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr[i][j] = sc.nextInt() ;
            }
        }
        sc.close();
        transpose(arr,n) ;
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(arr[i][j]+" "); ;
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] arr, int n )
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                int temp = arr[i][j]; 
                arr[i][j] = arr[j][i] ; 
                arr[j][i] = temp ;
            }
        }
    }
}