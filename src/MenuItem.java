public class MenuItem {
    private String name;
    private String description;
    private double price;

    // constructor with no parameters
    public MenuItem(){}

    // constructor with parameters to initialize instance variables
    public MenuItem(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // getters
    String getName(){return name;}
    String getDescription(){return description;}
    double getPrice(){return price;}

    // setters
    public void setName(String name){this.name = name; }
    public void setDescription(String description){this.description = description; }
    public void setPrice(double price){this.price = price; }
}
