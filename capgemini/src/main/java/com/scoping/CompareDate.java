package com.scoping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDate {
    public static void main(String[] args) throws ParseException {
        String first="12 3 2024";
        String second="12 3 2015";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        Date date1=sdf.parse(first);
        Date date2=sdf.parse(second);
        System.out.print(date2.compareTo(date2));
    }
}
