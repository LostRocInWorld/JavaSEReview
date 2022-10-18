package com.dustin.iostream;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;

/**
 * @author Dustin_Peng
 * @Description Files类
 * @create 2022-10-13-02:03
 */
public class FilesTest {
    @Test
    public void testFiles() throws IOException {
        Path path1 = Paths.get("hello.txt");
        Path path2 = Paths.get("nihao.txt");
        Path path3 = Paths.get("src/main/java/com/dustin/iostream/newDir");

//        Path newPath = Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);//存在时替换，要求path1必须存在
//        Path directory = Files.createDirectory(path3);
        Files.createFile(path2);
    }

    @Test
    public void testFiles2() throws IOException {
        Path path1 = Paths.get("hello.txt");
        Path path2 = Paths.get("nihao.txt");
        Path path3 = Paths.get("src/main/java/com/dustin/iostream/newDir");

        Files.exists(path1, LinkOption.NOFOLLOW_LINKS);//true
        Files.isRegularFile(path1, LinkOption.NOFOLLOW_LINKS);//true
        Files.isDirectory(path1, LinkOption.NOFOLLOW_LINKS);//false
        Files.isHidden(path1);//false
        Files.isReadable(path1);//true
        Files.isWritable(path3);//false
        Files.notExists(path2);//true
    }
}
