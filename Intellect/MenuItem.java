package Intellect;

public class MenuItem {

    int itemId;
    String displayName;
    boolean inStock;
    boolean isDealOfTheDay;
    double averageRating;
    int totalRatings;
    
    public MenuItem(int itemId, String displayName) {
        this.itemId = itemId;
        this.displayName = displayName;
        this.inStock = true;
        this.isDealOfTheDay = false;
        this.averageRating = 0.0;
        this.totalRatings = 0;
    }
    @Override
    public String toString() {
        return itemId + " " + displayName + " Rating: " + averageRating;
    }


    
}
