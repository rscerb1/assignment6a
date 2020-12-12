public class DisplayMenuCommand implements ICommand{

    Menu menu = new Menu(); // create a menu object

    // run displayMenu for the menu object
    @Override
    public void execute() {menu.displayMenu(); }

    // there isn't an undo for printing
    @Override
    public void unexecute() {}
}
