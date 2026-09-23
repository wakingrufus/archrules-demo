package mylib;

import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.binder.jvm.ExecutorServiceMetrics;
import io.micrometer.core.instrument.simple.SimpleMeterRegistry;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyLibrary implements Closeable {
    private final MeterRegistry meterRegistry = new SimpleMeterRegistry();

    public ExecutorService fixedThreadPool(String name, int threads){
        final var pool =  Executors.newFixedThreadPool(threads);
        new ExecutorServiceMetrics(pool, name, Collections.emptyList()).bindTo(meterRegistry);
        return pool;
    }

    @Override
    public void close() throws IOException {
        meterRegistry.close();
    }
}
