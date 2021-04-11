package lab3;

public class LogicalOp {

    public int getHigherNumber(int first, int second) {

        //given two numbers, see witch one is the greatest and print it

      /*  int first = 15;
        int second = 20;
        if (first > second) {
            System.out.println(first);

        } else if (first == second) {
            System.out.println("They are equal");
        } else {
            System.out.println(second);
        } v*/

        if (first > second) {
            return first;
        } else  {
            return second;
        }

    }
}
