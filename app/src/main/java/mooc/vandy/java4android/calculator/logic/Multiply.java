package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO -- start your code here

    private int arg1 = 0;
    private int arg2 = 0;
    public Multiply(int argumentOne, int argumentTwo) {
        arg1 = argumentOne;
        arg2 = argumentTwo;
    }
    public String toString(){
        return String.valueOf(arg1 * arg2);
    }
}
