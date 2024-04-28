# Bootique 3.x Jersey Server Example

This is an example [Bootique](http://bootique.io) REST service app with Jersey. It shows how to create and register REST 
endpoints, write integration tests for the REST API, assemble and run the application.

## Build, test and package

Run the following command to build the code, run the tests and package the app:
```
cd jersey-server-example/
mvn clean package
```
This project uses a [runnable jar with lib folder](https://bootique.io/docs/3.x/bootique-docs/#runnable-jar-with-lib)
packaging recipe, so now the app is packaged for distribution as `target/jersey-server-example-3.0.tar.gz` archive. But 
there is also the "unpacked" version in the `target` folder that can be used to run the app.

## Run

The following command prints a help message with supported options:
```
java -jar target/jersey-server-example-3.0.jar 
```

The following command runs the REST app with the default config. Once the app is started, you can see the results by
going to this URL in the browser: http://127.0.0.1:8080/
```
java -jar target/jersey-server-example-3.0.jar --server
```

The following command runs the REST app with a custom config that changes the app port and context, Once the app is
started, you can see the results by going to this URL in the browser: http://127.0.0.1:9000/bq
```
java -jar target/jersey-server-example-3.0.jar --server --config=config.yml
```
