package Specification;

import Interface.Specification;
import Model.Product;

public class CombineSpecification implements Specification<Product> {
    //TODO Could be interesting create a builder to create a Combine with multiples specifications

    private Specification<Product> firstSpec, secondSpec;

    public CombineSpecification(Specification<Product> firstSpec, Specification<Product> secondSpec) {
        this.firstSpec = firstSpec;
        this.secondSpec = secondSpec;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return firstSpec.isSatisfied(item) && secondSpec.isSatisfied(item);
    }
}
