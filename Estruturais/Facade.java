// Subsystem Class A
class SubsystemA {
    void operationA() {
        System.out.println("Subsystem A operation");
    }
}

// Subsystem Class B
class SubsystemB {
    void operationB() {
        System.out.println("Subsystem B operation");
    }
}

// Subsystem Class C
class SubsystemC {
    void operationC() {
        System.out.println("Subsystem C operation");
    }
}

// Facade
class Facade {
    private SubsystemA subsystemA = new SubsystemA();
    private SubsystemB subsystemB = new SubsystemB();
    private SubsystemC subsystemC = new SubsystemC();

    void operation() {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}

// Client code
public class FacadeExample {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation();
    }
}
