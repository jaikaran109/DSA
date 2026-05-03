import java.util.Scanner;

public class Murthal_Parathas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int paratha = sc.nextInt();
        int cooks = sc.nextInt() ;
        int[] ranks = new int[cooks] ; 
        for(int i = 0 ; i < cooks ; i++)
        {
            ranks[i] = sc.nextInt() ;
        }
        sc.close();
        int low = 0 ; 
        // Sabse slow cook (highest rank) ko dhoondha.
        // Agar wahi cook akela poore P paranthas banaye,
        // to usko maximum time lagega Rmax * P * (P + 1)/2.
        // Ye hamara upper bound (maximum possible time) hai.
        int maxrank = ranks[0] ;
        for(int r : ranks)
        {
            maxrank = Math.max(maxrank , r) ;
        }
        int high = maxrank * (paratha * (paratha + 1) /2);   // max time cook can take 
        int ans = 0; 
        while(low <= high)
        {
            int mid = (low + high) / 2 ;
            if(canCookAll(ranks, paratha, mid))
            {
                ans = mid;          // agar possible hai to answer store karo
                high = mid - 1;     // aur chhota time try karo
            }
            else
            {
                low =mid + 1 ;      // agar possible nahi to time badhao
            }
        }
        System.out.println(ans);
    }

    // Sab cooks ke liye calculate karo ki wo given time me kitne paranthas bana sakte hain
    // Sabka total add karo.
    // Agar total ≥ order (yaani paratha) → return true (possible).
    // Agar kam hai → return false.
    public static boolean canCookAll(int [] ranks , int paratha , int time)
    {
        int countparatha = 0 ;
        for(int i = 0 ; i < ranks.length ; i++)
        {
            countparatha += paranthasByCook(ranks[i] , time) ;
        }
        return countparatha >= paratha ;
    }

    // Ye function batata hai ki ek cook rank R ke saath time minutes me kitne paranthas bana sakta hai.
    //Pehla parantha → R min, dusra → 3R total min, teesra → 6R total min …
    //Jab tak total time ≤ allowed time, parantha count badhaate raho.
    public static int paranthasByCook(int rank, int time) 
    {
        int count = 0;   // total paranthas banae
        int paratha = 1;       // parantha number
        int currTime = rank; // pehla parantha banane ka time

        // Jab tak cook ke pass time hai, paranthas add karte jao
        while (currTime <= time) {
            count++;    // ek aur parantha ban gaya
            paratha++;
            currTime = rank * (paratha * (paratha + 1) / 2); // total time paranthas ke liye
        }
        return count; // total paranthas jo ye cook bana sakta hai
    }

}
