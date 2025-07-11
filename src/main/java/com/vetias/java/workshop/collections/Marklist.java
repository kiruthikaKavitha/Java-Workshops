package com.vetias.java.workshop.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Marklist {

    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(70,80,90,32,100,24);
        marks.stream().sorted().forEach(System.out::println);
        marks.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
