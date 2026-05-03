import java.util.Scanner;

public class Column_Maximum_sum_Matrix {
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

        int res = 0 ;
        int idx = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            int sum = 0 ; 
            for(int j = 0 ; j < n ; j++)
            {
                sum += arr[j][i] ;
            }
            if(res < sum)   // store the index when we find something greater than the max sum
            {
                res = sum ; 
                idx = i+1 ; // as we want 1 bases indexing i.e. 3rd column 1st column like that
            }
        }
        System.out.println(idx+" "+res);
    }
}
