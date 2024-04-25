[![build test](https://github.com/bootique-examples/bootique-rest-demo/actions/workflows/verify.yml/badge.svg)](https://github.com/bootique-examples/bootique-rest-demo/actions/workflows/verify.yml)

# Bootique 3.x REST Demo 

This is an example [Bootique](http://bootique.io) REST service app. It shows how to create and register REST 
endpoints, write integration tests for the REST API, assemble and run the application.

Different Git branches contain demo code for different versions of Bootique:

* [3.x](https://github.com/bootique-examples/bootique-rest-demo/)
* [2.x](https://github.com/bootique-examples/bootique-rest-demo/tree/2.x)
* [1.x](https://github.com/bootique-examples/bootique-rest-demo/tree/1.x)

To build and run the demo, ensure you have Java 11 or newer and then follow these steps:

### Checkout
```
git clone git@github.com:bootique-examples/bootique-rest-demo.git
cd bootique-rest-demo
```

### Build, test and package

Run the following command to build the code, run the tests and package the app:
```
mvn clean package
```
This project uses a [runnable jar with lib folder](https://bootique.io/docs/3.x/bootique-docs/#runnable-jar-with-lib)
packaging recipe, so now the app is packaged for distribution as `target/bootique-rest-demo-3.0.tar.gz` archive. But 
there is also the "unpacked" version in the `target` folder that can be used to run the app.

### Run

The following command prints a help message with supported options:
```
java -jar target/bootique-rest-demo-3.0.jar 
```

The following command runs the REST app with the default config. Once the app is started, you can see the results by
going to this URL in the browser: http://127.0.0.1:8080/
```
java -jar target/bootique-rest-demo-3.0.jar --server
```

The following command runs the REST app with a custom config, Once the app is started, you can see the results by
going to this URL in the browser: http://127.0.0.1:9000/bq
```
java -jar target/bootique-rest-demo-3.0.jar --server --config=test.yml
```
