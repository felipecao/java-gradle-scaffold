package com.tw.ff5;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    private Library classUnderTest = new Library();

    @Test
    public void testMethod() {
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someMethod());
    }
}
