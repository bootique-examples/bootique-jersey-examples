Simple [Bootique](http://bootique.io) demo app. 

```
git clone git@github.com:andrus/bootique-rest-demo.git
cd bootique-rest-demo

mvn clean package
java -jar target/bootique-demo-0.0.1-SNAPSHOT.jar 
java -jar target/bootique-demo-0.0.1-SNAPSHOT.jar --server --config=test.yml
```

Then open [http://127.0.0.1:9000/bq](http://127.0.0.1:9000/bq).
