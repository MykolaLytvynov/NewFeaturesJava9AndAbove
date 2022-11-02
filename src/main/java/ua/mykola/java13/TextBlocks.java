package ua.mykola.java13;

public class TextBlocks {
    public static void main(String[] args) {
        String str1 = "Select e.name, e.salary from employees as e" +
                "where e.department = \"DEV\"" +
                "order by e.lastName;";

        String str2 = """
                Select e.name, e.salary from employees as e
                where e.department = "DEV"
                order by e.lastName;
                """;
        System.out.println(str2);

        String JSON_STRING
                = "{\r\n" + "\"name\" : \"Mykola\",\r\n" + "\"website\" : \"https://www.mykola.com/\"\r\n" + "}";

        String TEXT_BLOCK_JSON = """
                    {
                        "name" : "Mykola",
                        "website" : "https://www.mykola.com/"
                    }
                    """;

        System.out.println(JSON_STRING);
        System.out.println(TEXT_BLOCK_JSON);
    }

}
