package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class DocxFileTests {

    @Test
    void docxTest() {
        String docFilePath = "./src/test/resources/files/work_with_file_in_java.docx";
        String expectedData = "test work with doc file";

        String actualData = readDocFromPath(docFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
