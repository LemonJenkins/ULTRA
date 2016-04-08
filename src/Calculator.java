import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Calculator {
    private String[] expression = new String[3];
    private int[] numbers = {0, 0};
    private static final String TEXT_INCORECT_EXP = "!!!!!You entered an incorrect expression!!!!!!!";

    void start() {
        reading();
        verification(expression);
        signVerification(expression[1]);
        if ("+".equals(expression[1])) {
            System.out.print(numbers[0] + expression[1] + numbers[1] + " = " + add(numbers[0], numbers[1]));
        }
        if ("-".equals(expression[1])) {
            System.out.print(numbers[0] + expression[1] + numbers[1] + " = " + subtract(numbers[0], numbers[1]));
        }
        if ("*".equals(expression[1])) {
            System.out.print(numbers[0] + expression[1] + numbers[1] + " = " + multiply(numbers[0], numbers[1]));
        }
        if ("/".equals(expression[1])) {
            System.out.print(numbers[0] + expression[1] + numbers[1] + " = " + divide(numbers[0], numbers[1]));
        }
        if ("^".equals(expression[1])) {
            System.out.print(numbers[0] + expression[1] + numbers[1] + " = " + degree(numbers[0], numbers[1]));
        }
    }

    private void reading() {
        Scanner expressionElement = new Scanner(System.in);
        expression = expressionElement.nextLine().split(" ");
    }

    private void verification(String[] expForValidity) {

                try {
                    numbers[0] = Integer.parseInt(expForValidity[0]);
                    if (expForValidity.length > 2) {
                        numbers[1] = Integer.parseInt(expForValidity[2]);
                    }
                    }
                    catch (NumberFormatException e) {
                    System.out.println(TEXT_INCORECT_EXP);
                    throw new RuntimeException();
                }
            }

    private void signVerification(String signIn) {
        Pattern p = Pattern.compile("^\\+|\\-|\\*|/|\\^$");
        Matcher m = p.matcher(signIn);
        if (!m.matches()) {
            System.out.println(TEXT_INCORECT_EXP);
            System.exit(53);
        }
    }

    private int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    private int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    private int degree(int firstNumber, int secondNumber) {
        return (int) Math.pow(firstNumber, secondNumber);
    }
}