package Lab3;

public class Main {
    public static void main(String[] args) {

        //given two numbers, see witch one is the greatest and print it

        Calculator calc=new Calculator();

        System.out.println(calc.addition(5,8));

        System.out.println(calc.multiply(5,8));

        System.out.println(calc.divide(8,5));

        System.out.println(calc.substract(8,5));

        LogicalOp op = new LogicalOp();

        int biggest = op.checkBiggerNumber(8,5);
        System.out.println(" The biggest number is: " +biggest);
        System.out.println(op.textCompare("FastTrackIT") );
        System.out.println(op.textAndNumber("FastTrackIt",4));
        System.out.println(op.snowForecast(9));
        System.out.println(op.equalCheck(2));
        System.out.println(op.outputnumber(10));
        System.out.println(op.isNumberEven(7));
        System.out.println(op.isEligibleToVote( 18));
        System.out.println(op.giveHigherNumb3r(5,4,2));
    }
}

