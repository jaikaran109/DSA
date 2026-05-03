import java.util.Scanner;

public class Matrix_Wave_print_Row_wise {
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
        sc.close();

        for(int row = 0 ; row < r ; row++)
        {
            if(row%2 == 0)
            {
                for(int col = 0 ; col < c ; col++)
                {
                    System.out.print(arr[row][col]+", ") ;
                }
            }
            else
            {
                for(int col = c-1 ; col >= 0 ;col--)
                {
                    System.out.print(arr[row][col]+", ");
                }
            }
        }
        System.out.print("END");
    }
}
