## Java and Maven versions used
```bash
JDK -  "11.0.8"
MAVEN - 3.9.2
```
## Run the tests locally
```bash
mvn clean verify
```

## Run the particular test, then use the tags as below command runs first scenario
```bash
mvn clean verify  -Dcucumber.filter.tags=@TaskA
```


## To see serenity tests report

```bash
access sampleRestAssuredSerenity/target/site/serenity/index.html
```
