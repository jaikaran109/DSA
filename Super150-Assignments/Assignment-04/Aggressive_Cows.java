import java.util.Arrays;
import java.util.Scanner;
public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int cow = sc.nextInt() ; 
        int [] stall = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            stall[i] = sc.nextInt() ; 
        }
        sc.close();
        Arrays.sort(stall) ;  // sort kiya taaaki position ko bs increasing order mein kr sku 

        int ans = 0  ;
        int low = 0  ;  // minimum distance btw stalls
        int high = stall[n-1] - stall[0] ;  // maximum distance btw stalls
        while(low <= high)
        {
            int mid = (low + high) / 2 ; 
            if(ispossible(stall,cow,mid))   // array pr BS nhi lgaya h bs meine minimum distance pr lgaya h 
            {
                ans = mid ; 
                low = mid + 1 ;
            }
            else{
                high= mid -1 ;
            }
        }
        System.out.print(ans) ;
    }
    public static boolean ispossible(int[] stall , int cow , int dist)
    {
        int countcow = 1 ;   // pehli cow  
        int pos = stall[0] ; // uski position ko first pr fix krdo 

        for(int i = 1 ; i < stall.length ; i++)     // agle position se loop chlega length tk 
        {
            if(stall[i] - pos >= dist)     // ab check kro ki kya agla stall aur poorane stall ki position ki doori minimum of dist h 
            {
                countcow++ ;        // agr h toh doosri cow betha do 
                pos = stall[i] ;   // aur nayi position dedo dosori cow wali 
            }

            if(countcow == cow)    // ye isliye agr 3o cow beth gyi hein to return krwa do aage check mt kro 
            {
                return true ;
            }
        }
        return false ;
    }
}
