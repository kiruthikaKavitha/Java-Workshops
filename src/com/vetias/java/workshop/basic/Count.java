package com.vetias.java.workshop.basic;

public class Count {
    public static void main(String[] args) {
        String sentence="this program show how can we split a String into multiple Strings";
        String[] words = sentence.split(" ");
        int num=words.length;
        System.out.println(num);
           

        
    }

}
