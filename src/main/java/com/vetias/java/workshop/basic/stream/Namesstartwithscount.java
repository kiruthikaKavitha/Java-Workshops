package com.vetias.java.workshop.basic.stream;

import java.util.ArrayList;
import java.util.List;

public class Namesstartwithscount {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("kiru");
        names.add("nivetha");
        names.add("rithu");
        names.add("viru");
        names.add("nisha");
        names.add("nidhar");
        names.add("gokool");
        long namecount=names.stream()
                .filter(name -> name.startsWith("n")).count();
                System.out.println(namecount);
    }
}
