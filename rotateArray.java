package DSA;
import java.util.*;
public class rotateArray {

    public static void reverse (int arr[], int start, int end){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;  
        } 
    }

    public static void leftRotate(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        
        reverse(arr, 0, d - 1); // Reverse the first d elements
        reverse(arr, d, n - 1); // Reverse the remaining d elements
        reverse(arr, 0, n - 1); // Reverse the entire array
    }

    public static void rightRotate(int arr[] , int d) {
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, n - 1); // Reverse the entire array
        reverse(arr, 0, d - 1); // Reverse the first d elements
        reverse(arr, d, n - 1); // Reverse the remaining d elements
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] original = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(original));

        int[] leftArr = Arrays.copyOf(original, original.length);
        int[] rightArr = Arrays.copyOf(original, original.length);

        leftRotate(leftArr, d);
        System.out.println("\nLeft Rotated Array:");
        System.out.println(Arrays.toString(leftArr));

        // Right Rotation
        rightRotate(rightArr, d);
        System.out.println("\nRight Rotated Array:");
        System.out.println(Arrays.toString(rightArr));
    }
}
