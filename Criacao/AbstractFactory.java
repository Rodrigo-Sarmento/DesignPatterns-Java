// Abstract Product A
interface ProductA {
    void use();
}

// Abstract Product B
interface ProductB {
    void eat();
}

// Concrete Product A1
class ConcreteProductA1 implements ProductA {
    public void use() {
        System.out.println("Using Product A1");
    }
}

// Concrete Product A2
class ConcreteProductA2 implements ProductA {
    public void use() {
        System.out.println("Using Product A2");
    }
}

// Concrete Product B1
class ConcreteProductB1 implements ProductB {
    public void eat() {
        System.out.println("Eating Product B1");
    }
}

// Concrete Product B2
class ConcreteProductB2 implements ProductB {
    public void eat() {
        System.out.println("Eating Product B2");
    }
}

// Abstract Factory
interface AbstractFactory {
    ProductA createProductA();
    ProductB createProductB();
}

// Concrete Factory 1
class ConcreteFactory1 implements AbstractFactory {
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}

// Concrete Factory 2
class ConcreteFactory2 implements AbstractFactory {
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}

// Client code
public class AbstractFactoryExample {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        productA1.use();
        productB1.eat();

        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA2.use();
        productB2.eat();
    }
}
