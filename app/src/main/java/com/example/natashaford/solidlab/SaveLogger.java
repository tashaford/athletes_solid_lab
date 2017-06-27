package com.example.natashaford.solidlab;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class SaveLogger implements Logger {

    public SaveLogger(){

    }

    public void output(String string){
        File file = new File ("/file.txt");
        try
        {
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("file.txt"), true));
            printWriter.println(string);
            printWriter.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("PROBLEM");
        }
    }
}
