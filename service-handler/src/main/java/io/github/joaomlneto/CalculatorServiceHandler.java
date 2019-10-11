package io.github.joaomlneto;

import org.apache.thrift.TException;

public class CalculatorServiceHandler implements CalculatorService.Iface {
    @Override
    public int add(int a, int b) throws TException {
        return a + b;
    }

    @Override
    public int execute(Operation op, int a, int b) throws TException {
        switch (op) {
            case ADD: return a + b;
            case SUB: return a - b;
            case MUL: return a * b;
            case DIV: return a / b;
            default: throw new InvalidOperationException();
        }
    }
}
