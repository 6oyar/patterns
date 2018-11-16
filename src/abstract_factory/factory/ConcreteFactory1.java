package abstract_factory.factory;

import abstract_factory.product.AbstractProductA;
import abstract_factory.product.AbstractProductB;
import abstract_factory.product.ProductA1;
import abstract_factory.product.ProductB1;

public class ConcreteFactory1 implements AbstractFactory {

    public static AbstractFactory instance = new ConcreteFactory1();

    public static AbstractFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
