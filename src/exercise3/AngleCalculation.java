package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class AngleCalculation{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double w = input.nextDouble();
        char ch = input.next().charAt(0);

   do{
        if(ch == 'r') {
        double d = w / Math.PI * 180;
        System.out.println("Angle: " + d + "d");

  } else{
        double r = w * Math.PI / 180;
        System.out.println("Angle: " + r + "r");
      }
      ch = input.next().charAt(0);

   } while(ch == 'r' || ch == 'd');       
        }
  
}