package com.company;

import java.util.Scanner;

public class Main {
    /**
     * Кундорго enum тузунуз (Monday, Tuesday ...)
     * консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм" же Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм" деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
     * Жуманын кундорун кыргыз тилинде корсотунуз.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            switch (scanner.nextLine().toUpperCase()) {
                case ("MONDAY") -> System.out.println(Days.MONDAY.getDays());
                case ("TUESDAY") -> System.out.println(Days.TUESDAY.getDays());
                case ("WEDNESDAY") -> System.out.println(Days.WEDNESDDAY.getDays());
                case ("THURDAY") -> System.out.println(Days.THURSDAY.getDays());
                case ("FRIDAY") -> System.out.println(Days.FRIDAY.getDays());
                case ("SATURDAY") -> System.out.println(Days.SATURDAY.getDays());
                case ("SUNDAY") -> System.out.println(Days.SUNDAY.getDays());
            }
        }
    }
}
