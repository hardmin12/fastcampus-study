package fc.java.course2.part2;

import fc.java.model2.MathOperation;
import fc.java.model2.MathOperationImpl;

public class LambdaExample {
    public static void main(String[] args) {
       /* MathOperation add = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        }; */

        MathOperation add = (int x, int y) -> {return x+y;};

        int result = add.operation(10,10);
        System.out.println("result = " + result);
    }
}
