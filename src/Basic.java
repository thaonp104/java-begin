import java.util.Scanner;

public class Basic {
    public static int a=1, b=1;
    public static void main(String[] args) {
        System.out.println("Part 1.1: hello world");
        helloWorld();
        System.out.println("Part 1.2: variable and operator");
        variableAndOperator();
        System.out.println("Part 1.3: function and condition statement");
        functionAndConditionStatement(2, 2);
        functionAndConditionStatement(2, 3);
        functionAndConditionStatement(3, 2);
        System.out.println("Part 1.4: input output");
        int result = inputOutput();
        System.out.println(result);
    }

    public static void helloWorld() {
        System.out.println("Hello World!");
    }

    public static void variableAndOperator() {
        a = 5;
        b = 4;
        int c = (int)a/b;
        System.out.println("Result: " + c);
    }

    public static void functionAndConditionStatement(int x, int y) {
        a = x;
        b = y;

        System.out.println("value a: " + a + "; value b: " + b);

        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is bigger than b");
        } else {
            System.out.println("a is smaller than b");
        }
    }

    public static int inputOutput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer x: ");
        int x = sc.nextInt();
        System.out.println("Input integer y: ");
        int y = sc.nextInt();
        System.out.println("Result sum: ");

        return x + y;
    }
}
