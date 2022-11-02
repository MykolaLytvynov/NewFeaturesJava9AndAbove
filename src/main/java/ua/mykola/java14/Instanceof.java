package ua.mykola.java14;


public class Instanceof {
    public static void main(String[] args) {

        //Было
        if (getObject() instanceof String) {
            String s = (String) getObject();
            System.out.println(s.toUpperCase());
        }

        if (getObject() instanceof Integer) {
            Integer i = (Integer) getObject();
            System.out.println(i + 12);
        }

//        //Новый подход
//        if (getObject() instanceof String s) {
//            System.out.println(s.toUpperCase());
//        }
//
//        if (getObject() instanceof Integer i) {
//            System.out.println(i + 12);
//        }
    }


    public static Object getObject() {
        return "Str";
//        return 10;
    }
}
