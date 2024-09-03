// Abstract Expression
interface Expression {
    int interpret();
}

// Terminal Expression
class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int interpret() {
        return number;
    }
}

// Non-terminal Expression
class AddExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}

// Client code
public class InterpreterExample {
    public static void main(String[] args) {
        Expression leftExpression = new NumberExpression(10);
        Expression rightExpression = new NumberExpression(20);
        Expression addExpression = new AddExpression(leftExpression, rightExpression);

        System.out.println("Result: " + addExpression.interpret());
    }
}
