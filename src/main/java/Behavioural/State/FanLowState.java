package Behavioural.State;

public class FanLowState implements State {
    private Fan fan;

    public FanLowState(Fan fan) {
        this.fan = fan;
    }
    @Override
    public State handleRequest() {
        System.out.println("Turning fan to medium.");
        return new FanMedState(fan);
    }

    @Override
    public String toString() {
        return "Fan is on low.";
    }
}
