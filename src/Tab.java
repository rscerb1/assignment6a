import java.util.ArrayList;

public class Tab {

    private double totalPrice; // the total price of all items in the order list
    private final ArrayList<MenuItem> tab; // an array list to store the

    // constructor - takes in an array or itemNumbers and pulled the corresponding MenuItem from Menu
    // then stores them in an array list (tab)
    public Tab(ArrayList<Integer> orderedItems){
        this.tab = new ArrayList<MenuItem>(); // initialize the array list

        // for every item in the order list, add the menu item of that index to the tab
        for(int item : orderedItems){
            this.tab.add(Menu.getInstance().getMenuItemFromItemNum(item));
        }
    }

    public void displayTab(){
        System.out.println(" - - - - - - - - - - Tab: - - - - - - - - - -");
        System.out.printf("%-25s%s\n", "Entree:", "Price:");
        for(MenuItem item:this.tab) {
            System.out.printf("%-25s%s\n", item.getName(), item.getPrice());
        }
        System.out.println("Total: " + this.totalPrice);
    }
}


