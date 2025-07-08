package com.vetias.java.workshop.basic;

import java.io.File;

public class Filehandling {
    public static void main(String[] args) {
        File file=new File("src");
        if(file.isDirectory()){
        System.out.println("The file exists:");
        if(file.isDirectory()){
            System.out.println("The file is a directory");
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        }
        } else {
            System.out.println("It is a file.");

        }
    }


}
