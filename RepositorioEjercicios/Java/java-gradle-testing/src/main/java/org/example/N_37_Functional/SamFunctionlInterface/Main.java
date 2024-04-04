package org.example.N_37_Functional.SamFunctionlInterface;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> addCero = x -> x < 10 ? "0" + x : String.valueOf(x);

        TernaryRunnable<Integer, Integer, Integer, LocalDate> parseDate = (year, month, day) -> LocalDate.parse(year + "-" + addCero.apply(month) + "-" + addCero.apply(day));

        TernaryRunnable<Integer, Integer, Integer, Integer> calculateAge = (year, month, day) -> Period.between(parseDate.apply(year, month, day), LocalDate.now()).getYears();

        System.out.println(calculateAge.apply(2001, 12, 17));
        System.out.println(calculateAge.apply(2000, 2, 12));

        System.out.println("--------------------------------------------------");
        Operable<Integer, LocalDate> parseDate2 = (year, month, day) -> LocalDate.parse(year + "-" + addCero.apply(month) + "-" + addCero.apply(day));

        Operable<Integer, Integer> calculateAge2 = (year, month, day) -> Period.between(parseDate2.apply(year, month, day), LocalDate.now()).getYears();

        System.out.println(calculateAge2.apply(2001, 12, 17));
        System.out.println(calculateAge2.apply(2000, 2, 12));


    }
}
