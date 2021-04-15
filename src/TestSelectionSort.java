import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;


public class TestSelectionSort extends TestCase{
	@Test public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
		}
	public TestSelectionSort() { }

	public void testPositive(){

	}

	public void testNegative(){

		/** Test data contains negative values only **/

	}

	public void testMixed(){

    /** Test data contains with both positive, negative and zeros **/
		int[] arr = new int[5];
		arr[0] = -8;
		arr[1] = 9;
		arr[2] = 7;
		arr[3] = -10;
		arr[4] = -2;
		int[] Sortedarr = new int[5];
		Sortedarr[2] = -2;
		Sortedarr[3] = 7;
		Sortedarr[1] = -8;
		Sortedarr[4] = 9;
		Sortedarr[0] = -10;

		}

	public void testDuplicates(){


	}

}
