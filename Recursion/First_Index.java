import java.util.Scanner;

public class First_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int [] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ; 
        }
        int m = sc.nextInt() ; 
        firstidx(arr,m, 0);
        sc.close();
    }

    public static void firstidx (int [] arr , int m, int idx) 
    {
        if(idx == arr.length)
        {
            System.out.println(-1);
            return ;
        }
        if(arr[idx] == m)
        {
            System.out.println(idx);
            return ;
        }
        firstidx(arr, m, idx+1);
    }
}
