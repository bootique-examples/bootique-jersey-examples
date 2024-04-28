package io.bootique.examples.jersey;

import io.bootique.BQModule;
import io.bootique.Bootique;
import io.bootique.di.Binder;
import io.bootique.jersey.JerseyModule;

/**
 * The main class that registers all components and starts the REST app
 */
public class App implements BQModule {

    public static void main(String[] args) {
        Bootique.app(args)
                // "App" module is not auto-loadable in this demo, so registering it explicitly
                .module(App.class)

                // all other modules will be discovered automatically via their
                // META-INF/services/io.bootique.BQModule descriptors
                .autoLoadModules()
                .exec()
                .exit();
    }

    @Override
    public void configure(Binder binder) {
        JerseyModule.extend(binder).addResource(HelloApi.class);
    }
}
