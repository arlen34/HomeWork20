package com.company;

public enum Days {
    MONDAY("Дуйшомбу куну Java"),
    TUESDAY("Шейшемби куну английский"),
    WEDNESDDAY("Шаршемби куну Java"),
    THURSDAY("Бейшемби куну Soft skills"),
    FRIDAY("Жума куну Java "),
    SATURDAY("Ишемби куну сабак жок"),
    SUNDAY("Жекшемби куну курс жок.");

    private final String days;

    Days(String days) {
        this.days = days;
    }

    public String getDays() {
        return days;
    }
}