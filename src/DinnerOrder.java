public class DinnerOrder {
    private Menu dinnerMenu;
    private ICommand slot;

    // constructor
    public DinnerOrder(){this.dinnerMenu = new Menu(); }

    public void start(){
        UI userInterface = UI.getInstance(); // get singleton implementation of UI
        setCommand(userInterface.startUI()); // run the UI and store the return value in slot
        submitCommand(); // run the command in slot

    }

    public void setCommand(ICommand ICommand){slot = ICommand; }

    public void submitCommand(){slot.execute(); }

}
