package io.github.joaomlneto;

import org.apache.thrift.TException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorServletTest implements IntegrationTest {
    @Test
    public void testAdd() throws TException {
        String url = "http://localhost:8080/CalculatorServlet";
        Client client = new Client(url);
        Assert.assertEquals(11, client.add(4, 7));
    }
}
