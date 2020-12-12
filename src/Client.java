import java.util.Scanner;

public class Client {
    public static void main(String[] args){

        DinnerOrder order1 = new DinnerOrder();
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
                    order1.setCommand(new DisplayMenuCommand());
                    order1.submitCommand();
                    System.out.println("\nPress enter to return to options.");
                    scanner.nextLine();
                    break;
                case "2":
                    break;
                case "3":
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
                2) -
                3) -
                """);
    }

}
