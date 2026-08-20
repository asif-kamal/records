public class RegularExpressions {
    public static void main(String[] args) {
        String helloWorld = "%s %s".formatted("Hello", "World");
        String helloWorld2 = String.format("%s %s", "Hello", "World");
        System.out.println("with formatted method: " + helloWorld);
        System.out.println("with format method: " + helloWorld2);
    }
}
