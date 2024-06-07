package command_design;
//invoker
public class Remote_Control {
    private  Command command;


    public void pressButton(){
        command.execute();
    }
}
