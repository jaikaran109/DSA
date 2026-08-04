import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base : ");
        int a = input.nextInt();
        System.out.println("Enter Power : ");
        int b = input.nextInt();


        System.out.println(pow(a,b));

    }


    // In Log(n)
    static int pow(int a , int b ){
        if(b == 0) return 1;
        int call = pow(a,b/2);
        if(b % 2 == 0) return call * call;
        else return a * call * call;
    }


    // In O(n)
    // static int pow(int a , int b ){
    //     if(b == 0) return 1;
    //     return a * pow(a,b-1);  // in O(n)
    // }
}
