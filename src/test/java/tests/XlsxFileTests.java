package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readXlsxFromPath;

public class XlsxFileTests {
    @Test
    void xlsxTest() {
        String xlsFilePath = "./src/test/resources/files/work_with_file_in_java.xlsx";
        String expectedData = "test work with xlsx file";

        String actualData = readXlsxFromPath(xlsFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
