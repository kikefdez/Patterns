package Specification;

import Interface.Specification;
import Enum.*;
import Model.Product;

public class SizeSpecification implements Specification<Product> {
    private Size Size;

    public SizeSpecification(Size Size) {
        this.Size = Size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.getSize() == this.Size;
    }
}