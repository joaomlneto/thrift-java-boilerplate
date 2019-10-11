package io.github.joaomlneto;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TServlet;

public class CalculatorServlet extends TServlet {
    public CalculatorServlet() {
        super(new CalculatorService.Processor<>(new CalculatorServiceHandler()), new TCompactProtocol.Factory());
    }
}
