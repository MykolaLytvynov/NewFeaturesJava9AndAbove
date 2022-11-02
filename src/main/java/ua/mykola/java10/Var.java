package ua.mykola.java10;

import java.util.ArrayList;

public class Var {


    public static void main(String[] args) {
        System.out.println(getVar());
    }

    public static String getVar() {
        var arr = new int [5];
        var list = new ArrayList<Integer>();
        var intVar = 34;
        var str = "var";
        str = "new var";

//        Будет ошибка компиляции (Т.к. другой тип при инициализации)
//        str = 12;

        return str;
    }
}
