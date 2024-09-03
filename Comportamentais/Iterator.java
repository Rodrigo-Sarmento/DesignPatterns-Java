// Aggregate Interface
interface Aggregate {
    Iterator createIterator();
}

// Concrete Aggregate
class ConcreteAggregate implements Aggregate {
    private String[] items;

    public ConcreteAggregate(String[] items) {
        this.items = items;
    }

    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int getLength() {
        return items.length;
    }

    public String getItem(int index) {
        return items[index];
    }
}

// Iterator Interface
interface Iterator {
    boolean hasNext();
    Object next();
}

// Concrete Iterator
class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int index;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    public boolean hasNext() {
        return index < aggregate.getLength();
    }

    public Object next() {
        if (hasNext()) {
            return aggregate.getItem(index++);
        }
        return null;
    }
}

// Client code
public class IteratorExample {
    public static void main(String[] args) {
        String[] items = {"Item1", "Item2", "Item3"};
        ConcreteAggregate aggregate = new ConcreteAggregate(items);
        Iterator iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
