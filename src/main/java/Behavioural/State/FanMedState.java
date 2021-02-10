package Behavioural.State;

public class FanMedState implements State {
    private Fan fan;

    public FanMedState(Fan fan) {
        this.fan = fan;
    }
    @Override
    public State handleRequest() {
        System.out.println("Turning fan to high.");
        return new FanHighState(fan);
    }

    @Override
    public String toString() {
        return "Fan is on medium.";
    }
}
