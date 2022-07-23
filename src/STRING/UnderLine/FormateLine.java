package STRING.UnderLine;

public class FormateLine {
    public static void main(String[] args) {
        String name = "Maxim";
        int birthYear = 1986;
        // {"name" : "Maxim", "birthYear": "1986"}

        String template = "{\"name\" : \"%s\", \"birthYear\": \"%d\"}";
        //String te = String.format(template, name, birthYear);
        //System.out.println(template, name, birthYear);

    }
}
