package prototype;

public class ComplexObject implements Copyable {
    private Object value;

    public ComplexObject(Object value) {
        this.value = value;
    }

    @Override
    public ComplexObject copy() {
        return new ComplexObject(value);
    }

    public Object getValue() {
        return value;
    }
}
