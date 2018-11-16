import abstract_factory.factory.ConcreteFactory1;
import abstract_factory.factory.ConcreteFactory2;
import abstract_factory.product.ProductA1;
import abstract_factory.product.ProductA2;
import abstract_factory.product.ProductB1;
import abstract_factory.product.ProductB2;
import builder.Account;
import factory_method.JsonWriter;
import factory_method.JsonWriterCreator;
import factory_method.XmlWriter;
import factory_method.XmlWriterCreator;
import prototype.ComplexObject;
import singleton.Singleton;
import strategy.Context;
import strategy.StrategyAdd;
import strategy.StrategyMultiply;

public class Main {
    public static void main(String[] args) {

        //Синглетон
        Singleton instance = Singleton.INSTANCE;
        instance.setValue(10);
        assert instance.getValue() == 10;


        //Билдер
        Account account = Account.newBuilder()
                .token("hello")
                .userId("world")
                .userName("!")
                .build();

        assert account != null && account.getToken().equals("hello") && account.getUserId().equals("world");


        //Фабричный метод
        assert new JsonWriterCreator().factoryMethod() instanceof JsonWriter;
        assert new XmlWriterCreator().factoryMethod() instanceof XmlWriter;


        //Прототип
        ComplexObject prototype = new ComplexObject(10);
        ComplexObject copied = prototype.copy();
        assert copied.getValue() == prototype.getValue() && prototype != copied;


        //Стратегия
        Context context = new Context();
        context.setStrategy(new StrategyMultiply());
        assert  context.executeStrategy(10, 10) == 100;
        context.setStrategy(new StrategyAdd());
        assert context.executeStrategy(10, 10) == 20;

        //Абстрактная фабрика
        assert  ConcreteFactory1.getInstance().createProductA() instanceof ProductA1;
        assert ConcreteFactory2.getInstance().createProductA() instanceof ProductA2;
        assert ConcreteFactory1.getInstance().createProductB() instanceof ProductB1;
        assert ConcreteFactory2.getInstance().createProductB() instanceof ProductB2;
    }
}
