package abstract_factory.factory;

import abstract_factory.product.Diesel;
import abstract_factory.product.Petrol;

public interface AbstractFactory {
    Diesel createWithDieselEngine();

    Petrol createWithPetrolEngine();
}
