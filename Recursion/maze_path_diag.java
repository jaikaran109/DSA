import java.util.Scanner;

public class maze_path_diag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int r = sc.nextInt() ; 
        int c = sc.nextInt() ; 
        sc.close();
        int currR = 0 ; 
        int currC = 0 ; 
        
        System.out.print("\n"+pathdiag(r-1, c-1, currR, currC , "" ));
    }

    public static int pathdiag(int r, int c, int currR, int currC ,String ans ) 
    {
        if(currC == c && currR == r)
        {
            System.out.print(ans+" ");
            return 1 ; 
        }
        if(currC > c || currR > r)
        {
            return 0 ; 
        }
        int verti = pathdiag(r, c, currR+1, currC, ans+"V") ; 
        int hori = pathdiag(r, c, currR, currC+1, ans+"H") ; 
        int diag = pathdiag(r, c, currR+1, currC+1, ans+"D") ; 
        return hori + diag + verti ; 
    }
}
