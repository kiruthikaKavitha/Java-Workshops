package array;

import java.util.Arrays;

public class twodimensional {
    public static void main(String[]args){
        String employedetails[][]=new String[5][2];
        employedetails[0][0]="101001" ;
        employedetails[0][1]="1000000";
        employedetails[1][0]="100004";
        employedetails[1][1]="1000000";
        employedetails[2][0]="100005";
        employedetails[2][1]="1000000";
        employedetails[3][0]="100006";
        employedetails[3][1]="1000000";
        employedetails[4][0]="100007";
        employedetails[4][1]="1000000";
        for(String[] employee:employedetails){
            System.out.println(Arrays.toString(employee));
        }
}} 
        


        



