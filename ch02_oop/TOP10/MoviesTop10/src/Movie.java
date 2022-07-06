public class Movie {

    Integer movierank;
    String title;
    String director;
    Integer rottentomatoscore ;
    public Integer rank;
    public Movie(Integer movierank, String title, String director, Integer rottentomatoscore) {
        this.movierank = movierank;
        this.title = title;
        this.director = director;
        this.rottentomatoscore = rottentomatoscore;
    
    
}
    public Integer getMovierank() {
        return movierank;
    }
    public void setMovierank(Integer movierank) {
        this.movierank = movierank;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public Integer getRottentomatoscore() {
        return rottentomatoscore;
    }
    public void setRottentomatoscore(Integer rottentomatoscore) {
        this.rottentomatoscore = rottentomatoscore;
    }
    @Override
    public String toString() {
        return "Movie [director=" + director + ", movierank=" + movierank + ", rottentomatoscore=" + rottentomatoscore
                + ", title=" + title + "]";
    }

    
    
}
