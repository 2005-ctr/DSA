/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Submission_5;

import java.util.Arrays;

/**
 *
 * @author Ramindi
 */
public class OptimizedInsertionSort {
    public static void optimizedInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int position = binarySearch(array, key, 0, i - 1);

            for (int j = i - 1; j >= position; j--) {
                array[j + 1] = array[j];
            }

            array[position] = key;
        }
    }

    private static int binarySearch(int[] array, int key, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] <= key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 5, 1, 4, 3};
        optimizedInsertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

}
