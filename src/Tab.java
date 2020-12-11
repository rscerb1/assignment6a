import java.util.ArrayList;

public class Tab {
    private ArrayList<MenuItem> tabList;

    // constructor
    public Tab(){tabList = new ArrayList<MenuItem>();}

    public void addToTab(MenuItem entree){
        tabList.add(entree);
    }

    public void displayTab(){

    }
}
