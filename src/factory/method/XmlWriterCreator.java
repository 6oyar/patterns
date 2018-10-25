package factory.method;

public class XmlWriterCreator implements Creator {
    @Override
    public Writer factoryMethod() {
        return new XmlWriter();
    }
}
