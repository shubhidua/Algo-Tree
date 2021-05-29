
/*
Problem Statement- Perform pancake sorting in java.
Algorithm-The idea behind this algorithm is somewhat like of selection sort.
We one by one place the maximum element in array at the last position and decrease
the array length by 1.

Steps-
1) Find the index of maximum element in given array.
2) call flip(array,index_of_max_element) and it will reverse array from 0 to index_of_max_element
3) recursively call flip while array.length>1.

Time Complexity-O(n^2)

*/

import java.util.*;

public class PancakeSort {
    static void flip(int arr[], int i) {
        int temp, start = 0;
        while (start < i) {
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }

    static int findMax(int arr[], int n) {
        int mi, i;
        for (mi = 0, i = 0; i < n; ++i)
            if (arr[i] > arr[mi])
                mi = i;
        return mi;
    }

    static int pancakeSort(int arr[], int n) {
        for (int curr_size = n; curr_size > 1; --curr_size) {
            int mi = findMax(arr, curr_size);
            if (mi != curr_size - 1) {
                flip(arr, mi);
                flip(arr, curr_size - 1);
            }
        }
        return 0;
    }

    static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        pancakeSort(a, n);
        System.out.println("Sorted Array: ");
        printArray(a, n);
        sc.close();
        return;
    }
}
/*
 * Example 1- Enter length of array 6 79 54 3 68 12 0 Sorted Array: 0 3 12 54 68
 * 79
 * 
 * 
 * 
 * Example 2- Enter length of array 8 90 70 60 50 40 30 20 10 Sorted Array: 10
 * 20 30 40 50 60 70 90
 */