package org.example.N_23_CodeWars;

import java.util.HashMap;

public class Welcome {
    public static void main(String[] args) {
        System.out.println(greet("english"));
        System.out.println(greet("IP_ADDRESS_INVALID"));
    }
    public static String greet(String language){
        // your code
        HashMap<String, String> languages = new HashMap<>();
        languages.put("english", "Welcome");
        languages.put("czech", "Vitejte");
        languages.put("danish", "Velkomst");
        languages.put("dutch", "Welkom");
        languages.put("estonian", "Tere tulemast");
        languages.put("finnish", "Tervetuloa");
        languages.put("flemish", "Welgekomen");
        languages.put("french", "Bienvenue");
        languages.put("german",     "Willkommen");
        languages.put("irish", "Failte");
        languages.put("italian", "Benvenuto");
        languages.put("latvian", "Gaidits");
        languages.put("lithuanian",  "Laukiamas");
        languages.put("polish", "Witamy");
        languages.put("spanish", "Bienvenido");
        languages.put("swedish", "Valkommen");
        languages.put("welsh", "Croeso");
        return languages.get(language) == null?  languages.get("english") : languages.get(language);
    }
}
