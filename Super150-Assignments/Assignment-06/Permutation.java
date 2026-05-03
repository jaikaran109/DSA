import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int [] nums = {1 , 2 , 3} ; 
        List<List<Integer>> ll = new ArrayList<>() ;
        permut(nums , ll , new ArrayList<>() ) ; 
        System.out.println(ll);
    }

    public static void permut(int [] nums , List<List<Integer>> ll , ArrayList<Integer> temp )
    {
        if(temp.size() == nums.length)
        {
            ll.add(new ArrayList<>(temp)) ;
            return ;
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!temp.contains(nums[i]))
            {
                temp.add(nums[i]) ; 
                permut(nums, ll, temp); 
                temp.remove(temp.size()-1) ; 
            }
        }
    }
}