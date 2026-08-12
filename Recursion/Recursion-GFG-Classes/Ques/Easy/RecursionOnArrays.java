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
    }
    static void printArray(int[] arr , int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]);
        printArray(arr,idx+1);
    }
}
