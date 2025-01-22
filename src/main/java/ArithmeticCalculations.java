public class ArithmeticCalculations {

    public double addition(double x, double y){
        return x + y;
    }

    public double subraction(double x, double y){
        return x - y;
    }

    public double multiplication(double x, double y){
        return x * y;
    }

    public double division(double x, double y){
        if(y == 0){
            return 0;
        }
        return x / y;
    }


}
