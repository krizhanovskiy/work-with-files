package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipFileTests {
    @Test
    void zipWithPasswordTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/files/work_with_file_in_java.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String zipPassword = "";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/work_with_file_in_java.txt";
        String expectedData = "Creating and Writing a File by Using Stream I/O";

        unzip(zipFilePath, unzipFolderPath, zipPassword);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void zipTest() throws IOException, ZipException {
        String zipFilePath = "./src/test/resources/files/work_with_file_in_java.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/work_with_file_in_java.txt";
        String expectedData = "Creating and Writing a File by Using Stream I/O";

        unzip(zipFilePath, unzipFolderPath);

        String actualData = readTextFromPath(unzipTxtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

}
