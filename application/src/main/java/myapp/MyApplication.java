package myapp;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

import java.util.concurrent.Executors;

public class MyApplication {
    public static void main(String[] args) {
        final var now = DateTime.now();
        final var pool = Executors.newFixedThreadPool(2);
        System.out.println(now.toString(ISODateTimeFormat.dateTime()));
        pool.close();
    }
}
