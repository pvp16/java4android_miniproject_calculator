package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    private static final int ADD = 1;
    private static final int SUB = 2;
    private static final int MUL = 3;
    private static final int DIV = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here
        if(operation == ADD) {
            Add a = new Add(argumentOne, argumentTwo);
            mOut.print(a.toString());
        } else if(operation == SUB) {
            Subtract s = new Subtract(argumentOne, argumentTwo);
            mOut.print(s.toString());
        } else if(operation == MUL) {
            Multiply m = new Multiply(argumentOne, argumentTwo);
            mOut.print(m.toString());
        }else  {
            Divide d = new Divide(argumentOne, argumentTwo);
            mOut.print(d.toString());
        }
    }
}
