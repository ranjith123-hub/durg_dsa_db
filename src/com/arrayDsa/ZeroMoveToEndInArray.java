package com.arrayDsa;

import java.util.Scanner;

public class ZeroMoveToEndInArray {
    public static void moveToZerosToEnd(int[] arr) {
        int index=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!= 0) {
                arr[index] = arr[i];
                index++;

            }
        }
         // Fill remaining elements with 0
        while(index < arr.length) {
            arr[index]=0;
            index++;
        }

        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();

        }
        System.out.println("Array before moving zeros to end:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        moveToZerosToEnd(arr);
        System.out.println("\nArray after moving zeros to end: ");
        for (int i=0;i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
