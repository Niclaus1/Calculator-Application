import java.util.Scanner;

public class UIApplication {
    private Scanner scan;
    private ArithmeticCalculations arithmetic;


    public UIApplication(){
        this.scan = new Scanner(System.in);
        this.arithmetic = new ArithmeticCalculations();
    }

    public void start(){
        System.out.println("What Calculations do you need? " + "\n" +
                            "Arithmetic(a|A), Trigonometry(t|T) " + "\n" +
                            "Perimeter(p|P), Close Program(stop)");
        String command = scan.nextLine();
        String formattedCommand = command.toLowerCase().trim();

        switch(formattedCommand){
            case "a":
                arithmeticFunction();
                break;
            case "t":
                trigonometryFunction();
                break;
            case "p":
                perimeterFunction();
            case "stop":
                System.out.println("Thank you, Try Again");
                break;
        }
    }

    public void arithmeticFunction(){
        System.out.println("Calculation format should be " + "\n"
                            + "n+n, n-n, n*n, n/n");
        String input = scan.nextLine();
        if (input.isEmpty()){
            System.out.println("Sorry try again");
            return;
        }
        String[] xyNumber = input.split("\\s*[+\\-*/]\\s*");
        String operator = input.replaceAll("[0-9\\s]","");

        if (xyNumber.length == 2 && !operator.isEmpty()) {
            try{
                double num1 = Double.parseDouble(xyNumber[0]);
                double num2 = Double.parseDouble(xyNumber[1]);

                double answer = switch (operator) {
                    case "+" -> arithmetic.addition(num1, num2);
                    case "-" -> arithmetic.subraction(num1, num2);
                    case "*" -> arithmetic.multiplication(num1, num2);
                    case "/" -> arithmetic.division(num1, num2);
                    default -> throw new IllegalArgumentException("Invalid Operator");
                 };
                if (answer == (int)answer){
                    System.out.println("The answer is: " + (int) answer);
                }else{
                    System.out.println("The answer is: " + answer);
                }
                start();
            }
            catch(IllegalArgumentException e){
                System.out.println("Invalid input.");
            }
        }
            else{
                System.out.println("Invalid Input");
        }
    }

    public void trigonometryFunction(){

    }

    public void perimeterFunction(){

    }
}
