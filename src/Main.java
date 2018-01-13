import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double savedResult;
        double first;
        double second;
        String action ="" ;
        Scanner scan = new Scanner(System.in);
        String userChoice = "";
        Action act = new Action();

        try {
                do {
                    System.out.println("Enter first number");
                    first = scan.nextDouble();
                    savedResult = first;
                    while (!action.equals("exit")) {

                        System.out.println("Enter your operation");
                        action = scan.next();
                        if(action.equals("exit"))
                        {userChoice = "yes";
                        break;}
                        else if(action.equals("c"))
                        {System.out.println(savedResult);
                            break;}
                        System.out.println("Enter second number");

                        second = scan.nextDouble();
                        if (action.equals("/") && second == 0) {
                            throw new Exception();
                        }
                        savedResult = act.actions(savedResult, second, action);
                        System.out.println(savedResult);

                    }
                }while(!userChoice.equals("yes"));

            }catch(Exception E)
            { System.out.println("illegal action"); }


    }
}