/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robillos_problem2;
import java.util.Scanner;
/**
 *
 * @author ROBILLOS_CPE113
 */
public class Robillos_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("[,\\s]+ ");
        
        int a = input.nextInt();
        int b = input.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("Negative numbers are not allowed.");
        } else if (a == 0 && b == 0) {
            System.out.println("Undefined");
        } else {
            //result
            int answer = gcd (a,b);
            System.out.println(answer);
        }

        input.close();
    }

    public static int gcd(int a, int b) {

        //Base case
        if (b == 0) {
            return a;
        }

        //Recursive case
        return gcd(b, a % b);
    }
    
}
