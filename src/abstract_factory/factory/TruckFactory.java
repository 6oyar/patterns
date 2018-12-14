package abstract_factory.factory;

import abstract_factory.product.*;

public class TruckFactory implements AbstractFactory {

    private static AbstractFactory instance = new TruckFactory();

    public static AbstractFactory getInstance() {
        return instance;
    }

    @Override
    public Diesel createWithDieselEngine() {
        return new DieselEngineTruck();
    }

    @Override
    public Petrol createWithPetrolEngine() {
        return new PetrolEngineTruck();
    }
}
