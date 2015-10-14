package foo.bar;

/**
 * Created by Nishikant on 10/14/2015.
 */
public class MyValue {
    private String value;
    private int revision;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public MyValue(String value, int revision) {
        this.value = value;
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
