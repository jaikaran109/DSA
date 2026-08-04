import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        // Using Loop
        // int ans = 0;
        // for(int i = 1 ; i <= n ; i++){
        //     ans += i;
        // }
        // System.out.print(ans);
        
        System.out.print(sum(n));
    }
    
    static int sum(int n){
        if(n == 0) return 0;
        return n + sum(n - 1);
    }
}
