import java.util.Scanner;

public class subset_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        int [] arr = new int[n] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() ;
        }
        int targt = sc.nextInt()  ;
        sc.close();
        int s = subset(arr, 0, "", targt, 0) ; 
        System.out.print("\n"+s);
    }
    public static int subset(int [] arr , int i, String ans, int targt, int sum)
    {
        if(i == arr.length)
        {
            if(sum == targt)
            {
                System.out.print(ans+" ");
                return 1 ;
            }
            return 0 ; 
        }
        int include  = subset(arr, i+1 , ans+arr[i]+" ", targt, sum + arr[i]);
        int exclude = subset(arr, i+1 , ans, targt, sum);
        return include + exclude ; 
    }
}
