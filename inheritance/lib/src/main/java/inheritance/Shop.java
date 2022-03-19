package inheritance;

public class Shop extends Mall  {
private String description;
private String priceCategory;

    public Shop(String name, int numberOfStars, String description, String priceCategory) {
        super(name, numberOfStars);
        this.description = description;
        this.priceCategory = priceCategory;
    }

    public String getDescription() {
        return description;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "Name of Shop"+ super.getName() + '\'' +
                "description='" + description + '\'' +
                ", priceCategory='" + priceCategory + '\'' +
                "Rate Of Shop"+super.getNumberOfStars() + '\'' +
                '}';
    }
}

