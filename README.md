## Java and Maven versions used
```bash
JDK -  "11.0.8"
MAVEN - 3.9.2
```

## To run the tests locally
```bash
mvn clean verify
```

## To run the particular test, Use the tags as below command runs the first scenario which is tagged with @TaskA
```bash
mvn clean verify  -Dcucumber.filter.tags=@TaskA
```

## To see the serenity tests report

```bash
access sampleRestAssuredSerenity/target/site/serenity/index.html
```
