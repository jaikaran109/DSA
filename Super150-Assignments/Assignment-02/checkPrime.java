// Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

// Input Format

// Constraints

// 2<N<1000000000

// Output Format

// Sample Input

// 3

// Sample Output

// Prime

// Explanation

// The output is case specific


import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 2 ; i < n ; i++){
            if(n % i == 0){
                System.out.print("Not Prime");
                return ;
            }
        }
        System.out.print("Prime");
    }
}
