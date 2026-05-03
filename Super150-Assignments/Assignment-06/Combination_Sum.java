import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
    public static void main(String[] args) {
        int [] arr = {2,3,5}  ;
        int target = 8 ; 
        List<List<Integer>> ll = new ArrayList<>() ;
        combiSum(arr , target , ll,  0 , new ArrayList<>()) ; 
        System.out.println(ll);
    }

    public static void combiSum(int [] arr, int target ,List<List<Integer>> ll  ,int idx , List<Integer> temp) 
    {
        if(target == 0)
        {
            ll.add(new ArrayList<>(temp)) ;
            return ; 
        }
        if(idx >= arr.length || target < 0)
        {
            return ; 
        }
        temp.add(arr[idx]) ; 
        combiSum(arr, target-arr[idx], ll, idx, temp); // add multiple values of the same index
        temp.remove(temp.size()-1) ; 
        combiSum(arr, target, ll, idx+1, temp); // skip the value of the idex
    }
}
