import Model.EmployeeBuilder;
import Model.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("#####################################################");
        System.out.println("# THIS IS AN ADVANCE FLUENT BUILDER PATTERN EXAMPLE #");
        System.out.println("########### USING JAVA RECURSIVE GENERICS ###########");
        System.out.println("#####################################################");
        System.out.println();

        EmployeeBuilder builder = new EmployeeBuilder();
        Person dimitri = builder
                .withName("Dimitri")
                .worksAt("Developer")
                .build();

        System.out.println(dimitri);
    }
}
