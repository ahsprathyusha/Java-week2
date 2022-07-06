import java.util.Scanner;

public class Ex02_CountToN {

    public static void main(String[] args){
      //Ask what number to print

      Scanner s = new Scanner(System.in);
      System.out.println("Enter a number to count to: ");

      int max = s.nextInt();

      System.out.println("Now counting...");

      for(int i=0; i<=max; i++){

        System.out.println(i);
      }

   }
}

    
