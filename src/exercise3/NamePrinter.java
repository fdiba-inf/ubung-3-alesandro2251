package exercise3;

import java.util.Scanner;

public class NamePrinter {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        String a = input.nextLine();

        for(int i = 0; i < a.length(); i++){
          System.out.println("* " + a.charAt(i) + " *");
        }

    }

}