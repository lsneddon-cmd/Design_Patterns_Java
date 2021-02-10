package Behavioural.State;

public class FanHighState implements State {
    private Fan fan;

    public FanHighState(Fan fan) {
        this.fan = fan;
    }
    @Override
    public State handleRequest() {
        System.out.println("Turning fan off.");
        return new FanOffState(fan);
    }

    @Override
    public String toString() {
        return "Fan is on high.";
    }
}
