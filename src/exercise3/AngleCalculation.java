package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class AngleCalculation{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int winkel = input.nextInt();
        double r = 0;
        double g = 0;
        char ch = input.next().charAt(0);


        do{
          if(ch == 'r'){
            r= (winkel * Math.PI)/180;
            System.out.println("Angle: " + g + ch);
          }
          else{
            g= (winkel*180)/Math.PI;
            System.out.println("Angle: "+ r + ch);
          }
        ch = input.next().charAt(0);
        }while((ch == 'r')|| (ch == 'd'));
        
        }
  
}