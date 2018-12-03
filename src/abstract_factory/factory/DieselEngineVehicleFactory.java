package abstract_factory.factory;

import abstract_factory.product.AbstractProductA;
import abstract_factory.product.AbstractProductB;
import abstract_factory.product.DieselEngineCar;
import abstract_factory.product.DieselEngineTruck;

public class DieselEngineVehicleFactory implements AbstractFactory {

    private static AbstractFactory instance = new DieselEngineVehicleFactory();

    public static AbstractFactory getInstance() {
        return instance;
    }

    @Override
    public AbstractProductA createCar() {
        return new DieselEngineCar();
    }

    @Override
    public AbstractProductB createTruck() {
        return new DieselEngineTruck();
    }
}
