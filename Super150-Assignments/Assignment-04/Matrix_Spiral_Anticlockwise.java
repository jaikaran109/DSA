import java.util.Scanner;
public class Matrix_Spiral_Anticlockwise {
    public static void main(String[] args) {
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
        sc.close() ;
        // int r = 4 ; 
        // int c = 4 ; 
        // int[][]arr = {{11 ,12, 13, 14,},{21, 22, 23, 24},{31, 32, 33, 34},{41, 42, 43, 44}} ;

        int top = 0 ; 
        int bottom = r-1 ;
        int left = 0 ; 
        int right = c-1 ;

        while(top <= bottom && left <= right)
        {
            for(int i = top ; i <= bottom ; i++)
            {
                System.out.print(arr[i][left]+", ");
            }
            left++ ;

            for(int i = left ; i <= right ; i++)
            {
                System.out.print(arr[bottom][i]+", ");
            }
            bottom-- ;

            for(int i = bottom ; i >= top ; i--)
            {
                System.out.print(arr[i][right]+", ");
            }
            right-- ;

            for(int i = right ; i >= left ; i--)
            {
                System.out.print(arr[top][i]+", ");
            }
            top++ ;
        }
        System.out.print("END");
    }
}
