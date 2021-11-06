package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

       do{
         if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println ("Values are not correct!");

          } else {
          double  p = (a + b + c) / 2;
           double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Area: " + s);

            if (a == b && a == c) {
              System.out.println("Triangle: equilateral");

            }  else if (a == b && a != c) {
                System.out.println("Triangle: isosceles");

             }   else if ( a == c && a != b) {
                  System.out.println("Triangle: isosceles");

              }    else if (c == b && c != a) {
                    System.out.println("Triangle: isosceles");

              } else {
                System.out.println("Triangle: scalene");

            }
         }
       } while (a > 0 && b > 0 && c > 0);
        }
}