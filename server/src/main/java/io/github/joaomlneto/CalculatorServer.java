package io.github.joaomlneto;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

public class CalculatorServer {
    public static void main( String[] args ) throws TTransportException {
        CalculatorServiceHandler handler = new CalculatorServiceHandler();
        CalculatorService.Processor<CalculatorServiceHandler> processor = new CalculatorService.Processor<>(handler);
        TServerTransport serverTransport = new TServerSocket(9090);
        TServer server = new TSimpleServer(new TSimpleServer.Args(serverTransport).processor(processor));
        System.out.println("Starting the server");
        server.serve();
    }
}
