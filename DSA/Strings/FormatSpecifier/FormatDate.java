package com.kodnest.DSA.Strings.FormatSpecifier;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {
    public static void main(String[] args) {
        // SimpleDateFormat    format dates in various way
        // dd/MM/yyyy
        // MM-dd-yyyy
        // E, MMM dd yyyy: Day of the week(like monday), Month, Day,Year

      Date today = new Date();

        SimpleDateFormat sdf  = new SimpleDateFormat("E, MMM dd yyyy");
        System.out.println("Today's date: " + sdf.format(today));
    }
}
