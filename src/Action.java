
public class Action {

    public double actions(double first, double second, String act) {
        switch (act) {
            case "+": {
                return first + second;
            }
            case "-":
                return first - second;

            case "*":
                return first * second;

            case "/":
                return first / second;
            case "c":
                return 0;

            default:
            {
                System.out.println("You inputed wrong sign");
                return 0;
            }
        }


    }
}