# Bootique 3.x Jersey Server Example

This is an example [Bootique](http://bootique.io) HTTP client app written with Jersey.


## Build, test and package

Run the following command to build the code, run the tests and package the app:
```
cd jersey-client-example/
mvn clean package
```
This project uses a [runnable jar with lib folder](https://bootique.io/docs/3.x/bootique-docs/#runnable-jar-with-lib)
packaging recipe, so now the app is packaged for distribution as `target/jersey-client-example-3.0.tar.gz` archive. But 
there is also the "unpacked" version in the `target` folder that can be used to run the app.

## Run

The following command prints a help message with supported options:
```
java -jar target/jersey-client-example-3.0.jar 
```

And now you can run the command with any public URL to retrieve the URL contents. E.g.:
```
java -jar target/jersey-client-example-3.0.jar --read --url=https://google.com
```