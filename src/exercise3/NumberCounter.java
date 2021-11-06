package exercise3;
import java.util.Scanner;

public class NumberCounter{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     int a = input.nextInt();
        int positive = 0;
        int negative = 0;
        double sum = 0;
        double avr = 0;

        while (a != 0) {
            if (a > 0) {
                positive++;
            } else {
                negative++;
            }

            sum = sum + a;
            a = input.nextInt();
            avr = sum / (positive + negative);
            System.out.println("Positive numbers: " + positive);
            System.out.println("Negative numbers: " + negative);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avr);
        }
    }
}