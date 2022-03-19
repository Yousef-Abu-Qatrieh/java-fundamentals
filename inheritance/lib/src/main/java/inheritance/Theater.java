package inheritance;


import java.util.HashSet;
import java.util.Set;

public class Theater extends Mall {
  private Set<String> movieList=  new HashSet<>();

    public Theater(String name, int numberOfStars) {
        super(name, numberOfStars);
    }

    public void addMovie(String nameOfMovie){
       if(movieList.contains(nameOfMovie)){
           System.out.println("Movie already Exist");
       }else {
           movieList.add(nameOfMovie);
       }

    }
    public void removeMovie(String nameOfMovie){
        if(movieList.contains(nameOfMovie)){
            movieList.remove(nameOfMovie);
        }
        else {
            System.out.println(nameOfMovie+" doesn't exist");
        }
    }

    @Override
    public String toString() {
        return "Theater{" +
                "Name="+super.getName()+'\''+

                "Rate"+super.getNumberOfStars()+'\''+
                "movieList=" + movieList +
                '}';
    }
}
