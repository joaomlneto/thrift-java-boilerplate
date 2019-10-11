package io.github.joaomlneto;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransportException;

public class Client implements CalculatorService.Iface {

    private CalculatorService.Client client;

    public Client(String serverURL) throws TTransportException {
        THttpClient thc = new THttpClient(serverURL);
        TProtocol loPFactory = new TCompactProtocol(thc);
        client = new CalculatorService.Client(loPFactory);
    }

    @Override
    public int add(int a, int b) throws TException {
        return client.add(a, b);
    }

    @Override
    public int execute(Operation op, int a, int b) throws TException {
        return client.execute(op, a, b);
    }
}
