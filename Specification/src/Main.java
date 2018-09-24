import Model.Product;
import Enum.*;
import Model.ProductFilter;
import Specification.ColorSpecification;
import Specification.CombineSpecification;
import Specification.SizeSpecification;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("###########################################");
        System.out.println("# THIS IS A SPECIFICATION PATTERN EXAMPLE #");
        System.out.println("###########################################");
        System.out.println();

        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.WHITE, Size.YUGE);

        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(tree);
        products.add(house);

        ProductFilter filter1 = new ProductFilter();
        filter1.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(product -> System.out.println(product.getName() + " is Green"));

        System.out.println();

        ProductFilter filter2 = new ProductFilter();
        filter2.filter(products, new CombineSpecification(
                new ColorSpecification(Color.GREEN),
                new SizeSpecification(Size.SMALL)
        )).forEach(product -> System.out.println(product.getName() + " is Green & Small"));

    }
}
