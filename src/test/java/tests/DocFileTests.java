package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readDocFromPath;

public class DocFileTests {
    @Test
    void docTest() {
        String docFilePath = "./src/test/resources/files/work_with_file_in_java.doc";
        String expectedData = "test work with doc file";

        String actualData = readDocFromPath(docFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
