package Model;

import Interface.Filter;
import Interface.Specification;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter implements Filter<Product> {

    /**
    public Stream<Product> filterByColor(List<Product> products, Color color){
        return products.stream().filter(product -> product.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size){
        return products.stream().filter(product -> product.getSize() == size);
    }

    public Stream<Product> filterBySizeAndColor(List<Product> products, Color color, Size size){
        return products.stream().filter(
                product -> product.getSize() == size
                && product.getColor() == color
        );
    }

    ......

    It would be neccesary create a new method for each combination

    */


    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(product -> spec.isSatisfied(product));
    }
}
