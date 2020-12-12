import java.util.Scanner;

// Singleton implementation of UI since only one needs to exist

// This class is responsible for running a user interface with selectable options.
// The user interface is a looped switch statement that returns a ICommand upon selection.
public class UI {

    // singleton stuff
    private static final UI singleton = new UI();
    private UI(){}
    public static UI getInstance(){return singleton;}

    // method that controls the UI
    public ICommand startUI(){
        Scanner sc = new Scanner(System.in); // scanner to read user input
        int selection; // int to store input from scanner

        // loop that prints options, reads input, then runs switch
        // escapes through method returns in cases
        while(true){
            System.out.println("""
                    To select an option, enter the number to the left of the option.
                    0) Exit Program
                    1) Display Menu
                    2) -
                    3) -
                    """);

            selection = sc.nextInt(); // read user input selection

            // switch to choose which ICommand to return
            switch (selection){
                case 0: // set loop boolean to false to escape method
                    return null;
                case 1:
                    return new DisplayMenuCommand();
                case 2:
                    //asdf
                    break;
                case 3:
                    //asdf
                    break;
                default:
                    System.out.println("You entered an incorrect option, try again.");
            }
        }
    }
}
