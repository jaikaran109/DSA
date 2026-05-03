import java.util.* ;
public class Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int[] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }

        int target = sc.nextInt() ;
        Arrays.sort(arr) ;
        sumPairs(arr, target) ; 
        sc.close();
    }

    public static void sumPairs(int[] arr , int target)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    System.out.println(arr[i]+" and "+arr[j]);
                }
            }
        }
    }
}
