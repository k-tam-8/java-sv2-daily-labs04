package day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private int releaseDate;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int releaseDate) {
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }

    public int actorsInTheirTwenties(){
        int actors20s=0;
        for (Actor i : actors) {
            if (this.releaseDate-i.getBirthYear()>19 && this.releaseDate-i.getBirthYear()<30) {
                actors20s++;
            }
        }
        return actors20s;
    }
}
