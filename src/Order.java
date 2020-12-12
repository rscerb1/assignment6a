import java.util.ArrayList;

public class Order {
    private final ArrayList<Integer> orderedItems; // array list of the item numbers picked from the menu

    // constructor
    public Order(){orderedItems = new ArrayList<Integer>(); }


    // getter for array list of ordered items
    public ArrayList<Integer> getOrder(){return this.orderedItems; }

    //  method to add an item to the ordered items array list
    public void addToOrder(int itemNumber){orderedItems.add(itemNumber);}

    // method to submit the ordered items. returns a new tab
    public Tab submitOrder(){return new Tab(this.orderedItems); }

}
