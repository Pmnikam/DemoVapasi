class MyArithmeticException extends Exception{
    public MyArithmeticException(String message){
        super(message);
    }
}

class Calculator{
    public double caldouble(int num) throws MyArithmeticException {
        if(num==0){
            throw new MyArithmeticException("Zero not allowed");
        } else if (num<0) {
            throw new MyArithmeticException("Negative not allowed");
        }
        else {
            return num * 2.0;
        }
    }
}

public class MyCalcApp{
    public static void main(String[] args){
        Calculator cal=new Calculator();
        try {
            double result =cal.caldouble(1);
            System.out.println("Double of number is "+ result);
        } catch (MyArithmeticException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
