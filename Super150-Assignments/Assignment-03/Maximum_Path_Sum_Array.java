import java.util.Scanner;

public class Maximum_Path_Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ;
        while (test > 0) 
        {
            int n1 = sc.nextInt() ;
            int n2 = sc.nextInt() ; 
            
            int[] arr1 = new int[n1] ; 
            int[] arr2 = new int[n2] ;

            for(int i = 0 ; i < n1 ; i++)
            {
                arr1[i] = sc.nextInt() ;
            }

            for(int i = 0 ; i < n2 ; i++)
            {
                arr2[i] = sc.nextInt() ;
            }

            int sum = maxPathSum(arr1, n1, arr2, n2) ; 
            System.out.println(sum);
            test-- ;    
        }
        sc.close();
    }

    public static int maxPathSum(int[] arr1, int n1, int[] arr2, int n2)
    {
        int i = 0 ; 
        int j = 0; 
        int sum1 = 0 ; 
        int sum2 = 0 ; 
        int res = 0 ; 

        while(i < n1 && j < n2 )
        {
            if(arr1[i] > arr2[j])        // jo bhi chota hoga usko add kro aur aage bdh jaao 
            {
                sum2 += arr2[j] ;
                j++ ; 
            }
            else if(arr1[i] < arr2[j])      // same here 
            {
                sum1 += arr1[i];
                i++ ;
            }
            else if(arr1[i] == arr2[j])    // jese hi common element mil jayega   res mein max of sum1 and sum2 daaldo aur dono ko 0 krdo taaki agla sum calculate kr sken
            {
                res += Math.max(sum1,sum2) + arr1[i] ;   // +arr1[i] isliye hai kyu ki ye common lement bhi add kr rhe hein idhr arr2[j] bhi ho skta th kyu ki dono equal hein
                sum1 = 0 ; 
                sum2 = 0 ; 
                i++ ; 
                j++ ;
            }
        }

        while(i < n1)  // ye dono loop left over element ke liye hein ki agr ab koi bhi array khtm hogyi h toh isse sum kr skte 
        {
            sum1 += arr1[i] ; 
            i++ ;
        }

        while(j < n2)
        {
            sum2 += arr2[j] ; 
            j++ ;
        }

        res += Math.max(sum1,sum2) ;

        return res ;
    }
}
