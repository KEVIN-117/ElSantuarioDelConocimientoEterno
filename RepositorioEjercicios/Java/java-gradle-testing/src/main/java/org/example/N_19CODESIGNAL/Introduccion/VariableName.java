package org.example.N_19CODESIGNAL.Introduccion;

import org.example.N_28_POO.GuiStudents.management.Matter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableName {
    boolean solution(String name) {
        Pattern pattern = Pattern.compile("^[a-zA-Z_+][a-zA-Z0-9_+]*$");

        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
            return true;
        return false;
    }

    public static void main(String[] args) {
        VariableName variableName = new VariableName();
        System.out.println(variableName.solution("var_1__Int"));
        System.out.println(variableName.solution("0ss"));
        System.out.println(variableName.solution(" variable"));
    }
}
