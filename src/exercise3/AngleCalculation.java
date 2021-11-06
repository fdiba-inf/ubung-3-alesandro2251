package exercise3;

import java.util.Scanner;
import java.lang.Math;

public class AngleCalculation{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double w = input.nextDouble();
        char ch = input.next().charAt(0);


        do{
          if(ch == 'r'){
             double r = (w / Math.PI * 180)*2;
            System.out.println("Angle: " + r + "d" );
          }
          else{
          double g = (w * Math.PI / 180)/2;
            System.out.println("Angle: "+ g + "r");
          }
        }while((ch == 'r')|| (ch == 'd'));
        
        }
  
}