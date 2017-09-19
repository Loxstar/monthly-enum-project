package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Month> futMonths = new ArrayList();

        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a month!");
        for (Month mo : Month.values()) {
            System.out.println(mo.getEnglishName());
        }
        String moPick = scan.next();


        switch (moPick) {
            case "January":
                futMonths.add(Month.JANUARY);
            case "February":
                futMonths.add(Month.FEBRUARY);
            case "March":
                futMonths.add(Month.MARCH);
            case "April":
                futMonths.add(Month.APRIL);
            case "May":
                futMonths.add(Month.MAY);
            case "June":
                futMonths.add(Month.JUNE);
            case "July":
                futMonths.add(Month.JULY);
            case "August":
                futMonths.add(Month.AUGUST);
            case "September":
                futMonths.add(Month.SEPTEMBER);
            case "October":
                futMonths.add(Month.OCTOBER);
            case "November":
                futMonths.add(Month.NOVEMBER);
            case "December":
                futMonths.add(Month.DECEMBER);
                break;
            default:
                break;
        }

        if (futMonths.isEmpty()) {
            System.out.println("Invalid month");
        } else {
            for (Month monthName : futMonths) {
                System.out.println(monthName.getEnglishName());
            }
        }
    }
}