package ua.mykola.java12;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchExpressions {
    public static void main(String[] args) {

        //old
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";
        }

        System.out.println(typeOfDay);

        //new
        typeOfDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Working Day";
            case SATURDAY, SUNDAY -> "Day Off";
        };

        System.out.println(typeOfDay);


        String input = "Str4";
        String output = switch (input) {
            case "Str1", "Str2" -> "OUTPUT1";
            case "Str3" -> "OUTPUT2";
//            default -> "OUTPUT3";
            default -> {
                yield input.transform(String::toUpperCase);
            }
        };
        System.out.println(output);


//        String input1 = "var1";
//        final String var1 = "var1";
//        final String var2 = "var2";
//        final String var3 = "var3";
//        String output1 = switch (input) {
//            case var1 -> "VAR1";
//            case var2, var3 -> "VAR1-2";
//            default -> "NO VAR";
//        };
//        System.out.println(output1);
    }
}
