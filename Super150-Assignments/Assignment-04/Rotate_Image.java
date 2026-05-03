import java.util.Scanner;
public class Rotate_Image {
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
        transpose(arr, n);
        rev_column(arr, n);
        for(int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(arr[i][j]+" ");;
            }
            System.out.println();
        }
        
    }
    public static void transpose(int[][] arr , int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                int temp =arr[i][j] ; 
                arr[i][j] = arr[j][i] ; 
                arr[j][i] = temp ;
            }
        }
    }

    public static void rev_column (int[][]arr ,int n)
    {
        for(int i = 0 ; i < n ; i++)
        {
            int start = 0 ;
            int end = n-1 ;
            while(start <= end)
            {
                int temp = arr[start][i] ;
                arr[start][i] = arr[end][i] ;
                arr[end][i] = temp ;
                start++ ; 
                end-- ;
            }
        }
    }
}
