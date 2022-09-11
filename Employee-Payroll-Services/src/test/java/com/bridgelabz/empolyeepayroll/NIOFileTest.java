package com.bridgelabz.empolyeepayroll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class NIOFileTest {
    /**
     * File operation are performed:
     * File exists or not
     * if file exists,then delete
     * to create new file directory
     * and also create new files
     * then,print files and directories
     */
    //here,it checks for the home directory
    private static String HOME = System.getProperty("user.home");

    private static String PLAY_WITH_NIO = "TempGround";

    @Test

    public void givenPathWhenChecked_ThenConfirm() throws IOException {
        //to check file exists

        Path homePath = Paths.get(HOME);
        Assertions.assertTrue(Files.exists(homePath));

        //to delete files and check the files not exists
        Path playPath = Paths.get(HOME + "/" + PLAY_WITH_NIO );
        if(Files.exists(playPath))
            FileUtils.toDeleteFiles(playPath.toFile());
        Assertions.assertTrue(Files.notExists(playPath));

        //to create Directory
        Files.createDirectory(playPath);
        Assertions.assertTrue(Files.exists(playPath));

        //to create files

        IntStream.range(1,10).forEach(count -> {
            Path tempFile = Paths.get(playPath + "/temp" + count);
            Assertions.assertTrue(Files.notExists(tempFile));
            try {
                Files.createFile(tempFile);
            }catch(IOException e){}
            Assertions.assertTrue(Files.exists(tempFile));


        });
            //to list all files ,directories and also the files with extenstions

            Files.list(playPath).filter(Files :: isRegularFile).forEach(System.out::println);
            Files.newDirectoryStream(playPath).forEach(System.out :: println);
            Files.newDirectoryStream(playPath , path -> path.toFile().isFile() &&
            path.toString().startsWith("temp")).forEach(System.out::println);


        }}




