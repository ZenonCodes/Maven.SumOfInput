/**
 * Prompts user to input a number and then prints the sum of numbers 1 - n.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + number + " is " + sum);


    }
}
