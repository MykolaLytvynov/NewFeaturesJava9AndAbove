package ua.mykola.java14;

import java.util.Objects;

public class RecordTest {
    public static void main(String[] args) {
        Home home = new Home("Gogi 12");
        System.out.println(home.getStreet());

        HomeRecord homeRecord = new HomeRecord("Record 67");
        HomeRecord homeRecord2 = new HomeRecord();
        System.out.println(homeRecord.street());
        System.out.println(homeRecord2.street());

    }
}

record HomeRecord(String street) {
    public HomeRecord() {
        this("Default street");
    }
}



class Home {
    private final String street;

    Home(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Home home = (Home) o;
        return Objects.equals(street, home.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street);
    }

    @Override
    public String toString() {
        return "Home{" +
                "street='" + street + '\'' +
                '}';
    }
}
