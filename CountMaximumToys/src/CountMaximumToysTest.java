import static org.junit.Assert.*;

import org.junit.Test;

public class CountMaximumToysTest {
	
	@Test
	public void test1() {
		int[] prices = {1, 12, 5, 111, 200, 1000, 10};
		int k = 50;
		assertEquals(CountMaximumToys.maximumToys(prices, k), 4);
	}
	
	@Test
	public void test2() {
		int[] prices = {1,2,3,4};
		int k = 7;
		assertEquals(CountMaximumToys.maximumToys(prices, k), 3);
	}
	
	@Test
	public void test3() {
		int[] prices = {3, 7, 2, 9, 4};
		int k = 15;
		assertEquals(CountMaximumToys.maximumToys(prices, k), 3);
	}
	

}
