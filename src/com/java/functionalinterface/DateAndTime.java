package com.java.functionalinterface;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalDate nw=LocalDate.now().plusDays(5);
        System.out.println(nw);
        String mail="MERAJQURAISHI9670@GMAIL.COM";
     String low=   mail.toLowerCase();
        System.out.println(low);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("DD-MM-YYYY");
        String dateformate=nw.format(formatter);
        System.out.println(dateformate);

        String dateString ="14-01-2025";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed Date: " + parsedDate);
    }

}
