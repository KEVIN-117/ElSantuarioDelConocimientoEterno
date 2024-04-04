package org.example.N_28_POO.Inheritance.Example_2.Enums;

public enum Locale {
    ENGLISH("en", "US"),
    SPANISH("es", "ES"),
    FRENCH("fr", "FR"),
    GERMAN("de", "DE"),
    ITALIAN("it", "IT"),
    JAPANESE("ja", "JP"),
    KOREAN("ko", "KR"),
    CHINESE("zh", "CN"),
    RUSSIAN("ru", "RU"),
    ARABIC("ar", "SA");

    private final String languageCode;
    private final String regionCode;

    Locale (String languageCode, String regionCode) {
        this.languageCode = languageCode;
        this.regionCode = regionCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getRegionCode() {
        return regionCode;
    }
}
