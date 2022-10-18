package com.dustin.iostream;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author Dustin_Peng
 * @Description 第三方jar包commons-io
 * @create 2022-10-13-02:23
 */
public class FileUtilsTest {
    @Test
    public void test1() throws IOException {
        File srcFile = new File("IO1.png");
        File destFile = new File("src/main/java/com/dustin/iostream/IO.png");
        FileUtils.copyFile(srcFile, destFile);
    }
}
