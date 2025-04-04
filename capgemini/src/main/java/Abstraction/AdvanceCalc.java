package Abstraction;

public class AdvanceCalc extends BasicCalc {
    public double calculate(double num1,double num2,char operator) {

        double res=  switch (operator) {
//            case '+','-','*','/'->{
//                BasicCalc bc = new BasicCalc();
//                yield bc.calculate(num1,num2,operator);
//            }
            case '^'-> Math.pow(num1,num2);
            case '%'-> num1%num2;
            default -> super.calculate(num1,num2,operator);
        };
        return res;
    }
}
