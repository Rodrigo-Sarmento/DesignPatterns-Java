// State Interface
interface State {
    void doAction(Context context);
}

// Concrete State A
class ConcreteStateA implements State {
    public void doAction(Context context) {
        System.out.println("State A");
        context.setState(this);
    }
}

// Concrete State B
class ConcreteStateB implements State {
    public void doAction(Context context) {
        System.out.println("State B");
        context.setState(this);
    }
}

// Context
class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}

// Client code
public class StateExample {
    public static void main(String[] args) {
        Context context = new Context();

        State stateA = new ConcreteStateA();
        stateA.doAction(context);
        System.out.println("Current State: " + context.getState().getClass().getName());

        State stateB = new ConcreteStateB();
        stateB.doAction(context);
        System.out.println("Current State: " + context.getState().getClass().getName());
    }
}
