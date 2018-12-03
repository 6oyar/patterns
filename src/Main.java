import abstract_factory.factory.DieselEngineVehicleFactory;
import abstract_factory.factory.PetrolEngineVehicleFactory;
import abstract_factory.product.DieselEngineCar;
import abstract_factory.product.PetrolEngineCar;
import abstract_factory.product.DieselEngineTruck;
import abstract_factory.product.PetrolEngineTruck;
import builder.Account;
import factory_method.JsonWriter;
import factory_method.JsonWriterCreator;
import factory_method.XmlWriter;
import factory_method.XmlWriterCreator;
import prototype.ComplexObject;
import singleton.President;
import strategy.Context;
import strategy.Addition;
import strategy.Multiplication;

public class Main {
    public static void main(String[] args) {

        //Синглетон
        President instance = President.INSTANCE;
        instance.setValue(new Object());
        assert instance.getValue() != null;


        //Билдер
        Account account = Account.newBuilder()
                .token("hello")
                .userId("world")
                .userName("!")
                .build();

        assert account != null && account.getToken().equals("hello")
                && account.getUserId().equals("world")
                && account.getUserName().equals("!");


        //Фабричный метод
        assert new JsonWriterCreator().factoryMethod() instanceof JsonWriter;
        assert new XmlWriterCreator().factoryMethod() instanceof XmlWriter;


        //Прототип
        ComplexObject prototype = new ComplexObject(10);
        ComplexObject copied = prototype.copy();
        assert copied.getValue() == prototype.getValue() && prototype != copied;


        //Стратегия
        Context context = new Context();
        context.setStrategy(new Multiplication());
        assert  context.executeStrategy(10, 10) == 100;
        context.setStrategy(new Addition());
        assert context.executeStrategy(10, 10) == 20;

        //Абстрактная фабрика
        assert DieselEngineVehicleFactory.getInstance().createCar() instanceof DieselEngineCar;
        assert PetrolEngineVehicleFactory.getInstance().createCar() instanceof PetrolEngineCar;
        assert DieselEngineVehicleFactory.getInstance().createTruck() instanceof DieselEngineTruck;
        assert PetrolEngineVehicleFactory.getInstance().createTruck() instanceof PetrolEngineTruck;
    }
}
