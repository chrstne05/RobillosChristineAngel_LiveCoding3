/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robillos_problem3;
import java.util.Scanner;
/**
 *
 * @author ROBILLOS_CPE113
 */
public class Robillos_Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
import java.util.Scanner;

public class LastName_Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
        } else {
            int[] values = new int[size];

            //elements of the array
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                values[i] = input.nextInt();
            }

            // Display the results
            System.out.println("Array Sum: " + arraySum(values, 0));
            System.out.println("Largest Element: " + findMaximum(values, 0));
            System.out.println("Number of Even Elements: " + countEven(values, 0));
        }

    }

    //method to calculate to calculate the sum of array
    public static int arraySum(int[] values, int index) {

        // Base case
        if (index == values.length) {
            return 0;
        }

        // Recursive case
        return values[index] + arraySum(values, index + 1);
    }

    //method to find the largest element
    public static int findMaximum(int[] values, int index) {

        // Base case
        if (index == values.length - 1) {
            return values[index];
        }

        // Recursive case
        int maximum = findMaximum(values, index + 1);

        if (values[index] > maximum) {
            return values[index];
        } else {
            return maximum;
        }
    }

    //method to count even numbers
    public static int countEven(int[] values, int index) {

        // Base case
        if (index == values.length) {
            return 0;
        }

        // Recursive case
        if (values[index] % 2 == 0) {
            return 1 + countEven(values, index + 1);
        } else {
            return countEven(values, index + 1);
        }
    }
}
