package io.github.joaomlneto;

import org.apache.thrift.TException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceHandlerTest {
	@Test
	public void shouldAdd() throws TException {
		CalculatorServiceHandler handler = new CalculatorServiceHandler();
		Assert.assertEquals(4, handler.add(2, 2));
		Assert.assertEquals(-5, handler.add(7, -12));
	}

	@Test
	public void shouldExecuteAllOperations() throws TException {
		CalculatorServiceHandler handler = new CalculatorServiceHandler();
		Assert.assertEquals(5, handler.execute(Operation.ADD, 2, 3));
		Assert.assertEquals(3, handler.execute(Operation.SUB, 10, 7));
		Assert.assertEquals(35, handler.execute(Operation.MUL, 7, 5));
		Assert.assertEquals(3, handler.execute(Operation.DIV, 15, 4));
	}

}
