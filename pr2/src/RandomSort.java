import java.io.*;
import java.util.Random;
import java.util.random.RandomGenerator;
public class RandomSort {
    static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
    }

    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        Random random = new Random();
        int arr[] = new int[100];
        for (int i = 0; i <arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("a[" + i + "] = " + arr[i]);
        }
        int n = arr.length;
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}

