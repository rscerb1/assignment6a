import java.util.Scanner;

public class Client {
    public static void main(String[] args){

        DinnerOrder dinnerOrder = new DinnerOrder();
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        String selection;
        boolean loop = true;
        Menu menu = Menu.getInstance(); // get instance of singleton class menu

        while(loop) {
            menu1();
            selection = scanner.nextLine();

            switch (selection) {
                case "0": // set loop boolean to false to escape method
                    loop = false;
                    System.out.println("Goodbye");
                    break;
                case "1":
                    dinnerOrder.setCommand(new DisplayMenuCommand());
                    dinnerOrder.submitCommand();
                    System.out.println("\nPress enter to return to options.");
                    scanner.nextLine();
                    break;
                case "2":
                    dinnerOrder.setCommand(new DisplayMenuCommand());
                    dinnerOrder.submitCommand();
                    System.out.println("Enter the numbers to the left of items you would like to add to your order in a comma separated list");
                    Scanner orderScanner = new Scanner(System.in);
                    order.addToOrder(orderScanner.next());
                    orderScanner.nextLine();
                    break;
                case "3":
                    dinnerOrder.setCommand(new SubmitOrderCommand(order));
                    break;
                default:
                    System.out.println("You entered an incorrect option, try again.");

            }
        }
    }

    static void menu1(){
        System.out.println("""
                To select an option, enter the number to the left of the option.
                0) Exit Program
                1) Display Menu
                2) Order Entrees
                3) -
                """);
    }

}
