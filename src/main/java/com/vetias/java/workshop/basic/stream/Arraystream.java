package com.vetias.java.workshop.basic.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Arraystream {
    public static void main(String[] args) {
        int[] marks = {90,98,90,32,100,24};
        long numberofSubjectsPassed = Arrays.stream(marks)
        .filter(mark -> mark > 40).count();
        System.out.println(numberofSubjectsPassed);

        IntStream markstream = Arrays.stream(marks);
        numberofSubjectsPassed = markstream
        .filter(mark -> mark > 40).count();
    }

}
