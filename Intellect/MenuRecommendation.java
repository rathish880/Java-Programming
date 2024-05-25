package Intellect;

import java.util.HashMap;
import java.util.Map;

public class MenuRecommendation implements IMenuRecommendation{

   Map<Integer, MenuItem> menuItems;
    
    public MenuRecommendation() {
        menuItems = new HashMap<>();
    }

    @Override
    public void addItem(int itemId, String displayName) {
        menuItems.put(itemId, new MenuItem(itemId, displayName));
    }
    
    @Override
    public MenuItem getRecommendedItem() {

        double maxRating = -1;
        MenuItem recommendedItem = null;
        
        for (MenuItem item : menuItems.values()) {
            if (item.inStock) {
                if (item.isDealOfTheDay) {
                    return item;
                }
                
                if (item.averageRating > maxRating || (item.averageRating == maxRating && item.totalRatings > recommendedItem.totalRatings)
                    || (item.averageRating == maxRating && item.totalRatings == recommendedItem.totalRatings && item.displayName.compareTo(recommendedItem.displayName) < 0)
                    || (item.averageRating == maxRating && item.totalRatings == recommendedItem.totalRatings && item.displayName.compareTo(recommendedItem.displayName) == 0 && item.itemId < recommendedItem.itemId)) {
                    recommendedItem = item;
                    maxRating = item.averageRating;
                }
            }
        }
        
        return recommendedItem;
    }
    
    @Override
    public void outOfStockItem(int itemId) {
        if (menuItems.containsKey(itemId)) {
            menuItems.get(itemId).inStock = false;
            menuItems.get(itemId).isDealOfTheDay = false;
        }
    }
    
    @Override
    public void restockItem(int itemId) {
        if (menuItems.containsKey(itemId)) {
            menuItems.get(itemId).inStock = true;
        }
    }
    
    @Override
    public void makeDealOfTheDayItem(int itemId) {
        if (menuItems.containsKey(itemId)) {
            menuItems.get(itemId).isDealOfTheDay = true;
        }
    }
    
    @Override
    public void rateItem(int itemId, int rating) {
        if (menuItems.containsKey(itemId)) {
            MenuItem item = menuItems.get(itemId);
            item.totalRatings++;
            item.averageRating = (item.averageRating * (item.totalRatings - 1) + rating) / item.totalRatings;
        }
    }


    public static void main(String[] args) {
        MenuRecommendation menu = new MenuRecommendation();
        System.out.println(menu.getRecommendedItem()); 
        menu.addItem(1, "Item1");
        menu.rateItem(1, 5);
        System.out.println(menu.getRecommendedItem()); 
        menu.outOfStockItem(1);
        menu.rateItem(1, 4);
        menu.rateItem(1, 4);
        System.out.println(menu.getRecommendedItem()); 
    }    
}
