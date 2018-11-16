package abstract_factory.factory;

import abstract_factory.product.AbstractProductA;
import abstract_factory.product.AbstractProductB;

public interface AbstractFactory {
    AbstractProductA createProductA();

    AbstractProductB createProductB();
}
