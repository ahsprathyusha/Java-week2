import java.text.DecimalFormat;

public class Ex07_SevensNotFives {

    public static void main(String[] args){

      
      
        String separator = " ";

       
        for (int i=2000; i<=3200; i++ )
         
         {
            if((i%7==0) && (i%5!=0) ){
               
                System.out.printf(separator + "%d", i);
                separator =",";

            }//if

         } //for



    } //main
    
    
}//class
