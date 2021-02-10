package Behavioural.State;

public class Fan {
    State fanState;


    public Fan() {
        fanState = new FanOffState(this);
    }

    public void pullChain() {
        this.fanState = this.fanState.handleRequest();
    }

    @Override
    public String toString() {
        return fanState.toString();
    }
}
