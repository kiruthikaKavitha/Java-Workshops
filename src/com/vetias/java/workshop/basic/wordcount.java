package com.vetias.java.workshop.basic;



public class wordcount {
    public static void main(String[] args) {
        String sentence = "this program show how can we split a String into multiple Strings. we need to find sentence";
        String sen[] = sentence.split("\\. ");
        int line=sen.length;
           System.out.println("no of lines:"+ line);

           String word[]=sentence.split(" ");
           int wordcount=word.length;
           System.out.println("no of words:"+wordcount);
           String letter[] = sentence.split("");
            int Letters=letter.length;
              System.out.println("no of letters:"+Letters);

        }
    }


