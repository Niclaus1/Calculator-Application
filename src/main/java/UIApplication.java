import java.util.Scanner;

public class UIApplication {
    private Scanner scan;
    private ArithmeticCalculations arithmetic;


    public UIApplication(){
        this.scan = new Scanner(System.in);
        this.arithmetic = new ArithmeticCalculations();
    }

    public void start(){
        System.out.println("Welcome to my Advance Calculator" + "\n" +
                            "What Calculations do you need? ");
        String command = scan.nextLine();

        switch(command){
            case "arithmetic":
                arithmeticFunction();
                break;
            case "trigonometry":
                trigonometryFunction();
                break;
            case "perimeter":
                perimeterFunction();

        }
    }

    public void arithmeticFunction(){
        System.out.println("Calculation format should be " + "\n"
                            + "n+n, n-n, n*n, n/n");
        String input = scan.nextLine();
        if (input.isEmpty()){
            System.out.println("Sorry try again");
        }
        String[] xyNumber = input.split("\\s*[+\\-*/]\\s*");
        String operator = input.replaceAll("[0-9\\s]","");

        if (xyNumber.length == 2) {
            int num1 = Integer.parseInt(xyNumber[0]);
            int num2 = Integer.parseInt(xyNumber[1]);

            int answer = 0;

            switch (operator) {
                case "+":
                    answer = arithmetic.addition(num1, num2);
                    break;
                case "-":
                    answer = arithmetic.subraction(num1, num2);
                    break;
                case "*":
                    answer = arithmetic.multiplication(num1, num2);
                    break;
                case "/":
                    answer = arithmetic.division(num1, num2);
                    break;
                }
            System.out.println("The answer is: " + answer);
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
