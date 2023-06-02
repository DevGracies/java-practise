public class FunctionExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int sum = addNumbers(a, b);
        System.out.println("Sum: " + sum);

        int difference = subtractNumbers(a, b);
        System.out.println("Difference: " + difference);

        int product = multiplyNumbers(a, b);
        System.out.println("Product: " + product);

        double quotient = divideNumbers(a, b);
        System.out.println("Quotient: " + quotient);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static double divideNumbers(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero!");
        }
    }
}
