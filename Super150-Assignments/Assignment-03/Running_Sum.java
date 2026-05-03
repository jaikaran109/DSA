import java.util.Scanner;

public class Running_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int[]nums = new int[n] ;
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = sc.nextInt() ; 
        }
        int[] res = runningSUM(nums) ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(res[i]+" ");
        }
        sc.close();
    }

    public static int[] runningSUM (int[] nums)
    {
        int[] prefixSum = new int[nums.length] ; 
        prefixSum[0] = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++)
        {
            prefixSum[i] = prefixSum[i-1] + nums[i] ;  
        }

        return prefixSum ;
    }
}
