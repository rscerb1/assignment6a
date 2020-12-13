//import java.util.Scanner;
//
//// Singleton implementation of UI since only one needs to exist
//
//// This class is responsible for running a user interface with selectable options.
//// The user interface is a looped switch statement that returns a ICommand upon selection.
//static class UIold {
//
//}
//
//
// singleton stuff
//    private static final UIold singleton = new UIold();
//    private UIold(){}
//    public static UIold getInstance(){return singleton;}
//
//    // method that controls the UI
//    public ICommand startUI(){
//        Scanner sc = new Scanner(System.in); // scanner to read user input
//        int selection; // int to store input from scanner
//
//        // loop that prints options, reads input, then runs switch
//        // escapes through method returns in cases
//        while(true){
//
//
//            selection = sc.nextInt(); // read user input selection
//
//            // switch to choose which ICommand to return
//            switch (selection){
//                case 0: // set loop boolean to false to escape method
//                    return null;
//                case 1:
//                    return new DisplayMenuCommand();
//                case 2:
//                    Order order =
//                    return new DisplayTabCommand();
//                case 3:
//                    //asdf
//                    break;
//                default:
//                    System.out.println("You entered an incorrect option, try again.");
//            }
//        }
//    }