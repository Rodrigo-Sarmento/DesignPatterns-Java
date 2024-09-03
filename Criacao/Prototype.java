abstract class Prototype implements Cloneable {
    abstract Prototype clonePrototype();

    abstract void show();
}

class ConcretePrototype1 extends Prototype {
    public Prototype clonePrototype() {
        return new ConcretePrototype1();
    }

    public void show() {
        System.out.println("ConcretePrototype1");
    }
}

class ConcretePrototype2 extends Prototype {
    public Prototype clonePrototype() {
        return new ConcretePrototype2();
    }

    public void show() {
        System.out.println("ConcretePrototype2");
    }
}

// Client code
public class PrototypeExample {
    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype1();
        Prototype prototype2 = prototype1.clonePrototype();

        prototype1.show();
        prototype2.show();
    }
}
