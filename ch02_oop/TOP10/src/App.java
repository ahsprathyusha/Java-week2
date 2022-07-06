import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        
        
        ArrayList<Song> top10 = new ArrayList<Song>();
    

    top10.add(new Song(1, "Running up that hill", "Bush",  "Fish"));
    top10.add(new Song(2,"Afraid to feel", "LF System", "Warner Records" ));
    top10.add(new Song(3,"As it was","Harry styles", "Columbia"));
    top10.add(new Song(4,"Break my Soul","Beyounce","Columbia"));
    top10.add(new Song(5, "Green Green grass", "George Ezra", "Columbia"));
    top10.add(new Song(6,"Go","Cat Burns","RCA"));
    top10.add(new Song(7,"About Damn Time","Lizzo","Atlantic"));
    top10.add(new Song(8,"Massive","Drake","OVO"));
    top10.add(new Song(9,"IFTK","TION WAYNE & LA ROUX","Atlantic"));
    top10.add(new Song(10,"Late night talking","Harry Stylees","Columbia"));
    
/*     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a chart position between 1 & 10: ");
        int input = scanner.nextInt();
        System.out.println(top10.get(input));*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a chart position number between 1 and 10:");
        int i = scan.nextInt();
        if(i>0 && i<=10){
         System.out.println(top10.get(i).toString());
        }
        }

    
    
    }

