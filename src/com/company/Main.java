package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> arList = new ArrayList<>();

    public static void main(String[] args) {
        //creating File instance to reference text file in Java
        File text = new File("C:/Users/Administrator/FilesReaderMitScanner/src/CSV/email.csv");

        //Creating Scanner instance to read File in Java
        try {
            Scanner scnr = new Scanner(text);

            //Reading each line of the file using Scanner class

            while (scnr.hasNextLine()) {
                arList.add(scnr.nextLine());
            }
        }catch (Exception e){
            System.out.println("Fehler");
        }

        for (String s : arList) {
            System.out.println(s);
        }
    }
}
