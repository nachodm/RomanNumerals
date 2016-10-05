import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
	
	RomanNumerals romanNum = new RomanNumerals();

	@Test public void testI_1() {
		String I = "I";
		assertEquals(romanNum.convertToInteger(I), 1);
	}
	
	@Test public void testV_5() {
		String V = "V";
		assertEquals(romanNum.convertToInteger(V), 5);
	}

	@Test public void testX_10() {
		String X = "X";
		assertEquals(romanNum.convertToInteger(X), 10);
	}
	@Test public void testL_50() {
		String L = "L";
		assertEquals(romanNum.convertToInteger(L), 50);
	}
	
	@Test public void testC_100() {
		String C = "C";
		assertEquals(romanNum.convertToInteger(C), 100);
	}

	@Test public void testD_500() {
		String D = "D";
		assertEquals(romanNum.convertToInteger(D), 500);
	}
	
	@Test public void testM_1000() {
		String M = "M";
		assertEquals(romanNum.convertToInteger(M), 1000);
	}
	@Test public void testII_2() {
		String I = "II";
		assertEquals(romanNum.convertToInteger(I), 2);
	}
	
	@Test public void testCCC_300() {
		String CCC = "CCC";
		assertEquals(romanNum.convertToInteger(CCC), 300);
	}
	
	@Test public void testMMXVI_2016() {
		String  MMXVI = "MMXVI";
		assertEquals(romanNum.convertToInteger(MMXVI), 2016);
	}
	
	@Test public void testMMXIV_2014() {
		String  MMXIV = "MMXIV";
		assertEquals(romanNum.convertToInteger(MMXIV), 2014);
	}
	
	@Test public void testMCMXCIV_1994() {
		String MCMXCIV = "MCMXCIV";
		assertEquals(romanNum.convertToInteger(MCMXCIV), 1994);
	}
}
