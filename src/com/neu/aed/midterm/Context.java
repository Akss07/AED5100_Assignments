package com.neu.aed.midterm;

public class Context {
    iMathOperation iMathOperation;
    public Context(iMathOperation iMathOperation) {
        this.iMathOperation = iMathOperation;
    }

    public int execute(int num1, int num2) {
        return iMathOperation.performOperation(num1, num2);
    }

}
