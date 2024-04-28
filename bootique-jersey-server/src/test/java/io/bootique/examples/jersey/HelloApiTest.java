package io.bootique.examples.jersey;

import io.bootique.BQRuntime;
import io.bootique.Bootique;
import io.bootique.jetty.junit5.JettyTester;
import io.bootique.junit5.BQApp;
import io.bootique.junit5.BQTest;
import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

@BQTest
public class HelloApiTest {

    static final JettyTester tester = JettyTester.create();

    @BQApp
    static final BQRuntime app = Bootique.app("--server")
            .autoLoadModules()
            .module(App.class)
            .module(tester.moduleReplacingConnectors())
            .createRuntime();

    @Test
    void sayHello() {
        Response r = tester.getTarget().request().get();
        JettyTester.assertOk(r).assertContent("{\"message\":\"Hello, Bootique!!\"}");
    }
}
