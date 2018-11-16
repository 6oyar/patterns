package abstract_factory.factory;

import abstract_factory.product.AbstractProductA;
import abstract_factory.product.AbstractProductB;
import abstract_factory.product.ProductA2;
import abstract_factory.product.ProductB2;

public class ConcreteFactory2 implements AbstractFactory {

    public static AbstractFactory instance = new ConcreteFactory2();

    public static AbstractFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
