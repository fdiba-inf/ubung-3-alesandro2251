package exercise3;

import java.util.Scanner;

public class PrimeNumber{

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     int n = input.nextInt();
        boolean prime = true;
        boolean prime2= false;
        int a = 2;
        while(n>2) {
            if (a <= n / 2) {
                a++;
                System.out.println("Prime number: " + prime2);
                break;
            }else{
                System.out.println("Prime number: " + prime);
                break;
            }
        }


    }
}