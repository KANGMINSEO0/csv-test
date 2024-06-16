package com.calltest.test1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        readCSV();
    }

    public static void readCSV() {
        try {
            File file = new File("C:\\workspace\\gpethospital20220922.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "EUC-KR"));
            String line;
            while ((line = br.readLine())!=null) {
                List<String> aLine = new ArrayList<String>();
                String[] lineArr = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)",-1);
                aLine = Arrays.asList(lineArr);
                System.out.println(aLine);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
