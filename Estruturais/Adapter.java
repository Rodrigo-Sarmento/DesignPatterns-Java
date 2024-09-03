// Target Interface
interface Target {
    void request();
}

// Adaptee
class Adaptee {
    void specificRequest() {
        System.out.println("Specific request");
    }
}

// Adapter
class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}

// Client code
public class AdapterExample {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
