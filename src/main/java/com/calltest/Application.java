package com.calltest;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        CallTest goCSV = new CallTest("C:\\workspace\\gpethospital20220922.csv");
        String[] line = null;
        while((line = goCSV.nextRead())!=null){
            for(String a : line){
                System.out.print(a +" ");
            }
            System.out.println();
        }
    }
}
