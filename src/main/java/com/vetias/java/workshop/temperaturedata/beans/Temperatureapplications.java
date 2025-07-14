package com.vetias.java.workshop.temperaturedata.beans;

import java.time.LocalDate;

public class Temperatureapplications {
    public static void main(String[]args){
        Organization org=new Organization("vet",
        "thindal erode",
        "WWW.vetias.com",
        "vetias@gmail.com",
        "6381925618",
        24221287,
        LocalDate.of(2025, 07, 14));
        System.out.println(org);


    }

}
