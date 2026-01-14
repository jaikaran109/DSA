package Methods;


//Write a function that takes in age as input and returns if that person is eligible
//to vote or not. A person of age > 18 is eligible to vote.


import java.util.*;

public class vote {
    static boolean eligible(int age) {
        return age > 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(eligible(age) ? "Eligible" : "Not Eligible");
    }
}
