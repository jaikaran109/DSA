import java.util.Scanner;

public class Mummy_Motivational_speech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt() ; 
        int[][] arr = new int[n][n] ;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                arr[i][j]= sc.nextInt() ;
            }
        }
        sc.close();
        System.out.println(istriangular(arr, n));
    }
    public static boolean istriangular(int [][]arr ,int n)
    {
        boolean istriangle = true ;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(i < j)
                {
                    if(arr[i][j] != 0)
                    {
                        istriangle = false ;
                        break ;
                    }
                }
            }
        }
        return istriangle ;
    }
}
