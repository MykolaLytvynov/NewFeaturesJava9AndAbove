package ua.mykola.java11;


public class NewMethodsString {
    public static void main(String[] args) {
        String s = "  d ";
        String s1 = "   ";
        String s2 = "";
        System.out.println(s.isBlank());
        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());


        String s3 = "repeat ";
        System.out.println(s3.repeat(1));

        String s4 = "test-test \n";
        s4.repeat(4).lines().forEach(System.out::println);

    }
}
