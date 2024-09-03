// Element Interface
interface Element {
    void accept(Visitor visitor);
}

// Concrete Element A
class ConcreteElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "ConcreteElementA";
    }
}

// Concrete Element B
class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "ConcreteElementB";
    }
}

// Visitor Interface
interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);
}

// Concrete Visitor
class ConcreteVisitor implements Visitor {
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visiting " + elementA.operationA());
    }

    public void visit(ConcreteElementB elementB) {
        System.out.println("Visiting " + elementB.operationB());
    }
}

// Client code
public class VisitorExample {
    public static void main(String[] args) {
        Element[] elements = {new ConcreteElementA(), new ConcreteElementB()};
        Visitor visitor = new ConcreteVisitor();

        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
