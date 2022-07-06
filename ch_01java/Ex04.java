import java.util.Scanner;

public class Ex04 {

    public static void main(String args[]){
        
        int sum = 0;
    Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a number ");

       int n = scanner.nextInt();
       System.out.println("Result :");

       for(int i = 1; i <= n; i++){

        sum += i;

        System.out.println(sum);
            

       }

    
}
}