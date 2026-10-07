package com.example.javafxdb261007;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvLoader {
    public static final String dirPath = "C:/Delete/VA/Java/javafx-db-261007";
    public static Dotenv dotenv = Dotenv.configure()
        .directory(dirPath)
            .load();
    public static String get(String key) {
        return dotenv.get(key);
    }
    public static String get(String key, String defaultValue) {
        return dotenv.get(key, defaultValue);
    }
}
