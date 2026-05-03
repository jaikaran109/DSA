import java.util.ArrayList;
import java.util.List;
public class Combination {
    public static void main(String[] args) {
        int n = 4 ; 
        int k = 3 ; 
        int [] arr = new int [n] ; 
        for(int i = 0 ; i < n ; i ++)
        {
            arr[i] = i+1 ;
        }
        List<List<Integer>> ll = new ArrayList<>() ;
        combination(arr,0 , k, new ArrayList<>(), ll );
        System.out.println(ll);
    }

    public static void combination (int [] arr ,int start ,int k , List<Integer> temp ,List<List<Integer>> ll )
    {
        if(k == 0)
        {
            ll.add(new ArrayList<>(temp)) ; 
            return ;
        }
        if(start >= arr.length)
        {
            return ; 
        }
        temp.add(arr[start]) ;
        combination(arr, start+1 , k-1 , temp, ll); // include
        temp.remove(temp.size()-1) ;
        combination(arr, start+1 , k , temp, ll); // exclude
    }
}
