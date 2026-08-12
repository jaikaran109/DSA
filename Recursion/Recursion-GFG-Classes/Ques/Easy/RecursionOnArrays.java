package Recursion.Raghav;
import java.util.*;
public class RecursionOnArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        printArray(arr,0);


        System.out.println("Check present Or Not :--- " + check(arr,7,0));


    }

    static boolean check(int[] arr , int target , int idx){
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return check(arr,target,idx+1);
    }

    static void printArray(int[] arr , int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx] + " ");
        printArray(arr,idx+1);
        System.out.println();
        System.out.print(arr[idx] + " "); // reverse order
    }
}
