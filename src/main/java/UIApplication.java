import java.util.Scanner;

public class UIApplication {
    private final Scanner scan;
    private final ArithmeticCalculations arithmetic;
    private final TrigonometryCalculations trigonometry;


    public UIApplication(){
        this.scan = new Scanner(System.in);
        this.arithmetic = new ArithmeticCalculations();
        this.trigonometry = new TrigonometryCalculations();
    }

    public void start(){
        System.out.println("""
                What Calculations do you need?\s
                Arithmetic(a|A), Trigonometry(t|T)\s
                Perimeter(p|P), Close Program(stop)""");
        String command = scan.nextLine();

        switch(command.trim().toLowerCase()){
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
            default:
                System.out.println("Try again" + "\n");
                start();
        }
    }

    public void arithmeticFunction(){
        System.out.println("Calculation format should be " + "\n" + "n+n, n-n, n*n, n/n");
        String input = scan.nextLine();
        if (input.isEmpty()){
            System.out.println("Sorry try again");
            return;
        }

        String[] xyNumber = input.split("[+\\-*/]");
        String operator = input.replaceAll("[0-9\\s.]","");

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
                    System.out.println("The answer is: " + (int) answer + "\n");
                }else{
                    System.out.println("The answer is: " + String.format("%.3f", answer) + "\n");
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
        System.out.println("Calculate: sin(n), cos(n), tan(n), csc(n), sec(sen), cot(n)");
        String input = scan.nextLine();
        String function = input.replaceAll("[^a-zA-Z]", "");
        String number  = input.replaceAll("[^0-9]", "");

        System.out.println("Input Angle in Degrees: ");
        double value = Double.parseDouble(number) * (Math.PI / 180);

        try {
           double answer = switch(function){
               case "sin" -> trigonometry.sine(value);
               case "cos" -> trigonometry.cosine(value);
               case "tan" -> trigonometry.tangent(value);
               case "csc" -> trigonometry.cosecant(value);
               case "sec" -> trigonometry.secant(value);
               case "cot" -> trigonometry.cotangent(value);
               default -> throw new IllegalArgumentException("Invalid Input");
           };
           System.out.println("The answer is: " + String.format("%.3f",answer));
       }catch (IllegalArgumentException e){
            System.out.println( "Error: " + e);
        }
    }

    public void perimeterFunction(){

    }
}
