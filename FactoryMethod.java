// Product interface
interface Product {
    void use();
}

// ConcreteProduct1
class ConcreteProduct1 implements Product {
    public void use() {
        System.out.println("Using ConcreteProduct1");
    }
}

// ConcreteProduct2
class ConcreteProduct2 implements Product {
    public void use() {
        System.out.println("Using ConcreteProduct2");
    }
}

// Creator
abstract class Creator {
    abstract Product createProduct();

    void someOperation() {
        Product product = createProduct();
        product.use();
    }
}

// ConcreteCreator1
class ConcreteCreator1 extends Creator {
    Product createProduct() {
        return new ConcreteProduct1();
    }
}

// ConcreteCreator2
class ConcreteCreator2 extends Creator {
    Product createProduct() {
        return new ConcreteProduct2();
    }
}

// Client code
public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator1();
        creator.someOperation();

        creator = new ConcreteCreator2();
        creator.someOperation();
    }
}
