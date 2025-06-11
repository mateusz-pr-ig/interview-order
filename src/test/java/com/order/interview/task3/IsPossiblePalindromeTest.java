package com.order.interview.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class IsPossiblePalindromeTest {

    @Test
    public void isPalindromePossible() {
        Assertions.assertTrue(IsPossiblePalindrome.check("oonn"));
        Assertions.assertFalse(IsPossiblePalindrome.check("abc"));
        Assertions.assertTrue(IsPossiblePalindrome.check("abcab"));
    }
}