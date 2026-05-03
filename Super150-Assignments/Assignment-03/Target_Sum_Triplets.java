import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Triplets {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int[] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ; 
        }
        Arrays.sort(arr) ;
        int target = sc.nextInt() ;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                for(int k = j+1 ; k < n ; k++)
                {
                    if(arr[i] + arr[j] + arr[k] == target)
                    {
                        System.out.println(arr[i]+", "+arr[j]+" and"+" "+arr[k]); 
                    }
                }
            }
        }

        sc.close();
    }
}
