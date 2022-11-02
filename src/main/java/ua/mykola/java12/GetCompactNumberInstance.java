package ua.mykola.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class GetCompactNumberInstance {
    public static void main(String[] args) {
        //CompactNumberFormat extends NumberFormat
        NumberFormat fmtLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        System.out.println(fmtLong.format(100));
        System.out.println(fmtLong.format(1000));
        System.out.println(fmtLong.format(10000));

        NumberFormat fmtShort = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.SHORT);

        System.out.println(fmtShort.format(100));
        System.out.println(fmtShort.format(1000));
        System.out.println(fmtShort.format(19999));
        System.out.println(fmtShort.format(10000));
    }
}
