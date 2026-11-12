/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robillos_problem1;
import java.util.Scanner;
/**
 *
 * @author ROBILLOS_CPE113
 */
public class Robillos_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    
    System.out.println();
    //if the user entered a non-negative number this will pop up
    if (number < 0) {
        System.out.println("Invalid. Please enter a non-negative number.");

    } else {
        System.out.println(sumOfDigits(number));
    }
    input.close();
}

public static int sumOfDigits(int number) {

    //Base case
    if (number == 0) {
        return 0;
    }

    //Recursive case
    return (number % 10) + sumOfDigits(number / 10);
    }
    
}
