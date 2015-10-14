package foo.bar;

/**
 * Created by Nishikant on 10/14/2015.
 */
class MyValue {
    private String value;
    private int revision;

    MyValue(String value, int revision) {
        this.value = value;
        this.revision = revision;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    @Override
    public String toString() {
        return "MyValue{" +
                "value=" + value +
                ", revision=" + revision +
                '}';
    }
}
