import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int test = sc.nextInt() ; 
        while(test > 0)
        {
            // ticket ke 4 cost input lo
            int c1 = sc.nextInt();   // ek ride ka cost
            int c2 = sc.nextInt();   // ek vehicle pe unlimited rides
            int c3 = sc.nextInt();   // saare rickshaw ya saare cab pe unlimited rides
            int c4 = sc.nextInt();   // sabhi rickshaw + sabhi cab unlimited rides

            int num_rickshaw = sc.nextInt() ; 
            int num_cab = sc.nextInt() ;
            
            int[] rickshaw = new int[num_rickshaw] ; 
            int[] cab = new int[num_cab] ;

            for (int i = 0; i < rickshaw.length; i++) {
                rickshaw[i] = sc.nextInt() ;
            }
            for (int i = 0; i < cab.length; i++) {
                cab[i] = sc.nextInt() ;
            }
            System.out.println(minimum_sum(rickshaw, cab, c1,c2,c3,c4)); ;

            test-- ;
        }
        sc.close();
    }

    public static int minimum_sum(int[] rickshaw , int[] cab , int c1, int c2 , int c3, int c4)
    {
        // har rickshaw ke liye decide karo:
        // ya to per-ride cost lo (ai*c1) ya unlimited us rickshaw ke liye (c2)
        int cost_rickshaw = 0 ; 
        for (int i = 0; i < rickshaw.length; i++) 
        {
            cost_rickshaw += Math.min(rickshaw[i] * c1, c2) ; 
        }

         // ab compare karo: saare rickshaw ka sum ya c3 (all rickshaw unlimited)
        cost_rickshaw = Math.min(cost_rickshaw, c3) ;


        // same for cab
        int cost_cab = 0 ; 
        for (int i = 0; i < cab.length; i++) 
        {
            cost_cab += Math.min(cab[i] * c1, c2) ;
        }
        cost_cab = Math.min(cost_cab, c3) ;

        // total cost = rickshaw + cab
        int total = cost_cab + cost_rickshaw; 

        // compare karo global unlimited ticket ke saath (c4)
        return Math.min(total, c4);
    }
}
