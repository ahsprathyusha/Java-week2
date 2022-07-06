import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Ex03_MultiplesOfThree {

    public static void main(String[] args)
    
    {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a number ");

       int max = s.nextInt();
       System.out.println("Multiples of 3 :" );

       for(int count = 0; count <= max; count++)
      {

        
         if(count % 3==0)
         {
            
            System.out.println(count);
    
    

    }
    
}
    }

}