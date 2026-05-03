
import java.util.Arrays;
import java.util.Scanner;

public class Majority_Element_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int[] nums = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = sc.nextInt() ;
        }
        int max[] = majority(nums) ;
        if(max[0] == Integer.MIN_VALUE && max[1] == Integer.MIN_VALUE)  // if the res array doesnt changed or we didnt find any majority 
        {
            System.out.print("No Majority Elements");
        } 
        else if(max[0] == Integer.MIN_VALUE)   // if there is one majority
        {
            System.out.print(max[1]);
        }
        else if(max[1] == Integer.MIN_VALUE)    // if there is one majority
        {
            System.out.print(max[0]);
        }
        else{   
            // if 2 majoritues are found
            System.out.print(max[0] + " " + max[1]);
        }
        sc.close();

    }    

    public static int[] majority(int[] nums)
    {
        int vote1 = 0 ; 
        int vote2 = 0 ;
        int majority1 = 0; 
        int majority2 = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
        {
            // Boyr's Moore Voting Algo   Same as moore voting algo just with 2 majorities
            if(vote1 == 0 && majority2 != nums[i])   // this condition bcoz majority element should not be equal
            {
                vote1 = 1 ; 
                majority1 = nums[i] ;
            }
            else if(vote2 == 0 && majority1 != nums[i])
            {
                vote2 = 1 ;
                majority2 = nums[i] ; 
            }

            else if(nums[i] == majority1)
            {
                vote1++; 
            }
            else if(nums[i] == majority2)
            {
                vote2++ ; 
            }
            else{     // if the nums[i] is not equal to both the majority element
                vote1-- ; 
                vote2-- ;
            }
        } 


        // to check the n/3 condition
        int count1 = 0 , count2 = 0 ; 
        for(int num : nums)
        {
            if(num == majority1)
            {
                count1++; 
            }
            else if(num == majority2)
            {
                count2++ ;
            }
        }

        int res[]= {Integer.MIN_VALUE , Integer.MIN_VALUE};
        int idx= 0 ;
        if(count1 > nums.length/3)
        {
            res[idx] = majority1 ;
            idx++ ;
        }
        if(count2 > nums.length/3)
        {
            res[idx] = majority2 ;
        }
        Arrays.sort(res);
        return res;
    }
}
