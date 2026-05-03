import java.util.Scanner;

public class book_allocation_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int test = sc.nextInt() ;
        while(test-- > 0)
        {
            int book = sc.nextInt() ; 
            int stu = sc.nextInt() ; 
            int pages[] = new int[book] ;
            for(int i = 0 ; i < book ; i++)
            {
                pages[i] = sc.nextInt() ;
            }
            int low = 0 ; 
            int high = sumpages(pages) ;
            int ans = -1  ; 
            while (low <= high) 
            {
                int mid = (low + high) / 2 ; 
                if(ispossible(pages, stu, mid))
                {
                    ans = mid;
                    high = mid - 1 ;
                }
                else
                {
                    low = mid + 1 ;
                }
            }           
            System.out.println(ans);
        }
        sc.close();
    }

    public static boolean ispossible(int[] pages ,int stu , int allocated)
    {
        int countstu = 1 ; 
        int readpage = 0 ;
        for(int i  = 0 ; i < pages.length ; i++)
        {   
            if(pages[i] > allocated)    // If one book itself has more pages than 'allocated', not possible
            {
                return false ;  // pages = [10, 20, 30]    stu = 2    allocated = 15    not possible
            }
            if(readpage + pages[i] <= allocated)    // agr abhi pages km hein mid se toh page add krdo 
            {
                readpage += pages[i] ;
            }
            else
            {
                readpage = pages[i] ;    // agr jyada hogya ek student aur aajayega aur us studnet ko current pages mil jayenge
                countstu++ ;
            }
        }
        return countstu <= stu ? true : false ;
    }

    public static int sumpages(int pages[]) 
    {
        int sum = 0 ;
        for(int i = 0 ; i < pages.length ; i++)
        {
            sum += pages[i] ;
        }
        return sum ;
    }
}
