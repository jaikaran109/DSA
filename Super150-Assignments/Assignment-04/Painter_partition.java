import java.util.Scanner;

public class Painter_partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int painter = sc.nextInt() ;
        int n_board = sc.nextInt() ;
        int [] boards = new int[n_board] ;
        for(int i = 0 ; i < n_board ; i++)
        {
            boards[i] = sc.nextInt() ;
        }
        int low = 0 ; 
        int high = sumBoards(boards) ;
        int ans = -1 ; 
        while(low <= high)
        {
            int mid = (low + high) / 2 ; 
            if(ispossible(boards , painter , mid))
            {
                ans = mid ; 
                high = mid - 1 ;
            }
            else
            {
                low = mid + 1 ;
            }
        }
        System.out.println(ans);
        sc.close();
    }

   // Check if painters can do job within mid
    public static boolean ispossible(int[] boards , int painter , int time)
    {
        int countpainter = 1 ;
        int boardspaint = 0 ;
        for(int i = 0 ; i < boards.length; i++)
        {
            // agar koi board itna bada hai ki ek painter usse akela nahi kar sakta within 'time'
            if(boards[i] > time)
            {
                return false ;     // toh ye configuration possible nahi hai
            }

            // agar current painter ke paas time bacha hai to usko ye board assign kar do
            if(boardspaint + boards[i] <= time)
            {
                boardspaint += boards[i] ;    // same painter paint karega ye board bhi
            }
            else
            {
                // nahi to ek naya painter lagao
                countpainter++ ;               // ek aur painter use kiya
                boardspaint = boards[i] ;      // naya painter ye board se start karega
            }
        }
        return countpainter <= painter ;
    }

    public static int sumBoards(int[] boards)
    {
        int sum = 0 ; 
        for(int i = 0 ; i < boards.length ; i++)
        {
            sum += boards[i] ;
        }
        return sum ;
    }
}
