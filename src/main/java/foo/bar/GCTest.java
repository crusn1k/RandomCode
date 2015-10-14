package foo.bar;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * -XX:+DisableExplicitGC -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=68 -XX:+CMSIncrementalMode -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:MaxNewSize=21757952
 */
class Container {
    private int i = 0;

    Container(int i) {
        this.i = i;
    }
}

public class GCTest {
    public static void main(String[] args) throws InterruptedException {
        List<Container> containers = new ArrayList<>();

        for (int i = 0; i != 1000000; ++i) {
            containers.add(new Container(i));
        }

        for (int i = 0; i < 100000 / 2; ++i) {
            containers.remove(i);
        }

        //System.gc();
        System.out.println("GC started?");
        TimeUnit.MINUTES.sleep(100);
    }
}
