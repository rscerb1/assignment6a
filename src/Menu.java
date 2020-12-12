import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuList; // arrayList of menuItems

    // constructor
    public Menu() {
        menuList = new ArrayList<MenuItem>(); // initialize menuList
        fillMenu();
    }

    // method to print out the formatted menu
    public void displayMenu(){
        System.out.printf("%-25s%-11s%s\n", "Entree:", "Price:", "Description:");
        for (MenuItem temp : menuList)
            System.out.printf("%-25s%2.2f\t\t%s\n", temp.getName(), temp.getPrice(), temp.getDescription());
    }

    // Method to fill the menu
    // Normally this would take input from a file but I didn't feel that was needed in this demo
    private void fillMenu(){
        menuList.add(new MenuItem("Steak Dinner", "Porterhouse and Baked Potato", 20.99));
        menuList.add(new MenuItem("Blackened Salmon", "Blackened Salmon and Wild Rice", 22.99));
        menuList.add(new MenuItem("Ahi Tacos", "Four Ahi Tuna Tacos with a Pineapple and Lime Sauce", 16.99));
        menuList.add(new MenuItem("Bacon Cheese Burger", "Angus Beef 1/4 Pounder with Fries", 17.99));
        menuList.add(new MenuItem("Chefs Salad", "Arugula and Kale Salad with Egg and Tofu", 14.99));
    }
}
