package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {

	@Test
	public void testDiezxciento() throws Exception {
		Diezxciento diezxciento = new Diezxciento(23000000,900000);
		assertEquals(2400000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		assertEquals(2400000, 2400000);
	}

	@Test
	public void testSaldoAhorro() throws Exception {
		assertEquals(2400000, 2400000);
	}

}
