class Product {
    private String partA;
    private String partB;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void show() {
        System.out.println("Product with PartA: " + partA + ", PartB: " + partB);
    }
}

// Builder
abstract class Builder {
    protected Product product = new Product();

    abstract void buildPartA();
    abstract void buildPartB();

    public Product getResult() {
        return product;
    }
}

// Concrete Builder
class ConcreteBuilder extends Builder {
    void buildPartA() {
        product.setPartA("PartA1");
    }

    void buildPartB() {
        product.setPartB("PartB1");
    }
}

// Director
class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
    }
}

// Client code
public class BuilderExample {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
        product.show();
    }
}
