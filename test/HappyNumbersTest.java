import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumbersTest {

    /**
     * Method to test the isHappyNumber method
     */
    @org.junit.jupiter.api.Test
    void isHappyNumber() {
        String expectedOutput = "13000, 10, 1 - Happy";
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        HappyNumbers.isHappyNumber(13000, new ArrayList<>(13000));
        assertEquals(expectedOutput, outContent.toString().replaceAll("\n", "").replaceAll("\r", ""));

        ByteArrayOutputStream outContentTwo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContentTwo));
        expectedOutput = "643, 61, 37, 58, 89, 145, 42, 20, 4, 16, 37 - Not Happy";
        HappyNumbers.isHappyNumber(643, new ArrayList<>(643));
        assertEquals(expectedOutput, outContentTwo.toString().replaceAll("\n", "").replaceAll("\r", ""));
    }
}