import java.util.Scanner;

public class Ex08_Factorials {
    
/**
 * @param args
 */
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter Number");

    
    int fact = input.nextInt();

    int fact1 = fact; 

    for(int i=1; i<fact1; i++ )
    
    {
 
        fact = fact * i;

    } //for

 
 
System.out.println("Factorial of the number is: "+fact);
}

}