package exercise3;

import java.util.Scanner;

public class PrimeNumber{

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     int n = input.nextInt();

        for (int a = 2; a <= n / 2; a++) {
            if (n % a == 0) {
                System.out.println("Prime number: " + false);
                break;
            } else {
                System.out.println("Prime number: " + true);
                break;
            }
        }


    }
}
