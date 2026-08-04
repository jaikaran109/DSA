import java.util.*;

public class reverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int ans = 0;

        System.out.println(reverse(n, ans));
    }

    static int reverse(int n, int ans) {
        if(n == 0) return ans;

        return reverse(n / 10, ans * 10 + n % 10);
    }
}


// n	    ans
// 1234	    0
// 123	    4
// 12	    43
// 1	    432
// 0	    4321
