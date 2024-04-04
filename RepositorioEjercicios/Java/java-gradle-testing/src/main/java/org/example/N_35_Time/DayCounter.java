package org.example.N_35_Time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DayCounter {
    public static void main(String[] args) {
        LocalDate startDay = LocalDate.of(2023, 9, 4);
        LocalDate endDay = LocalDate.of(2023, 12, 4);

        long totalDays = ChronoUnit.DAYS.between(startDay, endDay);
        System.out.println("Total dias entre la fecha inicio "+ startDay + " y la fecha " + endDay + " es: " + totalDays);

        long days = 0;
        for( LocalDate date = startDay; date.isBefore(endDay); date = date.plusDays(1) ){
            if (date.getDayOfWeek().equals(DayOfWeek.MONDAY)  || date.getDayOfWeek().equals(DayOfWeek.SATURDAY))
                days++;
        }
        System.out.println(days);
    }
}
