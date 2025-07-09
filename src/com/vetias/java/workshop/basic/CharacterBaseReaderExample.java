package com.vetias.java.workshop.basic;
import java .io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterBaseReaderExample {
    public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("README.md")))  // Ensure the file path is correct
        {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An erroe occured while reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
