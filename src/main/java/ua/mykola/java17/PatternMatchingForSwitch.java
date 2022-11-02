package ua.mykola.java17;

public class PatternMatchingForSwitch {
    public static void main(String[] args) {
        System.out.println(getNameObject(null));
    }

    public static String getNameObject(Object o) {
        return switch (o) {
            case null -> "It's null";
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case Double d  -> String.format("double %f", d);
            case String s  -> String.format("String %s", s);
            default        -> o.toString();
        };
    }
}
