package com.company;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        // Create an array with 10 randomly chosen integers
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Random integers between 0 and 99
        }

        // Print the array for reference
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Prompt the user to enter the index of the array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array (0-9): ");

        try {
            int index = scanner.nextInt();
            // Display the corresponding element value
            System.out.println("Element at index " + index + ": " + array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Display the message if the specified index is out of bounds
            System.out.println("Out of Bounds");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Invalid input. Please enter an integer between 0 and 9.");
        }

//        scanner.close();
    }
}
