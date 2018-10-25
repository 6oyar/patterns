import builder.Account;
import factory.method.*;
import prototype.ComplexObject;
import singleton.Singleton;

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
    }
}
