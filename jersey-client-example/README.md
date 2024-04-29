# Bootique 3.x Jersey Server Example

This is an example [Bootique](http://bootique.io) HTTP client app written with Jersey.


## Build, test and package

Run the following command to build the code, run the tests and package the app:
```
cd jersey-client-example/
mvn clean package
```

## Run

The following command prints a help message with supported options:
```
java -jar target/jersey-client-example-3.0.jar 
```

And now you can run the command with any public URL to retrieve the URL contents. E.g.:
```
java -jar target/jersey-client-example-3.0.jar --read --url=https://google.com
```