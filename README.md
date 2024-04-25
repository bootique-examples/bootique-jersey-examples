[![verify](https://github.com/bootique-examples/bootique-rest-demo/actions/workflows/verify.yml/badge.svg)](https://github.com/bootique-examples/bootique-rest-demo/actions/workflows/verify.yml)

Simple [Bootique](http://bootique.io) REST service demo app. Different versions of Bootique are shown on different 
branches:

* [3.x](https://github.com/bootique-examples/bootique-rest-demo/)
* [2.x](https://github.com/bootique-examples/bootique-rest-demo/tree/2.x)
* [1.x](https://github.com/bootique-examples/bootique-rest-demo/tree/1.x)


## Bootique 3.x

To build and run the demo, ensure you have Java 11 or newer and then follow these steps:

### Checkout
```
git clone git@github.com:bootique-examples/bootique-rest-demo.git
cd bootique-rest-demo
```

### Build and package

This project uses a [runnable jar with lib folder](https://bootique.io/docs/3.x/bootique-docs/#runnable-jar-with-lib) 
packaging recipe:

```
mvn clean package
```
Now your app is packaged for distribution as `target/bootique-rest-demo-3.0.tar.gz` archive. But the unpacked version 
is also present in the `target` folder and can be used to run the app.

### Run

To print supported options help:
```
java -jar target/bootique-rest-demo-3.0.jar 
```

To run with default config, execute the following command and the open http://127.0.0.1:8080/
```
java -jar target/bootique-rest-demo-3.0.jar --server
```

To run with a custom config, expecute the following command then open http://127.0.0.1:9000/bq
```
java -jar target/bootique-rest-demo-3.0.jar --server --config=test.yml
```
