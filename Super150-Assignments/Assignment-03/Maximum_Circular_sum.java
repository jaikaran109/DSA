import java.util.Scanner;

public class Maximum_Circular_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int[] nums = new int[n] ;
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = sc.nextInt() ;
        }
        sc.close();

        int maxSum = MAX_kadanes_algo(nums) ;
        int total = 0 ; 
        for (int i = 0; i < nums.length; i++) {
            total += nums[i] ;    //  calculate the total sum 
            nums[i] = nums[i] * -1 ;
        }

        int minSum = MAX_kadanes_algo(nums) ;
        int circular = total + minSum ;
        if(maxSum < 0)
        {
            System.out.print(maxSum) ;
        }
        else{
            System.out.println(Math.max(maxSum, circular)); ;
        }
    }

    public static int MAX_kadanes_algo(int [] nums)
    {
        int ans = Integer.MIN_VALUE ;
        int sum = 0 ; 
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] ; 
            ans = Math.max(ans, sum) ;
            if(sum < 0)
            {
                sum = 0 ; 
            }
        }
        return ans ;
    }
}




// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();
//         while (t-- > 0) {

//             int n = sc.nextInt();
//             int[] arr = new int[n];
//             for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

//             int ans = maxCircular(arr, n);
//             System.out.println(ans);
//         }
//     }

//     public static int maxCircular(int[] arr, int n) {
//         int maxSum = Integer.MIN_VALUE;

//         // Try every starting point
//         for (int i = 0; i < n; i++) {
//             int currSum = 0;

//             // Expand subarray of length up to n
//             for (int j = 0; j < n; j++) {
//                 int idx = (i + j) % n;
//                 currSum += arr[idx];
//                 maxSum = Math.max(maxSum, currSum);
//             }
//         }

//         return maxSum;
//     }
// }
