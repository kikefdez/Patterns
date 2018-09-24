import Builder.PersonBuilder;
import Model.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("#############################################");
        System.out.println("# THIS IS A FACETED BUILDER PATTERN EXAMPLE #");
        System.out.println("####### USE MULTIPLES COMPLEX BUILDERS ######");
        System.out.println("#############################################");
        System.out.println();

        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                    .at("123 London Road")
                    .in("London")
                .works()
                    .at("Fabrikam")
                    .as("Engineer")
                .lives()
                    .withPostCode("SW12BC")
                .works()
                    .earing(123000)
                .build();

        System.out.println(person);

    }
}
