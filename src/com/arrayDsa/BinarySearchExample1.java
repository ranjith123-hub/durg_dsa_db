package com.arrayDsa;

import java.util.Arrays;
import java.util.Scanner;
// for Binary Search array must be sorted
// Binary Search is a searching algorithm that finds the position of a target
// value within a sorted array.
// It compares the target value to the middle element of the array.
// If they are not equal, the half in which the target cannot lie is eliminated
// and the search continues on the remaining half until it is successful.
// The time complexity of binary search is O(log n) and the space complexity is O(1).
// Binary Search is more efficient than linear search for large arrays.
// Binary Search can be implemented using recursion or iteration.
// Binary Search is a divide and conquer algorithm.
// Binary Search is used in many applications such as searching in a sorted array,
// searching in a sorted linked list, searching in a binary search tree, etc.
// Binary Search is a very important algorithm in computer science and is used in many applications.
public class BinarySearchExample1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int taget = scn.nextInt();
        Arrays.sort(arr);
        System.out.println("Array after sorting: ");
        for (int num:arr){
            System.out.print(num+" ");
        }
        int index = binarySearch(arr, taget);
        System.out.println("\n"+"Element " + taget + " is found at index: " + index);
        System.out.println("==========================================================");
        System.out.println(binarySearchRecursion(arr, taget, 0, arr.length - 1));
    }
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        // this one is iterative approach
        while (low <= high) {
            int midIndex = low + (high - low) / 2;
            if (arr[midIndex] == target) {
                return midIndex;
            } else if (arr[midIndex] < target) {
                low = midIndex + 1;
            } else {
                high = midIndex - 1;
            }
        }
        return  -1;
    }
    // Binary seearch by recursion approach
    public static int binarySearchRecursion(int[] arr, int target,int low,int high) {
        int midIndex = low + (high - low) / 2;
        if (low <= high) {
            if (arr[midIndex] == target) return midIndex;
                if (arr[midIndex] < target) return binarySearchRecursion(arr, target, midIndex + 1, high);
                else return binarySearchRecursion(arr, target, low, midIndex - 1);

        }
        return -1;
    }


}
