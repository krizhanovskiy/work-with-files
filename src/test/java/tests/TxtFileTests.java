package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;

public class TxtFileTests {

    @Test
    void txtTest() throws IOException {
        String txtFilePath = "./src/test/resources/files/work_with_file_in_java.txt";
        String expectedData = "Creating and Writing a File by Using Stream I/O";

        String actualData = readTextFromPath(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void csvTest() throws IOException {
        String csvFilePath = "./src/test/resources/files/work_with_file_in_java.csv";
        String expectedData = "Creating and Writing a File by Using Stream I/O";

        String actualData = readTextFromPath(csvFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
