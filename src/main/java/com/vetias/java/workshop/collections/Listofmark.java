package com.vetias.java.workshop.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listofmark {
    public static void main(String[] args){
        List<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(90);
        marks.add(78);
        marks.add(88);
        marks.add(92);

        System.out.println("Original marks: " + marks);
        Collections.sort(marks);
        System.out.println("Marks in ascending order: " + marks);
        Collections.sort(marks, Collections.reverseOrder());
        System.out.println("Marks in descending order: " + marks);



    }

}
