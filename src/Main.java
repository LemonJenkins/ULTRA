import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        String d;
        Calculator c = new Calculator();
        System.out.printf("Enter the calculation expression: ");
        a=in.nextInt();
        d=in.next();
        b=in.nextInt();

        if("+".equals(d)){
            System.out.print(a + " + " + b + " = " + c.add(a,b));
        }
        if("-".equals(d)){
            System.out.print(a + " - " + b + " = " + c.subtract(a,b));
        }
        if("*".equals(d)){
           System.out.print(a + " * " + b + " = " + c.multiply(a,b));
        }
        if("/".equals(d)){
            System.out.print(a + " / " + b + " = " + c.divide(a,b));
        }
    }

}
