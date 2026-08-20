public class RegularExpressions {
    public static void main(String[] args) {
        String helloWorld = "%s %s".formatted("Hello", "World");
        String helloWorld2 = String.format("%s %s", "Hello", "World");
        System.out.println("with formatted method: " + helloWorld);
        System.out.println("with format method: " + helloWorld2);

        String helloWorld3 = RegularExpressions.format("%s %s", "Hello", "World");
        System.out.println("with custom format method: " + helloWorld3);
    }

    private static String format(String regexp, String... args) {

        int index = 0;
        while (regexp.matches(".*%s.*")) {
            regexp = regexp.replaceFirst("%s", args[index++]);
        }
        return regexp;
    }
}
