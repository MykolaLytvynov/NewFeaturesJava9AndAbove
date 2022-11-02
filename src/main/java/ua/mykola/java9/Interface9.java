package ua.mykola.java9;

public interface Interface9 {

    private int getSmth() {
        return 12;
    }

    private int getSmth2() {
        return 121;
    }

    default int getSum() {
        return getSmth() + getSmth2();
    }
}
