package Behavioural.State;

public class FanOffState implements State {
    private Fan fan;

    public FanOffState(Fan fan) {
        this.fan = fan;
    }
    @Override
    public State handleRequest() {
        System.out.println("Turning fan to low.");
        return new FanLowState(fan);
    }

    @Override
    public String toString() {
        return "Fan is off.";
    }
}
