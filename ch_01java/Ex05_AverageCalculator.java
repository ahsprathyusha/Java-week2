import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex05_AverageCalculator{

    public static void main(String args[]){

        List <Integer> intList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter a number to add to the list: (exception)");
        String response = scanner.nextLine();
        System.out.println("Enter a new number: ");
        while(!response.equals("=")){

            //make response into a number using parseInt()
            int numResponse =Integer.parseInt(response);

           //add response as a number to list
           intList.add(numResponse);

           //Scan the next number
           response = scanner.nextLine();
           System.out.println("Enter a new number: ");
    }

}
}

    // calculate the total of all the numbers in the list
   //  System.out.println(intList);
        
      /*  double total = 0;
        int count =0;
        double average;      
        
      
        
        String userInput = input.nextLine();

        System.out.println("Enter a number");
        while (!userInput.equals("=")){
             
            double N = Double.parseDouble(userInput);
            count++;
            total += N;
        }
     */ 
      
      
    