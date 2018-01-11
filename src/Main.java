import java.io.BufferedReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Action act = new Action();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your dare");
        double first = scan.nextDouble();
        String sign = scan.next();
        double second = scan.nextDouble();
        String again = "no";
        while (!again.equals("yes")) {
            switch (sign) {
                case "+": {
                    System.out.println(act.summ(first, second));
                    break;
                }
                case "-": {
                    System.out.println(act.minus(first, second));
                    break;
                }
                case "*": {
                    System.out.println(act.mult(first, second));
                    break;
                }

                case "/": {
                    System.out.println(act.devide(first, second));
                    break;
                }

            }
            again = scan.next();
            //System.out.println("DO you want to continue? yes/no");
            //again = scan.next();
        }
    }
}