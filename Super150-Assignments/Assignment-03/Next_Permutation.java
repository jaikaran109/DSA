public class Next_Permutation {
    public static void main(String[] args) {
        int[] nums = {4,1,5,3,2} ;
        nextPermutation(nums) ;
        for(int num : nums)
        {
            System.out.print(num+" ");
        }
    }
    public static void nextPermutation(int[] nums)
    {
        // Find the Pivot index joki Right->Left chalne pr apne next element se bda ho jaaye jese idhr index 1 hoga pivot index kyu ki 3 aur 5 dono ek doosro ko succeed kr rhe hein
        int pivot = -1 ;     
        int n = nums.length ; 
        for(int i = n-2 ; i >= 0 ; i--)
        {
            if(nums[i] < nums[i+1])   // 3 > 2 then 5 > 3 but but index 1 pr aaye toh 1 < 5 mtlb ye bnda alg nikal gya trend se
            {
                pivot = i ; 
                break ;
            }
        }

        if(pivot == -1)             // ab agr pivot mila hi ni toh hum aaraay ko chup chaap reverse krdenge
        {
            reverse(nums,0,n-1) ;
            return ;
        }
        
        int idx2 = -1;      // vrna hum doosra index nikalnnge right -> left se joki humare pivot element se just bda hoga
        for(int i = n - 1 ; i > pivot ; i--)
        {
            if(nums[pivot] < nums[i])           //  mltb is question mein right -> left mein 2 hoga kyu ki pivot == 1 hai 
            {
                idx2 = i ;
                break ; 
            }
        }

        swap(nums, pivot , idx2) ;              // swap krne pr kuch esa bbn jayega  [4, 2, 5, 3, 1]    lekin hume minimum chiye 
        reverse(nums,pivot+1 ,n -1) ;           // to hum pivot + 1 se last element tk ko reverse kr denge  [4, 2, 1, 3, 5]    now this is correct
    }

    public static void swap(int[] nums , int start , int end)
    {
        int temp = nums[start] ; 
        nums[start] = nums[end] ;
        nums[end] = temp ;      
    }

    public static void reverse(int[] nums, int start ,int end)
    {
        while(start <= end)
        {
            int temp = nums[start] ; 
            nums[start] = nums[end] ;
            nums[end] = temp ;
            start++ ;
            end-- ;  
        }
    }
}
