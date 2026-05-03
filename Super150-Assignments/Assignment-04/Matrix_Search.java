import java.util.Scanner;
public class Matrix_Search {
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
        int target = sc.nextInt() ;
        sc.close();
        System.out.println(search(arr , r, c, target));
    }

    public static int search(int[] [] arr, int r , int c, int target)
    {
        int row = 0 ; 
        int col = c-1 ;
        while(row < r && col < c)
        {
            if(arr[row][col] == target)
            {
                return 1 ;
            }
            if(arr[row][col] < target)
            {
                row++ ; 
            }
            else if(arr[row][col] > target)
            {
                col-- ;
            }
        }
        return 0; 
    }
}
