package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here

    private int arg1 = 0;
    private int arg2 = 0;

    public Divide(int argumentOne, int argumentTwo) {
        arg1 = argumentOne;
        arg2 = argumentTwo;
    }

    public String toString() {
        try {
            return String.valueOf(arg1 / arg2) + "R:" + String.valueOf(arg1 % arg2);
        } catch (ArithmeticException e) {
            return "zero division error";
        }
    }
}