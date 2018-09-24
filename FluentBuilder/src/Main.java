import Model.HtmlBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("############################################");
        System.out.println("# THIS IS A FLUENT BUILDER PATTERN EXAMPLE #");
        System.out.println("############################################");
        System.out.println();

        HtmlBuilder builder = new HtmlBuilder("ul");
        builder
                .addChild("li", "hello")
                .addChild("li", "world");

        System.out.println(builder.toString());
    }
}
