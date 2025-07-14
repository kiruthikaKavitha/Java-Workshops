package com.vetias.java.workshop.temperaturedata.beans;

import java.time.LocalDate;

public record Organization(String name,
    String completeAddress,
    String Website,
    String email,
    String contactNumber,
    long registrationNumber,
    LocalDate registrationDate) {
        
    }

    
     



