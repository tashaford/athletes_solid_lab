package com.example.natashaford.solidlab;

/**
 * Created by natashaford on 27/06/2017.
 */

public class ViewLogger implements Logger {

    public ViewLogger(){

    }

    public void output(String string){
        System.out.println(string);
    }

}