package dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangePrinterTest {

    @Test
    void strangePrinter() {
        var strangePrinter = new StrangePrinter();
        assertEquals(2, strangePrinter.strangePrinter("aaabbb"));
        assertEquals(2, strangePrinter.strangePrinter("aba"));
        assertEquals(4, strangePrinter.strangePrinter("aacdde"));
        assertEquals(8, strangePrinter.strangePrinter("aahhwrerecdeaaa"));
    }
}