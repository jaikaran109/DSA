import java.util.*;
public class SelectionSort {
    static int[] selectionSort(int[] arr) {
        // Selection Sort (minimum element ko beginning me le ja rahe hain)
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // find minimum element index from i to end
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // swap minimum element with current index
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int[] ans = selectionSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}

// Time Complexity - N*(N+1) / 2 ==> O(N^2)