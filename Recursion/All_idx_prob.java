import java.util.*;
public class All_idx_prob 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int [] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ; 
        }
        int m = sc.nextInt() ; 
        idx(arr,m,0);
        sc.close();
    }

    public static void idx (int [] arr , int m, int idx) 
    {
        if(idx == arr.length)
        {
            return ;
        }
        if(arr[idx] == m)
        {
            System.out.print(idx+" ");
        }
        idx(arr, m, idx+1);
    }
}