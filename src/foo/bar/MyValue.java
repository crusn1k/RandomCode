package foo.bar;

/**
 * Created by Nishikant on 10/14/2015.
 */
public class MyValue {
    private String name;
    private int revision;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public MyValue(String name, int revision) {
        this.name = name;
        this.revision = revision;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyValue myValue = (MyValue) o;
        return this.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MyValue{" +
                "name=" + name +
                ", revision=" + revision +
                '}';
    }
}
