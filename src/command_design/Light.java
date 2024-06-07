package command_design;

public class Light {
    private boolean turnedOn;

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }
    public void turnOn(){
        this.turnedOn=true;
        System.out.println("light is now turned on");
    }
}
