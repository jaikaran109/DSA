import java.util.Scanner;
public class Last_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int [] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ; 
        }
        int m = sc.nextInt() ; 
        Lastidx(arr,m, n-1);
        sc.close();
    }

    public static void Lastidx (int [] arr , int m, int idx) 
    {
        if(idx == -1)
        {
            System.out.println(-1);
            return ;
        }
        if(arr[idx] == m)
        {
            System.out.println(idx);
            return ;
        }
        Lastidx(arr, m, idx-1);
    }
}