package factory_method;

public class JsonWriterCreator implements Creator {

    @Override
    public Writer factoryMethod() {
        return new JsonWriter();
    }
}
