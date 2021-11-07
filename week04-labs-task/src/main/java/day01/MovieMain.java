package day01;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Jaws",1975);
        Movie movieTwo = new Movie("Halloween", 1970);
        Actor actor = new Actor("Roy Scheider",1950);
        movie.addActor(actor);
        System.out.println(movie.actorsInTheirTwenties());
    }
}
