package ex_09_Switch;

import java.util.Scanner;

public class Lab_Switch_Baiscs {

    public static void main(String[] args) {
        //if we have mutiple condition or statement
        //user- enter int number from 1 to 7
        // which day it is
        //1- mon,2-tues,3-wed,4-thru,5-fri,6,Sat,7-Sun
        //other than these number -invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day number");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("MON");
                break;


            case 2:
                System.out.println("TUE");
                break;

            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THRUS");
                break;

            case 5:
                System.out.println("FRI");
                break;

            case 6:
                System.out.println("SAT");
                break;

            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("not idea what is the date");
        }
    }
}