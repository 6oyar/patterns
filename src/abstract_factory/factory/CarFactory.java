package abstract_factory.factory;

import abstract_factory.product.*;

public class CarFactory implements AbstractFactory {

    private static AbstractFactory instance = new CarFactory();

    public static AbstractFactory getInstance() {
        return instance;
    }

    @Override
    public Diesel createWithDieselEngine() {
        return new DieselEngineCar();
    }

    @Override
    public Petrol createWithPetrolEngine() {
        return new PetrolEngineCar();
    }
}
