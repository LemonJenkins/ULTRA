import java.util.Scanner;

public class Main {
    private static final String ENTER_EXPRESSION_TEXT = "Enter the calculation expression: ";
    private static final String fuckYOU = "Fuck YOU, enter normal expression!";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1, number2;
        String inputSign;
        number1=0;
        number2=0;
        inputSign=" ";
        Calculator c = new Calculator();
        System.out.printf(ENTER_EXPRESSION_TEXT);
        if (in.hasNextInt()) {
            number1 = in.nextInt();
        }
        else {
            System.out.println(fuckYOU);
            System.exit(1);
        }
        inputSign = in.next();
             if ("+".equals(inputSign) || "-".equals(inputSign) || "*".equals(inputSign) ||
                    "/".equals(inputSign) || "^".equals(inputSign)) {
                if (in.hasNextInt()) {
                    number2 = in.nextInt();}
                else {
                    System.out.println(fuckYOU);
                    System.exit(3);
                }
            }
            else {
                System.out.println(fuckYOU);
                System.exit(2);
            }
        if ("+".equals(inputSign)) {
            System.out.print(number1 + " + " + number2 + " = " + c.add(number1, number2));
        }
        if ("-".equals(inputSign)) {
            System.out.print(number1 + " - " + number2 + " = " + c.subtract(number1, number2));
        }
        if ("*".equals(inputSign)) {
            System.out.print(number1 + " * " + number2 + " = " + c.multiply(number1, number2));
        }
        if ("/".equals(inputSign)) {
            System.out.print(number1 + " / " + number2 + " = " + c.divide(number1, number2));
        }
        if ("^".equals(inputSign)) {
            System.out.print(number1 + "^" + number2 + " = " + c.degree(number1, number2));
        }
    }

}
