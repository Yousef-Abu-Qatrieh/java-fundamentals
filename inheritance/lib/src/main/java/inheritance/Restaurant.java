package inheritance;



public class Restaurant extends Mall {
    private String name;
    private int numberOfStars;
    private String priceCategory;

    public Restaurant(String name, int numberOfStars, String priceCategory) {
        super(name,numberOfStars);

        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }
//    public void addReview(Review review){
//        List<Review>reviews=new ArrayList<>();
//        reviews.add(review);
//        double rate =this.numberOfStars;
//        for(Review rateStar:reviews){
//            rate+=rateStar.getNumberOfStars();
//            this.numberOfStars= (int) (rate/(reviews.size()+1));
//        }
//        System.out.println("The Rate of this Restaurant "+review.getClass().getSimpleName()+" is "+this.numberOfStars);
//    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + super.getName() + '\'' +
                ", numberOfStars=" + super.getNumberOfStars() +
                ", priceCategory='" + priceCategory + '\'' +
                '}';
    }


}
