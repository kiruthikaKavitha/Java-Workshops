package com.vetias.java.workshop.basic;

public class Newlinestring {
    public static void main(String[] args) {
        String sentence = "this program show how can we split a String into multiple Strings";
        String words[]=sentence.split("");
        for(String word : words) {
            System.out.println(word);
        }    


    }
}
