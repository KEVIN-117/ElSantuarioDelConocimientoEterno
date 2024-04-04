package org.example.N_23_CodeWars;

import java.util.Arrays;

public class YouOnlyNeedOne {
    public static void main(String[] args) {

        System.out.println(check(new Object[] {1, 3, 4, 5, 6}, 6));
        System.out.println(check(new Object[] {66, 101}, 66));
        System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(check(new Object[] {'t', 'e', 's', 't'}, 'e'));
        System.out.println(check(new Object[] {"what", "a", "great", "kata"}, "kat"));
    }
    public static Boolean check(Object[] a, Object x) {
        Object item = null;
        int index = 0;
        while (index < a.length){
            if (a[index] == x){
                return true;
            }
            index++;
        }
        return false;
    }
    public static boolean check2(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
    public static boolean check3(Object[] a, Object x) {
        return Arrays.stream(a)
                .anyMatch(i -> x.equals(i));
    }
    public static boolean check4(Object[] a, Object x) {
        return Arrays.stream(a).filter(obj -> obj == x).findAny().isPresent();
    }

}
