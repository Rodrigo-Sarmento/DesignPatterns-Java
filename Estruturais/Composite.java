// Component
interface Component {
    void operation();
}

// Leaf
class Leaf implements Component {
    public void operation() {
        System.out.println("Leaf operation");
    }
}

// Composite
class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public void operation() {
        System.out.println("Composite operation");
        for (Component child : children) {
            child.operation();
        }
    }
}

// Client code
public class CompositeExample {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.add(new Leaf());
        root.add(new Leaf());

        Composite branch = new Composite();
        branch.add(new Leaf());
        root.add(branch);

        root.operation();
    }
}
