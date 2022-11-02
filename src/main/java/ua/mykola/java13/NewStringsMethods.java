package ua.mykola.java13;

public class NewStringsMethods {
    public static void main(String[] args) {

        //formatted
        String name = "ProfITsoft";
        String str = String.format("This Company name is %s", name);

        String textBlock = """
                <div>
                    <div>%s</div>
                </div>
                """;

        System.out.println(textBlock.formatted(name));

    }
}
