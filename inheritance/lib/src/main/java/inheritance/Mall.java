package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Mall {
    private String name;
    private int numberOfStars;
private List<Review>customersReviews=new ArrayList<>();
    public Mall(String name, int numberOfStars) {
        this.name = name;
        this.numberOfStars = numberOfStars;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public List<Review> getCustomersReviews() {
        return customersReviews;
    }
  public void addReview(Review review){

        customersReviews.add(review);
        double rate =this.numberOfStars;
        for(Review rateStar:customersReviews){
            rate+=rateStar.getNumberOfStars();
            this.numberOfStars= (int) (rate/(customersReviews.size()+1));
        }
        System.out.println("The Rate of  "+this.name+" "+review.getClass().getSimpleName()+" is "+this.numberOfStars);

  }

    @Override
    public String toString() {
        return "Mall{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                '}';
    }
}
