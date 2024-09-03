// Strategy Interface
interface Strategy {
    void execute();
}

// Concrete Strategy A
class ConcreteStrategyA implements Strategy {
    public void execute() {
        System.out.println("Executing Strategy A");
    }
}

// Concrete Strategy B
class ConcreteStrategyB implements Strategy {
    public void execute() {
        System.out.println("Executing Strategy B");
    }
}

// Context
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.execute();
    }
}

// Client code
public class StrategyExample {
    public static void main(String[] args) {
        Context context = new Context();

        Strategy strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.executeStrategy();

        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.executeStrategy();
    }
}
