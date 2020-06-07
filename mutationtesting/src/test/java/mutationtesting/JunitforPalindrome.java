package mutationtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitforPalindrome {
	@Test
	public void whenPalindrom_thenAccept() {
		PalindromeClass palindromeTester = new PalindromeClass();
		assertTrue(palindromeTester.isPalindrome("noon"));
	}

	@Test
	public void whenNearPalindrom_thanReject() {
		PalindromeClass palindromeTester = new PalindromeClass();
		assertFalse(palindromeTester.isPalindrome("neon"));
	}
}
