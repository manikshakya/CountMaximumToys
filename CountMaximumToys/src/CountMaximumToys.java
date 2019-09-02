import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/*
	Given a list of prices and an amount to spend, 
	what is the maximum number of toys Mark can buy? 
	
	For example, if prices = [1,2,3,4] and Mark has k = 7 to spend, 
	he can buy items [1,2,3] for 6, or [3,4] for 7 units of currency. 
	He would choose the first group of 3 items.
	
	Find the maximum number of toys to buy.
	
	maximumToys has the following parameter(s):
		prices: an array of integers representing toy prices
		k: an integer, Mark's budget
*/

class CountMaximumToys{
	public static void main(String[] args) {
		// Mark and toys
		
		int[] prices = {3, 7, 2, 9, 4};
		
		
		int k = 15;
		
		System.out.println(maximumToys(prices, k));
		
	}
	
	public static int maximumToys(int[] prices, int k) {
		
		int[] toys = Arrays.stream(prices)
						.sorted()
						.filter(x -> x < k)
						.toArray();
		
		int buy = k;
		int total = 0;
		for(int i : toys) {
			if((buy - i) < 0) break;
			buy -= i;
			total++;
		}
		
		return total;
	}
	
	
	
	
}