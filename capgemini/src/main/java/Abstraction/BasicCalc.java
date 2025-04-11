package Abstraction;

public class BasicCalc implements CalcInterface {

    public double calculate(double num1,double num2,char operator) {
      double res=  switch (operator) {
            case '+'-> num1+num2;
            case '-'-> num1-num2;
            case '*'-> num1*num2;
            case '/'-> num1/num2;
            default ->{
                System.out.println("Invalid operator");
                yield -1;
            }
        };
      return res;
    }
}
