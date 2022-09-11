package com.bridgelabz.empolyeepayroll;

import java.io.File;

public class FileUtils {
    public static boolean toDeleteFiles(File contents){
      File [] allContents  = contents.listFiles();
      if(allContents!= null){
          for(File file : allContents){
              toDeleteFiles(file);
          }
      }
      return contents.delete();
    }

}
