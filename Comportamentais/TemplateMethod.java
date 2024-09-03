// Abstract Class
abstract class AbstractClass {
    // Template Method
    public final void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();
}

// Concrete Class A
class ConcreteClassA extends AbstractClass {
    void primitiveOperation1() {
        System.out.println("ConcreteClassA Operation1");
    }

    void primitiveOperation2() {
        System.out.println("ConcreteClassA Operation2");
    }
}

// Concrete Class B
class ConcreteClassB extends AbstractClass {
    void primitiveOperation1() {
        System.out.println("ConcreteClassB Operation1");
    }

    void primitiveOperation2() {
        System.out.println("ConcreteClassB Operation2");
    }
}

// Client code
public class TemplateMethodExample {
    public static void main(String[] args) {
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();

        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}
