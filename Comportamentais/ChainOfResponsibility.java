// Handler
abstract class Handler {
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handleRequest(int request);
}

// Concrete Handler 1
class ConcreteHandler1 extends Handler {
    public void handleRequest(int request) {
        if (request < 10) {
            System.out.println("ConcreteHandler1 handled request " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

// Concrete Handler 2
class ConcreteHandler2 extends Handler {
    public void handleRequest(int request) {
        if (request >= 10) {
            System.out.println("ConcreteHandler2 handled request " + request);
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}

// Client code
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setSuccessor(handler2);

        handler1.handleRequest(5);
        handler1.handleRequest(15);
    }
}
