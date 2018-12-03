package abstract_factory.factory;

import abstract_factory.product.AbstractProductA;
import abstract_factory.product.AbstractProductB;
import abstract_factory.product.PetrolEngineCar;
import abstract_factory.product.PetrolEngineTruck;

public class PetrolEngineVehicleFactory implements AbstractFactory {

    private static AbstractFactory instance = new PetrolEngineVehicleFactory();

    public static AbstractFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractProductA createCar() {
        return new PetrolEngineCar();
    }

    @Override
    public AbstractProductB createTruck() {
        return new PetrolEngineTruck();
    }
}
