package com.vetias.java.workshop.basic;
import java.util.Arrays;

public class Twodimensional {
    public static void main(String[] args) {
        String employeedetails[][]=new String[5][2];
        employeedetails[0][0]="1002";
        employeedetails[0][1]="13200";
        employeedetails[1][0]="1003";
        employeedetails[1][1]="14200";      
        employeedetails[2][0]="1004";
        employeedetails[2][1]="15200";
        employeedetails[3][0]="1005";
        employeedetails[3][1]="16200";
        employeedetails[4][0]="1006";
        employeedetails[4][1]="17200";
        for (String[] employee : employeedetails) {
            System.out.println(Arrays.toString(employee));
        }
    }  
}  




        
    

