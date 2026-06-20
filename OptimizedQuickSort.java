/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Submission_6;

import java.util.Arrays;

/**
 *
 * @author Ramindi
 */
public class OptimizedQuickSort {
    public static void quickSort(int[] array, int low, int high) {
        while (low < high) {
            int pivotIndex = medianOfThreePartition(array, low, high);

            if (pivotIndex - low < high - pivotIndex) {
                quickSort(array, low, pivotIndex - 1);
                low = pivotIndex + 1;
            } else {
                quickSort(array, pivotIndex + 1, high);
                high = pivotIndex - 1;
            }
        }
    }

    private static int medianOfThreePartition(int[] array, int low, int high) {
        int middle = (low + high) / 2;

        if (array[middle] < array[low]) {
            swap(array, low, middle);
        }
        if (array[high] < array[low]) {
            swap(array, low, high);
        }
        if (array[high] < array[middle]) {
            swap(array, middle, high);
        }

        swap(array, middle, high);
        return partition(array, low, high);
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }

}
