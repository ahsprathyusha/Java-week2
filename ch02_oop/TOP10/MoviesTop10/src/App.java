import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie(1,"Marcel the cell with Shoes on ","Dean Fleisher",100));
        movieList.add(new Movie(2,"Fire of Love","Sara Dosa",100));
        movieList.add(new Movie(3,"Playground","Laura Wandel",100));
        movieList.add(new Movie(4,"Writing with Fire","Rintu Thomas",100));
        movieList.add(new Movie(5,"The Janes","Tia Lessin",100));
        movieList.add(new Movie(6,"Happening","Audrey Diwan",100));
        movieList.add(new Movie(7,"Navalny","Alexi Navalny",100));
        movieList.add(new Movie(8,"Poly Styrene: I am Cliche","Celeste Bell",100));
        movieList.add(new Movie(9,"The Automat","Lisa Hurtwiz",100));
        movieList.add(new Movie(10,"Who we are","Jeffery Robinson",100));

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Movie position between 1 & 10: ");
        int input = scanner.nextInt();
        System.out.println(movieList.get(input));
        
       /*  System.out.print("Choose a MOvie by top 10 position > ");
        Scanner scanner = new Scanner(System.in);

        String response = scanner.nextLine();
        Integer selectedMovie = Integer.parseInt(response);

        for(Movie movie:movieList){
            if(movie.rank == selectedMovie){
                System.out.println("You selected >>> " + movie.title + " by " + movie.director); */


    }


      }
    
    




