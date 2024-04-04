package org.example.N_19CODESIGNAL.Introduccion;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsIPv4Address {
    public boolean solution(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return false;
        }

        String[] octetos = inputString.split("\\.");

        if (octetos.length != 4) {
            return false;
        }

        for (String octeto : octetos) {
            try {
                int valor = Integer.parseInt(octeto);
                if (valor < 0 || valor > 255) {
                    return false; // Fuera de rango válido
                }
                if (octeto.length() > 1 && octeto.startsWith("0")) {
                    return false; // No puede tener ceros a la izquierda
                }
            } catch (NumberFormatException e) {
                return false; // No es un número válido
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IsIPv4Address isIPv4Address = new  IsIPv4Address();
        System.out.println(isIPv4Address.solution("172.16.254.1"));
        System.out.println(isIPv4Address.solution("172.316.254.1"));
        System.out.println(isIPv4Address.solution(".254.255.0"));
        System.out.println(isIPv4Address.solution("64.233.161.00"));
        System.out.println(isIPv4Address.solution("64.00.161.131"));
        System.out.println(isIPv4Address.solution("1.1.1.1a"));
        System.out.println(isIPv4Address.solution("1"));
    }
}
